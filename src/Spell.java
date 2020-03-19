package src;

import src.SpeedT;
import src.RarityT;
import src.RegionT;
import src.Card;

public class Spell extends Card{
    private SpeedT speed;

    public Spell(int mana, String name, String text, String[] keywords, RegionT region, RarityT rarity, SpeedT speed, int duplicates){
        super(mana, name, text, keywords, region, rarity, CardT.Spell, duplicates);
        this.speed = speed;
    }

    public SpeedT getSpeed(){
        return this.speed;
    }
}