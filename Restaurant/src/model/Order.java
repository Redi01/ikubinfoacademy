package model;

import java.util.Arrays;

public class Order {
    private static int ID = 0;
    private int id;
    private Dish[] dishes;
    private Customer customer;
    private int totalPrice;


    public int getCalories() {
        int caloriesSum = 0 ;

        for ( int i = 0 ; i < dishes.length ; i++ ) {
            caloriesSum+=dishes[i].getTotalCalories();
        }

        return caloriesSum;
    }

    public Long getPrice(){
        Long totalPrice = 0L;

        for ( int i = 0 ; i < dishes.length ; i++ ) {
            totalPrice +=dishes[i].getPrice();
        }

        return totalPrice;
    }

    public Order(Dish[] dishes, Customer customer) {
        this.id = ++ID;
        this.dishes = dishes;
        this.customer = customer;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dishes=" + Arrays.toString(dishes) +
                ", customer=" + customer +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
