import java.io.*;
import java.util.*;
import Pokemon;
import Player;

// Have a battle between two Pokemon

public class NewBattle {
    int turn = 0;
    Player p1;
    Player p2;
    boolean effective = false;

    public void NewBattle(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getTurn() {
        return turn;
    }

    public void Attack() throws IOException {
        String p1_type = p1.getType();
        String p2_type = p2.getType();

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

        if (getTurn() % 2 == 0) {
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
        else {
            double damage = (1 / damage_multiplier) * p2.getAttack();
            p1.damage(damage);
            if (1 / damage_multiplier > 1) {
                System.out.print("It's super effective");
                System.out.println();
            }
            else {
                System.out.print("It's not super effective");
                System.out.println();
            }
        }
    }

    public void Shield(Pokemon p1, Pokemon p2) {
        if (getTurn() % 2 == 0) {
            p1.defUp();
        }
        else {
            p2.defUp();
        }
    }

    public void RaiseAttack(Pokemon p1, Pokemon p2) {
        if (getTurn() % 2 == 0) {
            p1.attUp();
        }
        else {
            p2.attUp();
        }
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
