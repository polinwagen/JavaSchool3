package ru.rzn.sbt.javaschool.lesson3.cards;

public class DecImpl implements Deck  {
    private CardImpl[][] cards = new CardImpl[4][9];

    public DecImpl(){
    for(int i=0;i<4;i++)
        for(int j=0;j<9;j++)
            cards[i][j]=new CardImpl(i,j);


    }

    public CardImpl getCard(int suit, int rank) {

        return cards[suit][rank];

    }

}





