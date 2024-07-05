package com.gianidev.springfirestore.recipe.utils;

import com.gianidev.springfirestore.recipe.model.Recipe;
import com.gianidev.springfirestore.recipe.model.RecipeDocument;
import com.google.cloud.Timestamp;

public class RecipeMapper {

  public static RecipeDocument mapRecipeToRecipeDocument(Recipe recipe) {
    RecipeDocument recipeDocument = new RecipeDocument();
    recipeDocument.setId(recipe.getId());
    recipeDocument.setCreated(Timestamp.parseTimestamp(recipe.getCreated()));
    recipeDocument.setUpdated(Timestamp.parseTimestamp(recipe.getUpdated()));
    recipeDocument.setDifficulty(recipe.getDifficulty());
    recipeDocument.setName(recipe.getName());
    recipeDocument.setIngredients(recipe.getIngredients());
    recipeDocument.setFavorite(recipe.isFavorite());
    return recipeDocument;
  }

  public static Recipe mapRecipeDocumentToRecipe(RecipeDocument recipeDocument) {
    Recipe recipe = new Recipe();
    recipe.setId(recipeDocument.getId());
    recipe.setCreated(recipeDocument.getCreated().toString());
    recipe.setUpdated(recipeDocument.getUpdated().toString());
    recipe.setDifficulty(recipeDocument.getDifficulty());
    recipe.setName(recipeDocument.getName());
    recipe.setIngredients(recipeDocument.getIngredients());
    recipe.setFavorite(recipeDocument.isFavorite());
    return recipe;
  }
}