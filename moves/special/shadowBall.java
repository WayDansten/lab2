package moves.special;

import ru.ifmo.se.pokemon.*;

public class shadowBall extends SpecialMove {
	
	@Override
		protected String describe() {return "uses Shadow Ball";}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		
			Effect e = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
			p.addEffect(e);
		
	}
	
	public shadowBall() {
		
		super(Type.GHOST, 80, 100);
		
	}	
	
}