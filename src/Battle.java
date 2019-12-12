package com.example.testapp;

import java.io.*;
import java.util.*;

// Have a battle between two Pokemon

public class Battle {
    int turn = 0;
    Catch catch1;
    catch1.player1
    public void fight(Pokemon p1, Pokemon p2) throws IOException {
        String p1_type = p1.getType();
        String p2_type = p2.getType();

        /*
        Here is where we will figure out types and effectivness

        Damage multiplier will be in terms of P1 against P2

        double damage_multiplier = ....
        */

        int column_index = 0;
        double damage_multiplier = 1.0;

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\volkl\\AndroidStudioProjects\\TestApp\\app\\src\\main\\res\\raw")); // Change file path for final
        String row = reader.readLine();
        String[] data1 = row.split(",");
        for (int i = 0; i < 8; i++) {
            if (data1[i].equals(p1_type)) {
                column_index = i;
            }
        }

        while ((row = reader.readLine()) != null) {
            String[] data2 = row.split(",");
            if (data2[0].equals(p2_type)) {
                damage_multiplier = Double.parseDouble(data2[column_index]);
            }
        }

        reader.close();
        System.out.print(damage_multiplier); // print for checking purposes

        // double damage_multiplier = 2.0; // SET to 2.0 for example

        // Not sure how to do the move input though, so using String for input

        // Generic counter for keeping track of turns, even is P1, odd P2
        int turn = 0; //initialized above

        Scanner input = new Scanner(System.in);

        while (p1.getHealth() > 0 && p2.getHealth() > 0) {
            if (turn % 2 == 0) {
                System.out.print("Player 1 move: ");
            }
            else {
                System.out.print("Player 2 move: ");
            }

            String move = input.nextLine();
            System.out.println();

            if (turn % 2 == 0) {
                if (move.equals("Attack")) {
                    double damage = damage_multiplier * p1.getAttack();
                    p2.damage(damage);
                    if (damage_multiplier > 1) {
                        System.out.print("It's super effective");
                        System.out.println();
                    }
                    else {
                        System.out.print("It's not super effective");
                        System.out.println();
                    }
                }
                else if (move.equals("Shield")) {
                    p1.defUp();
                }
                else if (move.equals("Attack Up")) {
                    p1.attUp();
                }
            }
            else {
                if (move.equals("Attack")) {
                    double damage = (1/damage_multiplier) * p2.getAttack();
                    p1.damage(damage);
                    if (1/damage_multiplier > 1) {
                        System.out.print("It's super effective");
                        System.out.println();
                    }
                    else {
                        System.out.print("It's not super effective");
                        System.out.println();
                    }
                }
                else if (move.equals("Shield")) {
                    p2.defUp();
                }
                else if (move.equals("Attack Up")) {
                    p2.attUp();
                }
            }

            // Increment for turns
            turn++;
        }
        if (p1.getHealth() <= 0) {
            System.out.println(p1.getName() + " lost!");
        }
        else if (p2.getHealth() <= 0) {
            System.out.println(p2.getName() + " lost!");
        }
    }

    public int getTurn() {
        return turn;
    }

    /* Main just for testing, need to comment out in
    public static void main(String[] args) throws IOException {
        Pokemon p1 = new Pokemon("Pikachu", "Electric", 100, 15, 13, 1);
        Pokemon p2 = new Pokemon("Squirtle", "Water", 100, 14, 18, 2);
        fight(p1, p2);
    }
    */

}
