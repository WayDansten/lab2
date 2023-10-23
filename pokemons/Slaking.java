package pokemons;

import ru.ifmo.se.pokemon.*;

import moves.status.*;
import moves.physical.*;
import pokemons.Vigoroth;

public class Slaking extends Vigoroth {
		
	public Slaking() {
		
	this("Slaking", 1);
	
	}
	
	public Slaking(String name, int level) {
		
		super(name, level);
		setStats(150, 160, 100, 95, 65, 100);
		setType(Type.NORMAL);
		setMove(new swagger(), new confide(), new lowSweep());
		
	}

}