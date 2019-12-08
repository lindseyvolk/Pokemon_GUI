import java.io.*;
import java.util.*;

public class PokemonBattleTest {
    public static void main(String[] args) throws FileNotFoundException {
		int health1 = 20;
		int health2 = 20;
		int turn = 0;
		//Pokemon(String name, String type, int health, String[] moves)
		//String[] bulbasaurMoves = new String[4];
		
		//Pokemon[] Player1 = new Pokemon[4];
		
		
		Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Grass", 20/*, bulbasaurMoves[]*/);
		Pokemon Charmander = new Pokemon("Charmander", "Fire", 20/*, bulbasaurMoves[]*/);
		System.out.println(Bulbasaur.getName());
		
		Scanner input = new Scanner(System.in);
		//turn possibilities:
		// attack (5 hp)
		// potion (3 hp)
		// 	
		while (Bulbasaur.getHealth() > 0 && Charmander.getHealth() > 0) {
			if (turn == 0) {
				System.out.print("Player 1 move: ");
			} else {
				System.out.print("Player 2 move: ");
			}
			String move = input.nextLine();
			System.out.println();
			if (turn == 0) {
				if (move.equals("attack")) {
					Charmander.damage(5);
				} else if (move.equals("potion")) {
					health1 = health1 + 3;
				}
				turn = 1;
			} else if (turn == 1) {
				if (move.equals("attack")) {
					Bulbasaur.damage(5);
				} else if (move.equals("potion")) {
					health2 = health2 + 3;
				}
				turn = 0;

			}
			System.out.println("Player 1 health: " + Bulbasaur.getHealth());
			System.out.println("Player 2 health: " + Charmander.getHealth());			
		}
		if (Bulbasaur.getHealth() <= 0) {
			System.out.println("Player 2 wins");
		} else if (health2 <= 0) {
			System.out.println("Player 1 wins");
		}
	
	}
}