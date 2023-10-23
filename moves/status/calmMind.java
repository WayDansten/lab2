package moves.status;

import ru.ifmo.se.pokemon.*;

public class calmMind extends StatusMove {
	
	@Override
		protected String describe() {return "uses Calm Mind";}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		
		Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1);
		p.addEffect(e);
		System.out.println(p.toString() + " has increased its special attack and special defense by 1");
		
	}
	
	public calmMind() {
		
		super(Type.PSYCHIC, 0, 100);
		
	}	
	
}