package model;

public class Ingredient {
    private static int ID = 0;
    private int id;
    private String name;
    private Long caloriesPer100g;
    private boolean vegetarian;

    public Ingredient(String name, Long caloriesPer100g, boolean vegeterian) {
        ID++;
        this.id = ID;
        this.name = name;
        this.caloriesPer100g = caloriesPer100g;
        this.vegetarian = vegeterian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCaloriesPer100g() {
        return caloriesPer100g;
    }

    public void setCaloriesPer100g(Long caloriesPer100g) {
        this.caloriesPer100g = caloriesPer100g;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", caloriesPer100g=" + caloriesPer100g +
                ", vegetarian=" + vegetarian +
                '}';
    }
}
