package com.example.pokemongui;

import java.io.Serializable;
import java.util.*;

public class Pokemon implements Serializable {
    String name;
    String type;
    double health;
    double attack;
    double defense;
    int id;

    public Pokemon(String name, String type, double health, double attack, double defense, int id) {
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

    public double getHealth() {
        return health;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public int getID() {
        return id;
    }


    public void damage(double damage) {
        damage = (100.0 - this.defense)/100 * damage;
        this.health = health - damage;
    }


    public void defUp() {
        this.defense = defense + 1;
    }

    public void attUp() {
        this.attack = attack + 1;
    }
}

