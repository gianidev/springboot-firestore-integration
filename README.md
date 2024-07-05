# Spring Boot Firebase Firestore Integration

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

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
