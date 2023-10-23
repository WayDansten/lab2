package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.special.*;
import moves.status.*;

public class HoOh extends Pokemon {
		
	public HoOh() {
		
		this("Ho-Oh", 1);
		
	}	
	
	public HoOh(String name, int level) {
		
		super(name, level);
		setStats(106, 130, 90, 110, 154, 90);
		setType(Type.FIRE, Type.FLYING);
		setMove(new ancientPower(), new shadowBall(), new confide(), new calmMind());
		
	}

}