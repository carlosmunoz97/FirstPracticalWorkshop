package Package;

import java.util.ArrayList;

/**
 * Represents a restaurant
 */
public class Restaurant {
    /**
     * Represents the name of the restaurant
     */
    public String name;

    /**
     * Represents the address where teh restaurant is located
     */
    private String address;

    /**
     * Represents the menu of the day in the restaurant
     */
    private ArrayList<String> menu;

    /**
     * Represents the number of costumores in the restaurant
     */
    public float customers;

    /**
     * Represents the available capacity in the restaurant
     */
    public float availableCapacity;

    /**
     * Represents the names of every waiter working in the restaurant
     */
    private ArrayList<String> waiters;

    /**
     * Represents the capacity of the restaurant
     */
    public final float capacity;

    /**
     * Creates an instance of the class RESTAURANT
     * @param name The name of the restaurant
     * @param address The address of the restaurant
     * @param menu The menu of the restaurant
     * @param customers The number of costumers in the restaurant at the moment
     * @param waiters The waiters working at the moment in the restaurant
     * @param capacity Tha capacity of the restaurant
     */
    public Restaurant (String name, String address, ArrayList<String> menu, float customers, ArrayList<String> waiters, float capacity ){
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.customers = customers;
        this.waiters = waiters;
        this.capacity = capacity;
        calculateAvailableCapacity(this.customers,this.capacity);
    }

    /**
     * Add the menu of the day in the restaurant
     * @param menu The menu of the restaurant
     */
    public void setMenu(String menu) {
        if(menu != null) this.menu.add(menu);
    }

    /**
     * Changes the number of costumers in the restaurant
     * @param customers The number of costumers in the restaurant
     */
    public void setCustomers(float customers) {
        this.customers = customers;
    }

    /**
     * Changes the number of waiters working in the restaurant
     * @param waiter The number of waiters working
     */
    public void setWaiters(String waiter) {
        if(waiter != null) this.waiters.add(waiter);
    }

    /**
     * Returns the name of the restaurant
     * @return The name of the restaurant
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address of the restaurant
     * @return The address of the restaurant
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the menu of the restaurant
     * @return The Menu
     */
    public ArrayList<String> getMenu() {
        return menu;
    }

    /**
     * Calculate the available capacity of the restaurant
     * @param customers number of costumers at the moment in the restaurant
     * @param capacity capacity of the restaurant
     */
    private void calculateAvailableCapacity(float customers, float capacity){
        this.availableCapacity = capacity-customers;
    }

    /**
     * Returns the available capacity of the restaurant at the moment
     * @return The available capacity
     */
    public float getAvailableCapacity() {
        calculateAvailableCapacity(this.customers,this.capacity);
        return this.availableCapacity;
    }

    /**
     * Returns the number of waiters working in the restaurant at the moment
     * @return The number of waiters
     */
    public ArrayList<String> getWaiters() {
        return waiters;
    }

    /**
     * Returns the capacity of the restaurant
     * @return The capacity of the restaurant
     */
    public float getCapacity() {
        return capacity;
    }
}
