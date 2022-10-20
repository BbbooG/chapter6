package se233.chapter1.model.character;

import se233.chapter1.model.DamageType;
import se233.chapter1.model.item.Armor;
import se233.chapter1.model.item.Weapon;

public class BasedCharacter{

    protected String name,imgpath;
    protected DamageType type;
    protected Integer fullHp, basedPow, basedDef, basedRes;
    protected Integer hp, power, defense,resistance;
    protected Weapon weapon;
    protected Armor armor;

    public String getName() {
        return name;
    }

    public String getImagepath() {
        return imgpath;
    }

    public Integer getHp() {return hp;}

    public Integer getFullHp() {
        return fullHp;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getResistance() {
        return resistance;
    }

    public DamageType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
    //newwwwwww
    public Integer getBasedPow() {
        return basedPow;
    }

    public void setBasedPow(Integer basedPow) {
        this.basedPow = basedPow;
    }
    public Integer getBasedDef() {
        return basedDef;
    }

    public void setBasedDef(Integer basedDef) {
        this.basedDef = basedDef;
    }

    public Integer getBasedRes() {
        return basedRes;
    }

    public void setBasedRes(Integer baseRes) {
        this.basedRes = baseRes;
    }

    public void unequipArmor(){
        this.armor = null ;
        this.defense = this.basedDef  ;
        this.resistance = this.basedRes  ;
    }

    public void unequipWeapon() {
        this.weapon = null;
        this.power = this.basedPow ;
    }
    //enddddddd


    public void equipWeapon(Weapon weapon) {
        this.weapon=weapon;
        this.power=this.basedPow+weapon.getPower();
    }
    public void equipArmor(Armor armor) {
        this.armor=armor;
        this.defense=this.basedDef+armor.getDefense();
        this.resistance=this.basedRes+armor.getResistance();
    }
}