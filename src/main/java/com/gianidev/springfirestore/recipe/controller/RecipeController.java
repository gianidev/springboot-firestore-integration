package com.gianidev.springfirestore.recipe.controller;

import com.gianidev.springfirestore.recipe.model.Recipe;
import com.gianidev.springfirestore.recipe.service.RecipeService;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

  @Autowired
  private final RecipeService recipeService;

  public RecipeController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @GetMapping
  public List<Recipe> getAllRecipes() throws ExecutionException, InterruptedException {
    return recipeService.getAllRecipes();
  }

  @GetMapping("/{id}")
  public Recipe getRecipeById(@PathVariable String id) {
    return recipeService.getRecipeById(id);
  }

  @PostMapping
  public void createRecipe(@RequestBody Recipe recipe) {
    recipeService.createRecipe(recipe);
  }

  @PutMapping("/{id}")
  public void updateRecipe(@PathVariable String id, @RequestBody Recipe recipe) {
    recipeService.updateRecipe(id, recipe);
  }

  @DeleteMapping("/{id}")
  public void deleteRecipe(@PathVariable String id) {
    recipeService.deleteRecipe(id);
  }
}