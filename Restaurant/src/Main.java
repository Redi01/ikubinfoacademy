import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Customer john = new Customer("John" , "Doe" , LocalDate.now() , "johndoe@gmail.com" , LocalDate.of(2000,12,14));
        Customer allison = new Customer("Allison" , "Mack" , LocalDate.now() , "allison@gmail.com" , LocalDate.of(2000,12,14));
        Customer somebody = new Customer("Somebody" , "Else" , LocalDate.now() , "somebody@gmail.com" , LocalDate.of(2000,12,14));

        restaurant.addCustomer(john);
        restaurant.addCustomer(allison);
        restaurant.addCustomer(somebody);

        Ingredient[] ingredients = new Ingredient[]{
                new Ingredient("Pasta",40L , true),
                new Ingredient("Minced Meat",40L , false),
                new Ingredient("Tomato",10L , true),
                new Ingredient("Olive Oil",20L , false),
                new Ingredient("Garlic" , 10L , true)
        } ;

        for (int i = 0 ; i < ingredients.length ; i++){
            restaurant.addIngredient(ingredients[0]);
        }

        Dish bolognesePasta = new Dish("Bolognese Pasta" ,ingredients , new long[]{50l,12l,34l,56l,10l} ,10L);
        Dish bologenesePizza = new Dish("Bolognese Pizza" ,ingredients , new long[]{50l,12l,34l,56l,10l} ,50L);
        Dish bologeneseBread = new Dish("Bolognese Bread" ,ingredients , new long[]{20l,12l,3l,4l,1l} ,25L);

        restaurant.addDish(bolognesePasta);
        restaurant.addDish(bologenesePizza);
        restaurant.addDish(bologeneseBread);

        restaurant.addOrder(new Order(new Dish[]{bologeneseBread} , john  ));
        restaurant.addOrder(new Order(new Dish[]{bologeneseBread, bologenesePizza} , john  ));
        restaurant.addOrder(new Order(new Dish[]{bolognesePasta, bologenesePizza} , allison  ));

        System.out.println("Max order" + restaurant.findMaxOrder());
        System.out.println("Customer with most calories" + restaurant.findCustomerWithMostCalories());

    }
}