package lor_wintracker.src;

import lor_wintracker.src.RarityT;
import lor_wintracker.src.RegionT;
import lor_wintracker.src.Card;
import lor_wintracker.src.Unit;

public class Champion extends Unit{
    private String levelCond;
    private Champion levelUp;
    private Spell champSpell;

    public Champion(int mana, String name, String text, String[] keywords, RegionT region, RarityT rarity, int power, int health, SubT subtype, String levelCond, Champion level, Spell spell, int duplicates){
        super(mana, name, text, keywords, region, rarity, power, health, CardT.Champion, subtype, duplicates);
        this.levelCond = levelCond;
        this.levelUp = level;
        this.champSpell = spell;
    }

    public String getCond(){
        return this.levelCond;
    }

    public Card getLevelled(){
        return this.levelUp;
    }

    public Card getSpell(){
        return this.champSpell;
    }
}