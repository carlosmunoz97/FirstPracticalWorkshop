package Package;

/**
 *
 * This class represents a car with some features
 *
 * @author Carlos Munoz
 */
public class Car {

    /**
     * Represents the brand of the car
     */
    private String brand;

    /**
     * Represents the model of the car
     */
    private String model;

    /**
     * Represents the color of the car
     */
    protected String color;

    /**
     * Represents the car's License
     */
    private String carsLicense;

    /**
     * Represents the cost of the car
     */
    protected float cost;

    /**
     * Creates an instance of the class CAR
     */
    public Car(String brand, String model, String color, String carsLicense, float cost){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.carsLicense = carsLicense;
        this.cost = cost;
    }

    /**
     * Changes the color of the car
     * @param color The color of the car
     */
    public void setColor(String color) {
        if(color != null)this.color = color;
    }

    /**
     * Changes the cost of the car
     * @param cost
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * Returns the brand of the car
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Returns the model of the car
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the color of the car
     * @return
     */
    public String getColor(){
        return color;
    }

    /**
     * Returns the car's license
     * @return
     */
    public String getCarsLicense() {
        return carsLicense;
    }

    /**
     * Returns the cost of the car
     * @return
     */
    public float getCost() {
        return cost;
    }
}
