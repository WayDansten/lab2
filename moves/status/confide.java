package moves.status;

import ru.ifmo.se.pokemon.*;

public class confide extends StatusMove {
	
	@Override
		protected String describe() {return "uses Confide";}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		
		Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
		p.addEffect(e);
		System.out.println(p.toString() + "'s special attack has been decreased by 1");
		
	}
	
	public confide() {
		
		super(Type.NORMAL, 0, 100);
		
	}	
	
}