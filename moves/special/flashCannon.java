package moves.special;

import ru.ifmo.se.pokemon.*;

public class flashCannon extends SpecialMove {

		@Override
		protected String describe() {return "uses Flash Cannon";}
		
		@Override
		protected void applyOppEffects(Pokemon p) {
			
				Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
				p.addEffect(e);
				System.out.println(p.toString() + "'s special defense has been decreased by 1");
			
		}

		public flashCannon() {

			super(Type.STEEL, 80, 100);

		}	
	
	}	