package com.example.pokemonselector2;

import java.io.*;
import java.util.*;

public class Battle {
    int turn = 0;
    Player p1;
    Player p2;
    boolean effective = false;

    public Battle(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getTurn() {
        if (turn % 2 == 0) {
            return 1;
        }
        else {
            return 2;
        }
    }

    public void Attack() { // {


        int column_index = 0;
        float damage_multiplier = 3;

       // p1.getCurrentPokemon().health -= 10.0;

/*
        BufferedReader reader = new BufferedReader(new FileReader("typeeffectiveness.csv")); // Change file path for final

        String row = reader.readLine();
        String[] data1 = row.split(",");
        for (int i = 0; i < 8; i++) {
            if (data1[i].equals(p1.getCurrentPokemon().getType())) {
                column_index = i;
            }
        }
        while ((row = reader.readLine()) != null) { // nextLine in place for row = reader.readNext()
            String[] data2 = row.split(",");
            if (data2[0].equals(p2.getCurrentPokemon().getType())) { // nextLine in place of data2
                damage_multiplier = Double.parseDouble(data2[column_index]); // nextLine in place of data2
            }
        }

        reader.close();
*/
        if (getTurn() == 1) {
            float finaldamage = damage_multiplier * p1.getCurrentPokemon().getAttack();
            p2.getCurrentPokemon().damage(finaldamage);


        }
        else {
            float finaldamage = (1 / damage_multiplier) * p2.getCurrentPokemon().getAttack();
            p1.getCurrentPokemon().damage(finaldamage);

        }
        turn++;
    }

    public void Defense() {
        if (getTurn() == 1) {
            p1.getCurrentPokemon().defUp();
        }
        else {
            p2.getCurrentPokemon().defUp();
        }
        turn++;
    }

    public void Raise() {
        if (getTurn() == 1) {
            p1.getCurrentPokemon().attUp();
        }
        else {
            p2.getCurrentPokemon().attUp();
        }
        turn++;
    }

    public int Winner() {
        if (p2.roster.get(1).health <= 0) { // revert back to 3
            return 1;
        }
        else if (p1.roster.get(1).health <= 0) { // revert back to 3
            return 2;
        }
        else {
            return 0;
        }
    }

}