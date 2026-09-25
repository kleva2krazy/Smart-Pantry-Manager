package com.pantrymanager.app.database;

import androidx.room.*;
import com.pantrymanager.app.models.PantryItem;
import java.util.List;

@Dao
public interface PantryDao {
    @Insert
    void insert(PantryItem item);

    @Update
    void update(PantryItem item);

    @Delete
    void delete(PantryItem item);

    @Query("SELECT * FROM pantry_items ORDER BY name ASC")
    List<PantryItem> getAllPantryItems();
}