package com.pantrymanager.app.models;

import java.util.List;

public class RecipeWithIngredients {
    public Recipe recipe;
    public List<RecipeRequirement> requirements;

    public RecipeWithIngredients(Recipe recipe, List<RecipeRequirement> requirements) {
        this.recipe = recipe;
        this.requirements = requirements;
    }
}