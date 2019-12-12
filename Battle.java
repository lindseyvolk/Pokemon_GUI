import java.io.*;
import java.util.*;

// Have a battle between two Pokemon

public class Battle {
    int turn = 0;
    Player p1;
    Player p2;
    boolean effective = false;

    public void Battle(Player p1, Player p2) {
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
	
	public int Winner() {
		if (p2.getRoster().get(3).getHealth() <= 0) {
			return 1;
		} else if (p1.getRoster().get(3).getHealth() <= 0) {
			return 2;
		} else {
			return 0;
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

        BufferedReader reader = new BufferedReader(new FileReader("/Users/coopersalmon/Documents/Fourth Year/Project/TypeEffectiveness.csv")); // Change file path for final
        String row = reader.readLine();
        String[] data1 = row.split(",");
        for (int i = 0; i < 8; i++) {
            if (data1[i].equals(p1.getCurrentPokemon().getType())) {
                column_index = i;
            }
        }

        while ((row = reader.readLine()) != null) {
            String[] data2 = row.split(",");
            if (data2[0].equals(p2.getCurrentPokemon().getType())) {
                damage_multiplier = Double.parseDouble(data2[column_index]);
            }
        }

        reader.close();

        if (getTurn() == 1) {
            double damage = damage_multiplier * p1.getCurrentPokemon().getAttack();
            p2.getCurrentPokemon().damage(damage);
            if (damage_multiplier > 1) {
                System.out.print("It's super effective");
                System.out.println();
            }
            else {
                System.out.print("It's not super effective");
                System.out.println();
            }
        }
        else {
            double damage = (1 / damage_multiplier) * p2.getCurrentPokemon().getAttack();
            p1.getCurrentPokemon().damage(damage);
            if (1 / damage_multiplier > 1) {
                System.out.print("It's super effective");
                System.out.println();
            }
            else {
                System.out.print("It's not super effective");
                System.out.println();
            }
        }
		turn++;
    }

    public void Defense() {
        if (getTurn() % 2 == 0) {
            p1.getCurrentPokemon().defUp();
        }
        else {
            p2.getCurrentPokemon().defUp();
        }
		turn++;
    }

    public void Raise() {
        if (getTurn() % 2 == 0) {
            p1.getCurrentPokemon().attUp();
        }
        else {
            p2.getCurrentPokemon().attUp();
        }
		turn++;
    }
	

    //Main just for testing, need to comment out in
    /*
    public void main(String[] args) throws IOException {
        Pokemon p1 = new Pokemon("Pikachu", "Electric", 100, 15, 13, 1);
        Pokemon p2 = new Pokemon("Squirtle", "Water", 100, 14, 18, 2);
        NewBattle battle = new NewBattle();
        battle.Attack(p1, p2);
    }
    */
}
