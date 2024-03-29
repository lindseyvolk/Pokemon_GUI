package com.example.pokemonselector2;
import java.io.Serializable;
import java.util.*;

public class Player implements Serializable {

//import Pokemon;
        int player;
        int iterator = 0;
        int numAlive = 4;
        Pokemon currentPokemon;

        List<Pokemon> roster = new ArrayList<Pokemon>();


        public Player(int player) {
            this.player = player;
        }

        public Pokemon IsAlive() {
            if (currentPokemon.health <= 0) {
                iterator++;
                return currentPokemon = roster.get(iterator);
            }
            else {
                return currentPokemon;
            }
        }

        public int getPlayerNum() {
            return player;
        }

        public Pokemon getCurrentPokemon() {
            /*if (roster.get(iterator).getHealth() <= 0 && numAlive > 0 && iterator < 2) {
                iterator++;
                numAlive--;
            }
            return roster.get(iterator);

             */
            if (IsAlive(roster.get(iterator)  ) == false) {
                iterator++;
                numAlive--;
            }
                return roster.get(iterator);
        }


        public boolean IsAlive(Pokemon p) {
            if (p.health <= 0) {
                return false;
            }
            else {
                return true;
            }
        }

        /*
        public float getPokemonHealth() {
            if (iterator!=0)
                return (roster.get(iterator - 1)).health;
            else
                return (roster.get(iterator)).health;
        }

         */

        public int getNumberAlive()
        {
            return numAlive;

        }

    /*
	public void displayRoster() {
		for (int i = 0; i<4; i++) {
			System.out.print("Pokemon number " + (i+1) + " is ");
			String name = roster.get(i).getName();
			System.out.println(name);
		}
    }
    */

        public List<Pokemon> getRoster() {
            return roster;
        }

        public void addToRoster(Pokemon pokemon) {
            roster.add(pokemon);
        }

        //String name, String type, double health, double attack, double defense, int id
        //

    /*
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
		} else if (pokemonName.equals("Dratini")) {
			Pokemon pokemon = new Pokemon("Dratini", "Dragon", 60, 25, 6, 147);
		} else if (pokemonName.equals("Abra")) {
			Pokemon pokemon = new Pokemon("Abra", "Psychic", 100, 14, 14, 63);
		} else if (pokemonName.equals("Snorlax")) {
			Pokemon pokemon = new Pokemon("Snorlax", "Normal", 160, 6, 20, 143);
		}
		else {
			System.out.println("Something wrong");
			Pokemon pokemon = new Pokemon();
			return pokemon;
        }
        */



    }
