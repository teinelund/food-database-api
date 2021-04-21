package org.teinelund.food_database.api;

public interface Food {
    long getId();
    String getName();
    double getEnergyKcal();
    double getCarbohydrates();
    double getProtein();
    double getFat();
    double getFibers();
}
