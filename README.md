# Spring Boot & Firestore Integration

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Firebase](https://img.shields.io/badge/firebase-ffca28?style=for-the-badge&logo=firebase&logoColor=black)

This project is a simple integration between Spring Boot and Firebase Admin SDK to interact with Firestore. It follows the tutorial from the Firebase documentation: [Get started with Cloud Firestore](https://firebase.google.com/docs/firestore/quickstart#java).

## Overview

In this example, I've created a data model called `Recipe` and a simple CRUD implementation for testing. Additionally, I've implemented a `FirestoreService` for handling Firestore operations. `FirestoreManager` is in charge to initialize the db.
`RecipeMapper` is responsible for mapping between `Recipe` and `RecipeDocument`, including converting `Timestamp` fields to `String` and vice versa.

## Project Structure

```
src/main/java/com/gianidev/springfirestore/
├── firestore
│ ├── service
│ │ └── FirestoreService.java
│ └── FirestoreManager.java
├── controller
│ └── RecipeController.java
├── model
│ ├── Recipe.java
│ └── RecipeDocument.java
├── service
│ └── RecipeService.java
└── utils
│ └──  RecipeMapper.java
└──  SpringfirestoreApplication.java
```

## Getting Started

1. Clone the repository.
2. Replace `src/main/resources/static/serviceAccountKey.json` with your Firebase service account key.
4. Build and run the project.

## API Endpoints

Below are the available API endpoints for managing recipes. Each endpoint includes details about the request and response formats.

### Get All Recipes

**Endpoint:** `GET /recipes`

Retrieve a list of all recipes.

**Request:** No request body is needed.

**Response:**

```json
[
  {
    "id": "1",
    "name": "Spaghetti Carbonara",
    "ingredients": ["Spaghetti", "Eggs", "Pancetta", "Parmesan Cheese", "Black Pepper"],
    "instructions": "Cook spaghetti. Fry pancetta. Mix eggs and cheese. Combine all with pasta."
  },
  {
    "id": "2",
    "name": "Margherita Pizza",
    "ingredients": ["Pizza Dough", "Tomato Sauce", "Mozzarella Cheese", "Basil"],
    "instructions": "Spread sauce on dough. Add cheese and basil. Bake in oven."
  }
]
```
-----
### Get Recipe By Id

**Endpoint:** `GET /recipes/{id}`

Retrieve a recipe by id.

**Request:** No request body is needed.

**Response:**

```json
{
    "id": "1",
    "name": "Spaghetti Carbonara",
    "ingredients": ["Spaghetti", "Eggs", "Pancetta", "Parmesan Cheese", "Black Pepper"],
    "instructions": "Cook spaghetti. Fry pancetta. Mix eggs and cheese. Combine all with pasta."
}
```

-----
### Update Recipe

**Endpoint:** `PUT /recipes/{id}`

Update a recipe by id.

**Body request:**

```json
{
    "id": "1",
    "name": "Spaghetti Carbonara",
    "ingredients": ["Spaghetti", "Eggs", "Pancetta", "Parmesan Cheese", "Black Pepper"],
    "instructions": "Cook spaghetti. Fry pancetta. Mix eggs and cheese. Combine all with pasta."
}
```

**Response:** No response is returned.

-----
### Delete Recipe By Id

**Endpoint:** `DELETE /recipes/{id}`

Deletes a recipe by id.

**Request:** No request body is needed.

**Response:** No response is returned.

-----

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
