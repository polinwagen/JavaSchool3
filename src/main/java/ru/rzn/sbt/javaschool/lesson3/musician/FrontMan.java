package ru.rzn.sbt.javaschool.lesson3.musician;

public class FrontMan extends Musician {


    private static int number1 = 0;
    private static int number2 = 0;

    FrontMan(){}

    static String[] accords = { "C# G# F#",
             "C# G# F#",
             "Em E A5 C",
             "Em G Em G"};

    static String[] song = { "Take advantage while",
            "You hang me out to dry",
            "But I can't see you every night",
             "Free I do"};



    public String sing(){
        int i = number1;
        if(number1 == 3) number1 = 0; else number1++;
            return song[i]; }

    public  String playGuitar(){
        int i = number2;
        if(number2 == 3) number2 = 0; else number2++;
        return accords[i];}


}
