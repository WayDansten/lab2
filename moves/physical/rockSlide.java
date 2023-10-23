package moves.physical;

import ru.ifmo.se.pokemon.*;

public class rockSlide extends PhysicalMove {
	
	@Override
	protected String describe() {return "uses Rock Slide";}
		
	@Override
	protected void applyOppEffects(Pokemon p) {
		
		if (0.3 > Math.random()) {
			
			Effect e = new Effect();
			e.flinch(p);
			
		}
		
	}
	
	public rockSlide() {
	
		super(Type.ROCK, 60, 95);
		
	}
	
}