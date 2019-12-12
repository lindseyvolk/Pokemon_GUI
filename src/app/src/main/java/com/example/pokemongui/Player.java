package com.example.pokemongui;

import java.io.Serializable;
import java.util.*;

public class Player implements Serializable {
    int player;

    public Player(int player) {
        this.player = player;
    }

    List<Pokemon> roster = new ArrayList<Pokemon>();


    public int getPlayerNum() {
        return player;
    }

    public void addToRoster(Pokemon pokemon) {
        roster.add(pokemon);
    }

    // DO WE NEED THIS?
    public Pokemon getPokemon(String pokemonName) {
        if (pokemonName.equals("Bulbasaur")) {
            Pokemon pokemon = new Pokemon("Bulbasaur", "Grass", 110, 15, 13, 1);
            return pokemon;
        } else if (pokemonName.equals("Charmander")) {
            Pokemon pokemon = new Pokemon("Charmander", "Fire", 80, 20, 9, 4);
            return pokemon;
        } else if (pokemonName.equals("Squirtle")) {
            Pokemon pokemon = new Pokemon("Squirtle", "Water", 100, 17, 11, 7);
            return pokemon;
        } else if (pokemonName.equals("Pikachu")) {
            Pokemon pokemon = new Pokemon("Pikachu", "Electric", 90, 18, 10, 25);
            return pokemon;
        } else if (pokemonName.equals("Onix")) {
            Pokemon pokemon = new Pokemon("Onix", "Rock", 120, 9, 15, 95);
            return pokemon;
        } else if (pokemonName.equals("Dratini")) {
            Pokemon pokemon = new Pokemon("Dratini", "Dragon", 60, 25, 6, 147);
            return pokemon;
        } else if (pokemonName.equals("Abra")) {
            Pokemon pokemon = new Pokemon("Abra", "Psychic", 100, 14, 14, 63);
            return pokemon;
        } else if (pokemonName.equals("Snorlax")) {
            Pokemon pokemon = new Pokemon("Snorlax", "Normal", 160, 6, 20, 143);
            return pokemon;
        }
        else {
            Pokemon pokemon = new Pokemon("Bulbasaur", "Grass", 110, 15, 13, 1);
            return pokemon;
        }
    }

}
