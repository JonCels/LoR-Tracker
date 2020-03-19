package src;

import src.RegionT;
import src.RarityT;
import src.CardT;

public class Card{
    private int mana;
    private String name;
    private String[] keywords;
    private RegionT region;
    private RarityT rarity;
    private CardT cardType;
    private int duplicates;

    public Card(int mana, String name, String text, String[] keywords, RegionT region, RarityT rarity, CardT type, int duplicates){
        this.name = name;
        this.mana = mana;
        this.region = region;
        this.keywords = keywords;
        this.rarity = rarity;
        this.cardType = type;
        this.duplicates = duplicates;
    }

    public int getMana(){
        return this.mana;
    }

    public String getName(){
        return this.name;
    }

    public String[] listKeywords(){
        return this.keywords;
    }

    public RegionT getRegion(){
        return this.region;
    }

    public RarityT getRarity(){
        return this.rarity;
    }

    public CardT getCardType(){
        return this.cardType;
    }

    public int getDuplicates(){
        return this.duplicates;
    }
}