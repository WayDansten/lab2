package moves.physical;

import ru.ifmo.se.pokemon.*;

public class lowSweep extends PhysicalMove {
	
	@Override
	protected String describe() {return "uses Low Sweep";}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		
		Effect e = new Effect().stat(Stat.SPEED, -1);
		p.addEffect(e);
		
	}
	
	public lowSweep() {
		
		super (Type.FIGHTING, 65, 100);
		
	}
	
}