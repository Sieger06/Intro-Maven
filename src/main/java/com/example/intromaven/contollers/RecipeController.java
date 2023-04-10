package com.example.intromaven.contollers;

import org.springframework.web.bind.annotation.*;
import com.example.intromaven.model.Recipe;
import com.example.intromaven.services.RecipeService;

import java.util.ArrayList;

@RestController
@RequestMapping()
public class RecipeController {
    private final RecipeService recipeService;
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @PostMapping()
    public String addRecipe (@RequestBody Recipe recipe){
        return "Рецепт успешно добавлен (ID: " + recipeService.addRecipe(recipe) + ")";
    }
    @PutMapping("{id}")
    public boolean editRecipe (@PathVariable("id") int id, @RequestBody Recipe recipe){
        return recipeService.editeRecipe(id, recipe);
    }
    @DeleteMapping()
    public boolean removeRecipe (@PathVariable("id") int id, @RequestBody Recipe recipe){
        return recipeService.editeRecipe(id, recipe);
    }
    @GetMapping("{id}")
    public Recipe getRecipe(@PathVariable int id){
        return recipeService.getRecipe(id);

    }
    @GetMapping("/all")
    public ArrayList<Recipe> getAllRecipe(){
        return recipeService.getAllRecipe();
    }
    @GetMapping("/byId/{id}")
    public ArrayList<Recipe> getRecipeByIngredient(@PathVariable("ids") int... ids){
        return recipeService.getRecipeByIngredients(ids);
    }
}