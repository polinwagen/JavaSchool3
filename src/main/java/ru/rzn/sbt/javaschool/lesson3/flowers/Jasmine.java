package ru.rzn.sbt.javaschool.lesson3.flowers;

public class Jasmine implements Flower {
    String name = "Jasmine";

    Jasmine(){
        String name = this.name;
    }
    public String whatIsYourName(){return name; }
}
