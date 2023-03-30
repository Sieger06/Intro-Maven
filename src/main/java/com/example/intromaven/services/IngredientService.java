package com.example.intromaven.services;

import com.example.intromaven.model.Ingredient;

import java.util.ArrayList;


public interface IngredientService {
    int addIngredient (Ingredient ingredient);

    boolean removeIngredient(int id);

    boolean editIngredient(int id, Ingredient ingredient);

    String infoIngredient(int id);

    ArrayList<Ingredient> getAllIngredient ();

    Ingredient getIngredientById(int id);
}