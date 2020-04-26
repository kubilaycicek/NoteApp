$(document).ready(function () {
    $.getJSON("http://localhost:8080/api/v1/notes/list", function (result) {
        var text = "";
        result.noteList.forEach(function (item, index) {
            text += "<div class='col col-md-3 col-sm-6 col-lg-2'><div class='item'><div class='card'><div class='card-body'><h5 class='card-title'>" + item.title + "</h5><h6 class='card-subtitle mb-2 text-muted'>" + item.noteType.title + "</h6><p class='card-text'>" + item.content + "</p><a  type='button' class='card-link  btn btn-outline-success' data-toggle='modal' data-target='#noteDetailModal'>Read</a></div></div></div></div>";
        });
        $("#content").html(text);
    });

    $.getJSON("http://localhost:8080/api/v1/note-type/list", function (result) {
        var text = "";
        result.noteTypeList.forEach(function (item, index) {
            text += "<option value='" + item.id + "'>" + item.title + " </option>"
        });

        $("#noteType").html(text);
    });
});

function searchNotes() {
    var title = $("#searchNoteTitle").val();
    if (title == "") {
        alert("Please enter a title !");
    }

    $.getJSON("http://localhost:8080/api/v1/notes/list/" + title, function (result) {
        var text = "";
        result.noteList.forEach(function (item, index) {
            text += "<div class='col col-md-3 col-sm-6 col-lg-2'><div class='item'><div class='card'><div class='card-body'><h5 class='card-title'>" + item.title + "</h5><h6 class='card-subtitle mb-2 text-muted'>" + item.noteType.title + "</h6><p class='card-text'>" + item.content + "</p><a  type='button' class='card-link  btn btn-outline-success' data-toggle='modal' data-target='#noteDetailModal'>Read</a></div></div></div></div>";
        });
        $("#content").html("");
        $("#content").html(text);
    });
}

function saveNote() {
    var note_title = $("#title").val();
    var note_description = $("#description").val();
    var selected_note_type = $('#noteType :selected').text();
    var selected_note_type_id = $("#noteType :selected").val();

    if (note_title == "") {
        alert("Please enter a title !");
        return false;
    }
    if (note_description == "") {
        alert("Please enter a description !");
        return false;
    }
    if (selected_note_type_id == null) {
        alert("Please select a note type !");
        return false;
    }

    var requestBody = {
        note: {
            title: note_title,
            content: note_description,
            noteType: {
                id: selected_note_type_id,
                title: selected_note_type,
                description: ""
            }
        }
    };

    $.ajax({
        url: 'http://localhost:8080/api/v1/notes/',
        type: 'POST',
        contentType: "application/json",
        dataType: 'json',
        data: JSON.stringify(requestBody),
        success: function (result) {
            var text = "<div class='col col-md-3 col-sm-6 col-lg-2'><div class='item'><div class='card'><div class='card-body'><h5 class='card-title'>" + result.note.title + "</h5><h6 class='card-subtitle mb-2 text-muted'>" + result.note.noteType.title + "</h6><p class='card-text'>" + result.note.content + "</p><a  type='button' class='card-link  btn btn-outline-success' data-toggle='modal' data-target='#noteDetailModal'>Read</a></div></div></div></div>";

            $("#content").append(text);
            $("#title").val("");
            $("#description").val("");

            $("#note-result-content").html("<div class='alert alert-success' role='alert'>successful</div>");
            $("#note-result-content").delay(1000).hide("slow");

        },
        error: function (error) {
            $("#note-result-content").html("<div class='alert alert-danger' role='alert'>operation failed</div>");
        }
    });
}

function saveNoteType() {
    var note_type_title = $("#noteTypeTitle").val();
    var note_type_description = $("#noteTypeDescription").val();

    if (note_type_title == "") {
        alert("Please enter a title !");
        return false;
    }
    if (note_type_description == "") {
        alert("Please enter a description !");
        return false;
    }

    var requestBody = {
        noteType: {
            title: note_type_title,
            description: note_type_description
        }
    }

    $.ajax({
        url: 'http://localhost:8080/api/v1/note-type/',
        type: 'POST',
        contentType: "application/json",
        dataType: 'json',
        data: JSON.stringify(requestBody),
        success: function (result) {
            $("#noteType").append("<option value='" + result.noteType.id + "'>" + result.noteType.title + " </option>");
            $("#noteTypeTitle").val("");
            $("#noteTypeDescription").val("");
            $("#note-type-result-content").html("<div class='alert alert-success' role='alert'> operation successful</div>");
            $("#note-type-result-content").delay(1000).hide("slow");
        },
        error: function (error) {
            $("#note-type-result-content").html("<div class='alert alert-danger' role='alert'>operation failed</div>");
        }
    });
}