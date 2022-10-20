package se233.chapter1.model.item;


public class Armor extends BasedEquipment{

    private  int defence,resistance;

    public  Armor(String name,int defence,int resistance,String imgpath){
        this.name = name;
        this.imgpath = imgpath;
        this.defence =defence;
        this.resistance =resistance;
    }

    public int getDefense() {
        return defence;
    }

    public void setDefense(int defence) {
        this.defence = defence;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return name;
    }
}

