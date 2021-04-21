package org.teinelund.food_database.api;

import java.util.HashMap;
import java.util.Map;

class FoodDatabaseImpl implements FoodDatabase {

    private String version;
    Map<Long, Food> foods = new HashMap<>();

    public FoodDatabaseImpl(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void addFood(Food food) {
        if (foods.containsKey(food.getId())) {
            return;
        }
        foods.put(food.getId(), food);
    }

    public int size() {
        return foods.size();
    }
}
