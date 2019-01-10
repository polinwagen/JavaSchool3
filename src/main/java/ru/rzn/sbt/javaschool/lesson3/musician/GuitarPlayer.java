package ru.rzn.sbt.javaschool.lesson3.musician;

public class GuitarPlayer extends Musician{

    private static int number = 0;

    GuitarPlayer(){}


    static String[] accords = { "C G Dm G",
                                "C G",
                                "Dm G Am",
                                "Am/F G"};


    public String sing(){ return null; }

    public  String playGuitar(){
        int i = number;
        if(number == 3) number = 0; else number++;
            return accords[i];}

}
