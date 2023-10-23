package pokemons;

import ru.ifmo.se.pokemon.*;

import moves.physical.*;
import moves.special.*;
import pokemons.Anorith;

public class Armaldo extends Anorith {
		
	public Armaldo() {
		
	this("Armaldo", 1);
	
	}
	
	public Armaldo(String name, int level) {
		
		super(name, level);
		setStats(75, 125, 100, 70, 80, 45);
		setType(Type.ROCK, Type.BUG);
		setMove(new rockSlide(), new xScissor(), new rockTomb(), new flashCannon());
		
	}

}