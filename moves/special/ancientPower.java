package moves.special;

import ru.ifmo.se.pokemon.*;

public class ancientPower extends SpecialMove {

		@Override
		protected String describe() {return "uses Ancient Power";}
		
		@Override
		protected void applySelfEffects(Pokemon p) {
			
				Effect e = new Effect().chance(0.1).stat(Stat.ATTACK, 1).stat(Stat.DEFENSE, 1).stat(Stat.SPEED, 1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1);
				p.addEffect(e);
				System.out.println(p.toString() + " has increased all its stats by 1");
			
		}

		public ancientPower() {

			super(Type.ROCK, 60, 100);

		}	
	
	}	