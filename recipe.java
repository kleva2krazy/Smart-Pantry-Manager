package com.pantrymanager.app.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "recipes")
public class Recipe {
    @PrimaryKey(autoGenerate = true)
    public int recipeId;
    
    public String title;
    public String instructions;
    public String category; // e.g., "Breakfast", "Vegan"

    public Recipe(String title, String instructions, String category) {
        this.title = title;
        this.instructions = instructions;
        this.category = category;
    }
}