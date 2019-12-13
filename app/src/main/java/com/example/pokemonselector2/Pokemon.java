package com.example.pokemonselector2;

import java.io.Serializable;
import java.util.*;

public class Pokemon implements Serializable {
    String name;
    String type;
    float health;
    float attack; // EDIT: added
    float defense; // EDIT: added
    int id; // EDIT: added

    public Pokemon(String name, String type, float health, float attack, float defense, int id) { // added attack and defense
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getHealth() {
        return health;
    }

    public float getAttack() {
        return attack;
    }

    public float getDefense() {
        return defense;
    }

    public int getID() {
        return id;
    }

    // EDIT: Changed this method so we could factor in defense value
    public float damage(float damage) {
        damage = (100 - this.defense)/100 * damage;
        this.health = health - damage;
        return this.health;
        // System.out.println(this.health); // added for checking
    }

    // EDIT: Added these methods

    public float defUp() {
        this.defense = defense + 1; // maybe a different increment value/method of doing so
        //System.out.println(this.name + "'s defense rose!");
        //System.out.println();
        return this.defense;
    }

    public float attUp() {
        this.attack = attack + 1; // maybe a different increment value/method of doing so
        //System.out.println(this.name + "'s attack rose!");
        //System.out.println();
        return this.attack;
    }
}

// EDIT: changed everything with health to a DOUBLE instead of INT