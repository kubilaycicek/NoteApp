# MyNotePro
This is a spring boot application.API for notes.
![sb-sbdata-mongo-combine](https://user-images.githubusercontent.com/44985849/79386480-dbde4e00-7f72-11ea-816a-45e7257cd082.png)

## Using Tools & Technologies 
* Spring Boot  2.2.6
* Spring Boot Actuator
* Mongo Database
* Swagger UI 2.9.2
* Swagger 2.9.2
* Lombok 
* Java 11

## Notes
| Route  | HTTP Verb  |POST Body   |Description   |
|---|---|---|---|
| /api/v1/notes/list  |`GET`   |  Empty | List All Notes    
| /api/v1/notes/  |`POST`   | "note": { "content": "string", "id": "string", "noteType": { "description": "string", "id": "string", "title": "string" }, "title": "string" }  | Create a new note  |
| /api/v1/notes/  | `PUT`  | "note": { "content": "string", "id": "string", "noteType": { "description": "string", "id": "string", "title": "string" }, "title": "string" }  | Update a note with new info.   |
| /api/v1/notes/id  | `GET`  | Empty  | Update a note with new info.   |

## Note Type
| Route  | HTTP Verb  |POST Body   |Description   |
|---|---|---|---|
| /api/v1/note-type/list  |`GET`   |  Empty | List All Note Type    |
| /api/v1/note-type/  |`POST`   |{ "noteType": { "description": "string", "id": "string", "title": "string" } }   | Create a new note type  |
| /api/v1/note-type/  | `PUT`  | { "noteType": { "description": "string", "id": "string", "title": "string" } }  | Update a note type with new info.   |
| /api/v1/note-type/id  | `GET`  | Empty  | Update a note type with new info.   |



# UI (Web)

## Note List
![Ekran Alıntısı](https://user-images.githubusercontent.com/44985849/80319520-4b78f680-8819-11ea-93a1-b6bd3842deeb.PNG)

## New Note
![2](https://user-images.githubusercontent.com/44985849/80319526-5c296c80-8819-11ea-81e2-1a91a1468139.PNG)

## New Note Type
![3](https://user-images.githubusercontent.com/44985849/80319537-677c9800-8819-11ea-8867-d712198df1e0.PNG)

