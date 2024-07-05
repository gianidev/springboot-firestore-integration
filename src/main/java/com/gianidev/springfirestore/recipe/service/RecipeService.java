package com.gianidev.springfirestore.recipe.service;


import com.gianidev.springfirestore.firestore.service.FirestoreService;
import com.gianidev.springfirestore.recipe.model.Recipe;
import com.gianidev.springfirestore.recipe.model.RecipeDocument;
import com.gianidev.springfirestore.recipe.utils.RecipeMapper;
import com.google.cloud.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

  private final FirestoreService firestoreService;

  public RecipeService(FirestoreService firestoreService) {
    this.firestoreService = firestoreService;
  }

  public List<Recipe> getAllRecipes()
      throws ExecutionException, InterruptedException {
    List<RecipeDocument> documents = firestoreService.getDocuments("recipes", RecipeDocument.class);
    List<Recipe> result = new ArrayList<>();
    for (RecipeDocument recipe : documents) {
      result.add(RecipeMapper.mapRecipeDocumentToRecipe(recipe));
    }
    return result;
  }

  public Recipe getRecipeById(String id) {
    RecipeDocument document = firestoreService.getDocument("recipes/" + id, RecipeDocument.class);
    return RecipeMapper.mapRecipeDocumentToRecipe(document);
  }


  public void createRecipe(Recipe recipe) {
    RecipeDocument recipeDocument = RecipeMapper.mapRecipeToRecipeDocument(recipe);
    recipeDocument.setCreated(Timestamp.now());
    recipeDocument.setUpdated(Timestamp.now());
    firestoreService.postData("recipes/" + recipeDocument.getId(), recipeDocument);
  }

  public void updateRecipe(String id, Recipe recipe) {
    RecipeDocument recipeDocument = RecipeMapper.mapRecipeToRecipeDocument(recipe);
    recipeDocument.setUpdated(Timestamp.now());
    firestoreService.postData("recipes/" + id, recipeDocument);
  }

  public void deleteRecipe(String id) {
    firestoreService.deleteData("recipes/" + id);
  }
}