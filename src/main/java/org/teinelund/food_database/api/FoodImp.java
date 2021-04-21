package org.teinelund.food_database.api;

class FoodImp implements Food {

    private long id;
    private String name;
    private double energyKcal;
    private double carbohydrates;
    private double protein;
    private double fat;
    private double fibers;

    public FoodImp(int id, String name, double energyKcal, double carbohydrates,
                   double protein, double fat, double fibers) {
        this.id = id;
        this.name = name;
        this.energyKcal = energyKcal;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.fat = fat;
        this.fibers = fibers;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getEnergyKcal() {
        return energyKcal;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getFibers() {
        return fibers;
    }
}
