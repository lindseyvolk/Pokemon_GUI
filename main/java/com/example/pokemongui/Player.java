package com.example.pokemongui;

import java.io.Serializable;
import java.util.*;

public class Player implements Serializable {

        int player;
        int iterator = 0;
        List<Pokemon> roster = new ArrayList<Pokemon>();

        Scanner input = new Scanner(System.in);

        public Player(int player) {
            this.player = player;
        }

        public int getPlayerNum() {
            return player;
        }

        public List<Pokemon> getRoster() {
            return roster;
        }

        public Pokemon getCurrentPokemon() {
            if (roster.get(iterator).getHealth() <= 0) {
                iterator++;
            }
            return roster.get(iterator);
        }

        public void addToRoster(Pokemon pokemon) {
            roster.add(pokemon);
        }


    }