package com.example.pokemonselector2;

import java.io.*;
import java.util.*;

public class Battle {
    int turn = 0;
    Player p1;
    Player p2;
    boolean effective = false;
    double damage_multiplier;

    public Battle(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getTurn() {
        if (turn % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public void Attack() {


        if (p1.getCurrentPokemon().getType() == "Water") {
            if (p2.getCurrentPokemon().getType() == "Electric" || p2.getCurrentPokemon().getType() == "Grass" || p2.getCurrentPokemon().getType() == "Dragon") {
                damage_multiplier = 0.75;
            } else if (p2.getCurrentPokemon().getType() == "Fire" || p2.getCurrentPokemon().getType() == "Rock") {
                damage_multiplier = 1.25;
            }
        } else if (p1.getCurrentPokemon().getType() == "Electric") {
            if (p2.getCurrentPokemon().getType() == "Rock" || p2.getCurrentPokemon().getType() == "Dragon") {
                damage_multiplier = 0.75;
            } else if (p2.getCurrentPokemon().getType() == "Water") {
                damage_multiplier = 1.25;
            }
        } else if (p1.getCurrentPokemon().getType() == "Fire") {
            if (p2.getCurrentPokemon().getType() == "Water" || p2.getCurrentPokemon().getType() == "Rock" || p2.getCurrentPokemon().getType() == "Dragon") {
                damage_multiplier = 0.75;
            } else if (p2.getCurrentPokemon().getType() == "Grass") {
                damage_multiplier = 1.25;
            }
        } else if (p1.getCurrentPokemon().getType() == "Grass") {
            if (p2.getCurrentPokemon().getType() == "Fire" || p2.getCurrentPokemon().getType() == "Dragon") {
                damage_multiplier = 0.75;
            } else if (p2.getCurrentPokemon().getType() == "Water" || p2.getCurrentPokemon().getType() == "Rock") {
                damage_multiplier = 1.25;
            }
        } else if (p1.getCurrentPokemon().getType() == "Rock") {
            if (p2.getCurrentPokemon().getType() == "Water" || p2.getCurrentPokemon().getType() == "Grass" || p2.getCurrentPokemon().getType() == "Psychic") {
                damage_multiplier = 0.75;
            } else if (p2.getCurrentPokemon().getType() == "Electric" || p2.getCurrentPokemon().getType() == "Fire") {
                damage_multiplier = 1.25;
            }
        } else if (p1.getCurrentPokemon().getType() == "Psychic") {
            if (p2.getCurrentPokemon().getType() == "Water" || p2.getCurrentPokemon().getType() == "Electric" || p2.getCurrentPokemon().getType() == "Fire" || p2.getCurrentPokemon().getType() == "Grass" || p2.getCurrentPokemon().getType() == "Dragon") {
                damage_multiplier = 1.25;
            } else if (p2.getCurrentPokemon().getType() == "Psychic") {
                damage_multiplier = 0.75;
            }
        } else if (p1.getCurrentPokemon().getType() == "Psychic") {
            if (p2.getCurrentPokemon().getType() == "Rock" || p2.getCurrentPokemon().getType() == "Dragon" || p2.getCurrentPokemon().getType() == "Psychic") {
                damage_multiplier = 1.25;
            }
        } else {
            damage_multiplier = 1;
        }


        if (getTurn() == 1) {
            double finaldamage = damage_multiplier * p1.getCurrentPokemon().getAttack();
            p2.getCurrentPokemon().damage(finaldamage);


        } else {
            double finaldamage = (1 / damage_multiplier) * p2.getCurrentPokemon().getAttack();
            p1.getCurrentPokemon().damage(finaldamage);

        }
        turn++;
    }

    public void Defense() {
        if (getTurn() == 1) {
            p1.getCurrentPokemon().defUp();
        } else {
            p2.getCurrentPokemon().defUp();
        }
        turn++;
    }

    public void Raise() {
        if (getTurn() == 1) {
            p1.getCurrentPokemon().attUp();
        } else {
            p2.getCurrentPokemon().attUp();
        }
        turn++;
    }

    public int Winner() {
        if (p2.roster.get(3).health <= 0) { // revert back to 3
            return 1;
        }
        if (p1.roster.get(3).health <= 0) { // revert back to 3
            return 2;
        }

        return 0;
    }

}