package org.teinelund.food_database.api;

public class FoodFactory {

    public Food createFood(int id, String name, double energyKcal, double carbohydrates,
                           double protein, double fat, double fibers) {
        return new FoodImp(id, name, energyKcal, carbohydrates,
        protein, fat, fibers);
    }

    public FoodDatabase createFoodDatabase(String version) {
        return new FoodDatabaseImpl(version);
    }
}
