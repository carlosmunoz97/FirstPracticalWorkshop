package Package;

/**
 * Represents a Fruit with some features
 */

import java.util.ArrayList;

public class Fruit {
    /**
     * Represents the name of the fruit
     */
    public String name;

    /**
     * Represents the average weight of the fruit
     */
    private float averageWeight;

    /**
     * Represents the colors of the fruit
     */
    public ArrayList<String> colors;

    /**
     * Creates an instance of the class FRUIT
     * @param name The name of the fruit
     * @param averageWeight The average weight of the fruit
     * @param colors The colors of the fruit
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors){
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Add a color to the Colors of the fruit
     * @param name A color
     */
    public void setColor(String name) {
        if(name != null) {
            boolean exists = colors.contains(name);
            if (!exists) this.colors.add(name);
        }
    }

    /**
     * Delete a color of the Colors in the fruit
     * @param name A color
     */
    public void deleteColor (String name){
        if(name != null) {
            int position = colors.indexOf(name);
            if (position != -1) colors.remove(position);
        }
    }

    /***
     * Returns the colors in the fruit
     * @return List of colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /***
     * Returns the average weight of the fruit
     * @return The average weight
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Returns the name of the fruit
     * @return returns the name of the fruit
     */
    public String getName() {
        return name;
    }
}
