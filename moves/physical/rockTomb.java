package moves.physical;

import ru.ifmo.se.pokemon.*;

public class rockTomb extends PhysicalMove {
	
	@Override
	protected String describe() {return "uses Rock Tomb";}
		
	@Override
	protected void applyOppEffects(Pokemon p) {
		
		Effect e = new Effect().stat(Stat.SPEED, -1);
		p.addEffect(e);
		
	}
	
	public rockTomb() {
	
		super(Type.ROCK, 60, 95);
		
	}
	
}