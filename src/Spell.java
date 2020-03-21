package lor_wintracker.src;

import lor_wintracker.src.SpeedT;
import lor_wintracker.src.RarityT;
import lor_wintracker.src.RegionT;
import lor_wintracker.src.Card;

public class Spell extends Card{
    private SpeedT speed;

    public Spell(int mana, String name, String[] keywords, RegionT region, RarityT rarity, SpeedT speed, int duplicates){
        super(mana, name, keywords, region, rarity, CardT.Spell, duplicates);
        this.speed = speed;
    }

    public SpeedT getSpeed(){
        return this.speed;
    }
}