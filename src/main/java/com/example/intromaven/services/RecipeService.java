package com.example.intromaven.services;

import com.example.intromaven.model.Recipe;

import java.util.ArrayList;

public interface RecipeService {
    int addRecipe (Recipe recipe);

    boolean editeRecipe(int id, Recipe recipe);

    boolean removeRecipe(int id);

    Recipe getRecipe (int id);

    ArrayList<Recipe> getAllRecipe();

    ArrayList<Recipe> getRecipeById(int id);

    ArrayList<Recipe> getRecipeByIngredients(int[] idIngredient);
}