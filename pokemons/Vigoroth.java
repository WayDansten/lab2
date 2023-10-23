package pokemons;

import ru.ifmo.se.pokemon.*;

import moves.status.*;
import pokemons.Slakoth;

public class Vigoroth extends Slakoth {
		
	public Vigoroth() {
		
	this("Vigoroth", 1);
	
	}
	
	public Vigoroth(String name, int level) {
		
		super(name, level);
		setStats(80, 80, 80, 55, 55, 90);
		setType(Type.NORMAL);
		setMove(new swagger(), new confide());
		
	}

}