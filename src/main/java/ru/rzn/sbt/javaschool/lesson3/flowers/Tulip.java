package ru.rzn.sbt.javaschool.lesson3.flowers;

public class Tulip implements Flower {
    String name = "Tulip";

    Tulip(){
        String name = this.name;
    }
    public String whatIsYourName(){return name; }
}
