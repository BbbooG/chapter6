package se233.chapter1.controller;


import se233.chapter1.model.DamageType;
import se233.chapter1.model.item.Armor;
import se233.chapter1.model.item.BasedEquipment;
import se233.chapter1.model.item.Weapon;

import java.util.ArrayList;

public class GenItemList{


    public static ArrayList<BasedEquipment> setUpItemList () {
        ArrayList<BasedEquipment> itemLists = new ArrayList<>(5);
        itemLists.add(new Weapon("Sword", 10, DamageType.Physical, "assets/sword1.png"));
        itemLists.add(new Weapon("Gun", 20, DamageType.Physical, "assets/gun1.png"));
        itemLists.add(new Weapon("Staff", 30, DamageType.Magical, "assets/staff1.png"));
        itemLists.add(new Weapon("Shield",250,DamageType.Physical,"assets/shield.png"));
        itemLists.add(new Armor("shirt", 0, 50, "assets/shirt1.png"));
        itemLists.add(new Armor("armor", 50, 0, "assets/armor1.png"));
        itemLists.add(new Armor("MagicDress", 80, 0, "assets/magicdress.png"));
        return itemLists;
    }
}
