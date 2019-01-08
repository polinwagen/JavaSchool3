package ru.rzn.sbt.javaschool.lesson3.flowers;

public class Rose implements Flower {
    String name = "Rose";

    Rose(){
        String name = this.name;
    }
    public String whatIsYourName(){return name; }
}
