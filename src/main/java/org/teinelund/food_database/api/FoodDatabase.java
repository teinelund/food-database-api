package org.teinelund.food_database.api;

public interface FoodDatabase {
    String getVersion();
    void addFood(Food food);
    int size();
}
