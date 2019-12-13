if (player1.getCurrentPokemon().getType() == "Water") {
	if (player2.getCurrentPokemon().getType() == "Electric" || player2.getCurrentPokemon().getType() == "Grass" || player2.getCurrentPokemon().getType() == "Dragon") {
		damage_multiplier = 0.75;
	} else if (player2.getCurrentPokemon().getType() == "Fire" || player2.getCurrentPokemon().getType() == "Rock") {
		damage_multiplier = 1.25;
	}
} else if (player1.getCurrentPokemon().getType() == "Electric") {
	if (player2.getCurrentPokemon().getType() == "Rock" || player2.getCurrentPokemon().getType() == "Dragon") {
		damage_multiplier = 0.75;
	} else if (player2.getCurrentPokemon().getType() == "Water") {
		damage_multiplier = 1.25;
	}
} else if (player1.getCurrentPokemon().getType() == "Fire") {
	if (player2.getCurrentPokemon().getType() == "Water" || player2.getCurrentPokemon().getType() == "Rock" ||  player2.getCurrentPokemon().getType() == "Dragon") {
		damage_multiplier = 0.75;
	} else if (player2.getCurrentPokemon().getType() == "Grass") {
		damage_multiplier = 1.25;
	}
} else if (player1.getCurrentPokemon().getType() == "Grass") {
	if (player2.getCurrentPokemon().getType() == "Fire" || player2.getCurrentPokemon().getType() == "Dragon") {
		damage_multiplier = 0.75;
	} else if (player2.getCurrentPokemon().getType() == "Water" || player2.getCurrentPokemon().getType() == "Rock") {
		damage_multiplier =  1.25;
	}
} else if (player1.getCurrentPokemon().getType() == "Rock") {
	if (player2.getCurrentPokemon().getType() == "Water" || player2.getCurrentPokemon().getType() == "Grass" || player2.getCurrentPokemon().getType() == "Psychic") {
		damage_multiplier = 0.75;
	} else if (player2.getCurrentPokemon().getType() == "Electric" || player2.getCurrentPokemon().getType() == "Fire") {
		damage_multiplier = 1.25;
	}
} else if (player1.getCurrentPokemon().getType() == "Psychic") {
	if (player2.getCurrentPokemon().getType() == "Water" || player2.getCurrentPokemon().getType() == "Electric" || player2.getCurrentPokemon().getType() == "Fire" || player2.getCurrentPokemon().getType() == "Grass" || player2.getCurrentPokemon().getType() == "Dragon") {
		damage_multiplier =  1.25;
	} else if (player2.getCurrentPokemon().getType() == "Psychic") {
		damage_multiplier  = 0.75;
	}
} else if (player1.getCurrentPokemon().getType() == "Psychic") {
	if (player2.getCurrentPokemon().getType() == "Rock" || player2.getCurrentPokemon().getType() == "Dragon" || player2.getCurrentPokemon().getType() == "Psychic") {
		damage_multiplier = 1.25;
	}
} else {
	damage_multiplier = 1;
} 