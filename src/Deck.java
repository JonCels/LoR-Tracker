package src;

import src.Card;
import exceptions.*;

public class Deck{
    private static final int MAX_CARDS = 40, MAX_CHAMPS = 6, MAX_DUPLICATES = 3;
    private int champs, numCards;
    private String name;
    private double version;
    private int wins, losses;
    private int rank;
    private Card[] cards;

    public Deck(String name, Card[] cards){
        this.name = name;
        this.cards = cards;
        this.version = 0.0;
        this.wins = 0;
        this.losses = 0;
        
        this.countCards();
        if (this.getChamps() > MAX_CHAMPS){
            throw new TooManyChampionsException("More than 6 champions found");
        }

        if (this.numCards != MAX_CARDS) throw new InvalidCardNumberException("Invalid number of cards found");
    }

    public int getChamps(){
        return this.champs;
    }

    public int getWins(){
        return this.wins;
    }

    public int getLosses(){
        return this.losses;
    }

    public int getRank(){
        return this.rank;
    }

    public double getVersion(){
        return this.version;
    }

    public String getName(){
        return this.name;
    }

    public void setWins(int numWins){
        this.wins = numWins;
    }

    public void setLosses(int numLosses){
        this.losses = numLosses;
    }

    public void setString(String name){
        this.name = name;
    }

    public void setVersion(double version){
        this.version = version;
    }

    private void countCards(){
        for (Card card : this.cards){
            if (card.getDuplicates() > MAX_DUPLICATES) throw new TooManyDuplicatesException("Too many copies of " + card.getName());
            if (card.getCardType() == CardT.Champion){
                this.champs++;
            }
            this.numCards++;
        }
    }
}