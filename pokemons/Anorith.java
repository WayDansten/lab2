package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.physical.*;

public class Anorith extends Pokemon {
		
	public Anorith() {
		
		this("Anorith", 1);
		
	}	
	
	public Anorith(String name, int level) {
		
		super(name, level);
		setStats(45, 95, 50, 40, 50, 75);
		setType(Type.ROCK, Type.BUG);
		setMove(new rockSlide(), new xScissor(), new rockTomb());
		
	}

}