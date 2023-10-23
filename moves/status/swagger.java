package moves.status;

import ru.ifmo.se.pokemon.*;

public class swagger extends StatusMove {
	
	@Override
	protected String describe() {return "uses Swagger";}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		
		Effect e = new Effect().stat(Stat.ATTACK, 2);
		e.confuse(p);
		p.addEffect(e);
		System.out.println(p.toString() + "'s attack has been increased by 2");
		
	}
	
	public swagger() {
		
		super(Type.NORMAL, 0, 85);
		
	}	
	
}