package com.gianidev.springfirestore.recipe.model;

import com.google.cloud.Timestamp;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDocument {

  private String id;
  private Timestamp created;
  private Timestamp updated;
  private Integer difficulty;
  private String name;
  private List<String> ingredients;
  private boolean favorite;
}