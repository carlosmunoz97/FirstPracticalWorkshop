package Package;

/**
 * Represents a Person with representative features and interactions
 *
 * @author Carlos José Muñoz Cabrera
 */

import java.util.Date;

public class Person {
    /**
     * Represents the first and second name of the person
     */
    public String name;

    /**
     * Represents the first last name of the person
     */
    public String lastName1;

    /**
     * Represents the second last name of the person
     */
    public String lastName2;

    /**
     * Represents the date of birth
     */
    public Date dateBirth;

    /**
     * Represents the height of the person
     */
    public float height;

    /**
     * Creates an instance of the class PERSON
     * @param name The name of the person
     * @param lastName1 The first last name of the person
     * @param lastName2 The second last name of the person
     * @param dataBirth The date of birth of the person
     * @param height The height of the person
     */
    public Person(String name, String lastName1, String lastName2, Date dataBirth, float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dataBirth;
        this.height = height;
    }

    /**
     * Changes the name of the person
     * @param name The name of the person
     */
    public void setName(String name){
        if(name != null) this.name = name;
    }

    /**
     * Changes the first last name of the person
     * @param lastName1 The first last name of the person
     */
    public void setLastName1(String lastName1){
        if(lastName1 != lastName1) this.lastName1=lastName1;
    }

    /**
     * Changes the second last name of the person
     * @param lastName2 The second last name of the person
     */
    public void setLastName2(String lastName2){
        if(lastName2 != null) this.lastName2=lastName2;
    }

    /**
     * Changes the height of the person
     * @param height The height of the person
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Returns the name of the person
     * @return The name of the person
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the first last name of the person
     * @return The first last name of the person
     */
    public String getLastName1(){
        return lastName1;
    }

    /**
     * Returns the second last name of the person
     * @return The second last name of the person
     */
    public String getLastName2(){
        return lastName2;
    }

    /**
     * Returns the date of birth of the person
     * @return Date of birth of the person
     */
    public Date getDateBirth() { return dateBirth; }

    /**
     * Returns the height of the person
     * @return The height of the person
     */
    public float getHeight() {
        return height;
    }
}
