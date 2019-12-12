import java.util.*;

public class Pokemon {
	String name;
	String type;
    double health;
    double attack; // EDIT: added
    double defense; // EDIT: added
    int id; // EDIT: added
    
	public Pokemon(String name, String type, double health, double attack, double defense, int id) { // added attack and defense
		this.name = name;
		this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public double getHealth() {
		return health;
	}
    
    public double getAttack() {
        return attack;
    }
    
    public double getDefense() {
        return defense;
    }

    public int getID() {
        return id;
    }

    // EDIT: Changed this method so we could factor in defense value
	public void damage(double damage) { 
        damage = (100.0 - this.defense)/100 * damage;
        this.health = health - damage;
        // System.out.println(this.health); // added for checking
	}

    // EDIT: Added these methods

    public void defUp() {
        this.defense = defense + 1; // maybe a different increment value/method of doing so
        System.out.println(this.name + "'s defense rose!");
        System.out.println();
    }

    public void attUp() {
        this.attack = attack + 1; // maybe a different increment value/method of doing so
        System.out.println(this.name + "'s attack rose!");
        System.out.println();
    }
}

// EDIT: changed everything with health to a DOUBLE instead of INT