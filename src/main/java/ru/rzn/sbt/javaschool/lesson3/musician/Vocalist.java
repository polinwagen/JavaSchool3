package ru.rzn.sbt.javaschool.lesson3.musician;

public class Vocalist extends Musician {

    private static int number = 0;


    Vocalist(){}


    static String[] song = { "Take me to the magic of the moment",
                              "on a glory night",
                              "Where the children of tomorrow dream away",
                              "In the Wind of Change"};


    public String sing(){
        int i = number;
        if(number == 3) number = 0; else number++;
            return song[i]; }

    public  String playGuitar(){return null;}


}
