package pokemons;

import ru.ifmo.se.pokemon.*;

import moves.status.*;

public class Slakoth extends Pokemon {
		
	public Slakoth() {
		
	this("Slakoth", 1);
	
	}
	
	public Slakoth(String name, int level) {
		
		super(name, level);
		setStats(60, 60, 60, 35, 35, 30);
		setType(Type.NORMAL);
		setMove(new swagger(), new confide());
		
	}

}