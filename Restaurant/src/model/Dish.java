package model;

import java.util.Arrays;

public class Dish {
    private static int ID = 0;
    private int id;
    private String title;
    private Ingredient[] ingredients;

    private long[] ingredientQuantity;
    private Long price;

    public int getTotalCalories() {
        int calories = 0;

        for (int i = 0 ; i < ingredients.length ; i++ ){
            calories += ingredients[i].getCaloriesPer100g() * ingredientQuantity[i];
        }
        return calories;
    }

    public Dish(String title, Ingredient[] ingredients, long[] ingredientQuantity, Long price) {
        ID++;
        this.id = ID;
        this.title = title;
        this.ingredients = ingredients;
        this.ingredientQuantity = ingredientQuantity;
        this.price = price;
    }

    public long[] getIngredientQuantity() {
        return ingredientQuantity;
    }

    public void setIngredientQuantity(long[] ingredientQuantity) {
        this.ingredientQuantity = ingredientQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", ingredientQuantity=" + Arrays.toString(ingredientQuantity) +
                ", price=" + price +
                '}';
    }
}
