package com.pantrymanager.app.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.pantrymanager.app.models.PantryItem;
import com.pantrymanager.app.models.Recipe;
import com.pantrymanager.app.models.RecipeRequirement;

@Database(entities = {PantryItem.class, Recipe.class, RecipeRequirement.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public abstract PantryDao pantryDao();
    public abstract RecipeDao recipeDao();

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "smart_pantry_db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries() // Note: For a real app, use Background Threads. For assignments, this simplifies things.
                    .build();
        }
        return instance;
    }
}