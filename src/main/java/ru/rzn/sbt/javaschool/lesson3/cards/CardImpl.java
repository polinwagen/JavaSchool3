package ru.rzn.sbt.javaschool.lesson3.cards;

enum Dignity {

    туз, шестёрка, семёрка, восьмёрка, девятка, десятка, валет, дама, король;

}

enum Suit {

    бубны, трефы, червы, пики;

         /*
         private int number;

         Suit(int n) {
             number = n;
         }

         int getNumber() {
             return number;
         }
         */

}


public class CardImpl implements Card {
    private int suit;
    private int rank;


    public CardImpl(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }



    @Override
    public String toString() {
        for (Suit s : Suit.values())
            for (Dignity d : Dignity.values())
                if (suit == s.ordinal() && rank == d.ordinal())
                    return d + " " + s;

        return "";
    }
}