package model;

public class Restaurant {
    private static int ID = 0;
    private final Customer[] customers;
    private int id;
    private Order[] orders;

    private Dish[] dishes;

    private Ingredient[] ingredients ;

    private int orderId = 0;

    private int customerId = 0;

    private int dishId = 0;

    private int ingredientId = 0;

    public Restaurant() {
        this.id = ++ID;
        this.orders = new Order[100];
        this.customers = new Customer[20];
        this.dishes = new Dish[30];
        this.ingredients = new Ingredient[40];
    }

    public void addCustomer(Customer customer) {
        if (customerId >= 20) {
            System.out.println("Ka arrit limiti i punonjesve");
            return;
        }
        this.customers[customerId++] = customer;
    }

    public void addOrder(Order order) {
        if (orderId >= 100) {
            System.out.println("Ka arrit limiti i orders");
            return;
        }
        this.orders[orderId++] = order;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredientId >= 100) {
            System.out.println("Ka arrit limiti i orders");
            return;
        }
        this.ingredients[ingredientId++] = ingredient;
    }

    public void addDish(Dish dish) {
        if (dishId >= 30){
            System.out.println("Cannot add more dishes , kitchen is full");
            return;
        }
        dishes[dishId++] = dish;
    }

    public Order findMaxOrder() {
        Order maxOrder = orders[0];
        for (int i = 1; i < orderId; i++) {
            if (orders[i].getTotalPrice() > maxOrder.getTotalPrice()) {
                maxOrder = orders[i];
            }
        }
        return maxOrder;
    }

    public Dish[] getDishes() {
        return dishes;
    }



    public Ingredient[] getIngredients() {
        return ingredients;
    }


    public Customer findCustomerWithMostCalories() {

        Customer[] customers = new Customer[customerId];
        int customers_i = 0;
        int[] calories = new int[customerId + 1];

        A:
        for (int i = 0; i < orderId; i++) {
            for (int j = 0; j < customers.length; j++) {
                if (customers[j] != null && customers[j].getId() == orders[i].getCustomer().getId()) {
                    calories[j] += orders[i].getCalories();
                    continue A;
                }
            }
            customers[customers_i] = orders[i].getCustomer();
            calories[customers_i] += orders[i].getCalories();
            customers_i++;
        }
        int maxCal_I = 0;

        for (int i = 1; i < calories.length; i++) {
            if (calories[i] > calories[maxCal_I]) {
                maxCal_I = i;
            }
        }

        return customers[maxCal_I];
    }
    
    public Order findMaxCalorieOrder() {
    	
    	Order maxCalories = orders[0];
    	
    	for (int i=0; i<orderId; i++) {
    		
    		if(orders[i].getCalories() > 
    		maxCalories.getCalories()) {
    			
    			maxCalories = orders[i];
    			
    		}
    	}
    	
    	return maxCalories;
    	
    	
    	
    	
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Customer[] getCustomers() {
        return customers;
    }

}
