package com.gianidev.springfirestore.recipe.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

  private String id;
  private String created;
  private String updated;
  private Integer difficulty;
  private String name;
  private List<String> ingredients;
  private boolean favorite;
}