package Lab_11.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Animal {
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public Animal() {
        this("No type specified",null,0.0,0);
    }

    public Animal(String type, String[] continents, double weight, int age) {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getContinents() {
        return Arrays.copyOf(continents,continents.length);
    }

    public void setContinents(String[] continents) {
        if (continents != null)
            this.continents = Arrays.copyOf(continents,continents.length);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        String str = "Animal Type: " + getType() + "\nAnimal Weight: " + getWeight() +
                "\nAnimal Age: " + getAge() + "\nAnimal Continents: ";
        if(continents==null) { //i.e. no array object exists=>no continents either
            str += "No continents specified";
            return str;
        }

         /*if we get to here then there must have been an array object created
         so traverse it using a loop and "join" its contents to the existing
         string object*/
        for(int i = 0;i < getContinents().length; i++)
            str += continents[i] + " ";
        return str;
    }



}
