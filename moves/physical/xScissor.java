package moves.physical;

import ru.ifmo.se.pokemon.*;

public class xScissor extends PhysicalMove {
	
	@Override
	protected String describe() {return "uses X-Scissor";}
		
	public xScissor() {
	
		super(Type.BUG, 80, 100);
		
	}
	
}