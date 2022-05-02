package Package;

/**
 * Represent an apartment with the representative features
 *
 * @author Carlos Munoz
 */
public class Apartment {
    /**
     * Represents the address where the apartment is located
     */
    private String address;

    /**
     * Represents the number of the apartment within the building
     */
    private String apartmentNumber;

    /**
     * Represents the owner of the apartment
     */
    private String owner;

    /**
     * Represents the number of rooms in the apartment
     */
    private int rooms;

    /**
     * Represents the area of the apartment
     */
    private float area;
    /**
     * represents the number of bathrooms in the apartment
     */
    private int bathrooms;

    /**
     * Represents the name of the building where the apartment is located
     */
    private String building;

    /**
     * Creates an instance of the class apartment
     * @param address the address where the apartment is located
     * @param apartmentNumber the number of the apartment within the building
     * @param owner the owner of the apartment
     * @param rooms the number of rooms in the apartment
     * @param area the area of the apartment
     * @param bathrooms the number of bathrooms in the apartment
     * @param building the name of the building where the apartment is located
     */
    public Apartment(String address, String apartmentNumber, String owner, int rooms, float area, int bathrooms, String building){
        this.address = address;
        this.apartmentNumber = apartmentNumber;
        this.owner = owner;
        this.rooms = rooms;
        this.area = area;
        this.bathrooms = bathrooms;
        this.building = building;
    }

    /**
     * Changes the owner of the apartment
     * @param owner The owner of the apartment
     */
    public void setOwner(String owner) {
        if(owner != null)this.owner = owner;
    }

    /**
     * returns the address of the apartment
     * @return the address of the apartment
     */
    public String getAddress() {
        return address;
    }

    /**
     * returns the number of the apartment
     * @return The number of the apartment
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Returns the owner of the apartment
     * @return The owner of the apartment
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Returns the rooms of the apartment
     * @return The number of rooms of the apartment
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Returns the area of the apartment
     * @return The area of the apartment
     */
    public float getArea() {
        return area;
    }

    /**
     * Returns the Bathrooms of the apartment
     * @return Number of rooms of the apartment
     */
    public int getBathrooms() {
        return bathrooms;
    }

    /**
     * Returns the name of the building
     * @return The  name of the building where the apartment is located
     */
    public String getBuilding() {
        return building;
    }
}
