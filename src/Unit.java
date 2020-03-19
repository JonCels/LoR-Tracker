package lor_wintracker.src;

import lor_wintracker.src.RarityT;
import lor_wintracker.src.RegionT;
import lor_wintracker.src.Card;

public class Unit extends Card{
    private int power, health;
    private CardT cardType;
    private SubT subtype;

    public Unit(int mana, String name, String text, String[] keywords, RegionT region, RarityT rarity, int power, int health, CardT type, SubT subtype, int duplicates){
        super(mana, name, text, keywords, region, rarity, type, duplicates);
        this.power = power;
        this.health = health;
        this.cardType = type;
        this.subtype = subtype;
    }

    public int getPower(){
        return this.power;
    }

    public int getHealth(){
        return this.health;
    }

    public CardT getUnitType(){
        return this.cardType;
    }

    public SubT getSubtype(){
        return this.subtype;
    }
}
