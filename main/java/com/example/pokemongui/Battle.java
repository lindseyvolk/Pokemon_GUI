package com.example.pokemongui;

import java.io.*;
import java.util.*;
// import Pokemon;
// import Player;

// Have a battle between two Pokemon

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

    public void Attack() throws IOException {
        /*
        Here is where we will figure out types and effectiveness

        Damage multiplier will be in terms of P1 against P2

        double damage_multiplier = ....
        */

        int column_index = 0;
        double damage_multiplier = 1.0;


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

        if (getTurn() == 1) {
            double damage = damage_multiplier * p1.getCurrentPokemon().getAttack();
            p2.getCurrentPokemon().damage(damage);
            /* Printing for checking in IDE
            if (damage_multiplier > 1) {
                System.out.print("It's super effective");
                System.out.println();
            }
            else {
                System.out.print("It's not super effective");
                System.out.println();
            }
            */

        }
        else {
            double damage = (1 / damage_multiplier) * p2.getCurrentPokemon().getAttack();
            p1.getCurrentPokemon().damage(damage);
            /* Printing for checking in IDE
            if (1 / damage_multiplier > 1) {
                System.out.print("It's super effective");
                System.out.println();
            }
            else {
                System.out.print("It's not super effective");
                System.out.println();
            }
            */
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
        if (p2.getRoster().get(3).getHealth() <= 0) { // revert back to 3
            return 1;
        }
        else if (p1.getRoster().get(3).getHealth() <= 0) { // revert back to 3
            return 2;
        }
        else {
            return 0;
        }
    }

    // Main just for testing logic of backend, comment out completely for final implementation
    /*
    public static void main(String[] args) throws IOException {
        Player p1 = new Player(1);
        Pokemon poke1 = new Pokemon("Pikachu", "Electric", 90, 18, 10, 25);
        Pokemon poke2 = new Pokemon("Bulbasaur", "Grass", 110, 15, 13, 1);
        p1.addToRoster(poke1);
        p1.addToRoster(poke2);

        Player p2 = new Player(2);
        Pokemon poke3 = new Pokemon("Squirtle", "Water", 100, 17, 11, 7);
        Pokemon poke4 = new Pokemon("Onix", "Rock", 120, 9, 15, 95);
        p2.addToRoster(poke3);
        p2.addToRoster(poke4);

        Battle battle = new Battle(p1, p2);

        do {
            Scanner input = new Scanner(System.in);

            if (battle.getTurn() == 1) {
                System.out.print("Player 1 move: ");
            }
            else {
                System.out.print("Player 2 move: ");
            }

            String move = input.nextLine();
            System.out.println();

            if (move.equals("Attack")) {
                battle.Attack();
            }
            if (move.equals("Raise")) {
                battle.Raise();
            }
            if (move.equals("Defense")){
                battle.Defense();
            }

        } while (battle.Winner() == 0);


        if (battle.Winner() == 1) {
            System.out.println("Player 1 wins");
        }
        if (battle.Winner() == 2) {
            System.out.println("Player 2 wins");
        }
    }
    */
}

