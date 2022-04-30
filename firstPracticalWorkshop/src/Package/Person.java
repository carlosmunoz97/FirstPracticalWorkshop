package Package;

import java.util.Date;

public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    public Person(String name, String lastName1, String lastName2, Date dataBirth, float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dataBirth;
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName1(String lastName1){
        this.lastName1=lastName1;
    }

    public void setLastName2(String lastName2){
        this.lastName2=lastName2;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public String getLastName1(){
        return lastName1;
    }

    public String getLastName2(){
        return lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public float getHeight() {
        return height;
    }
}
