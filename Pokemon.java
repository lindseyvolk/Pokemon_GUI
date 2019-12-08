import java.util.*;

public class Pokemon {
	String name;
	String type;
	int health;
	String[] moves;
	
	public Pokemon(String name, String type, int health/*, String moves*/) {
		this.name = name;
		this.type = type;
		this.health = health;
		//this.moves = moves;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHealth() {
		return health;
	}
	
	/*public String[] getMoves() {
		return moves;
	}*/
	
	public void damage(int damage) {
		this.health = health - damage;
	}


}