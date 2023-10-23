import ru.ifmo.se.pokemon.*;

import pokemons.*;
import moves.physical.*;
import moves.special.*;
import moves.status.*;

import java.util.Random;

public class lab2 {
	
	public static void main(String[] args) {
		
		Battle b = new Battle();
		Pokemon[] a = {new HoOh("Desovik", 1), new Anorith("Zhutovik", 1), new Armaldo("Legendar", 1), new Slakoth("Mifik", 1), new Vigoroth("Annihilator", 1), new Slaking("Doomer", 1)};
		
		Random r = new Random();
		
		for (int i = a.length - 1; i > 0; i--) {
			
			int index = r.nextInt(i + 1);
			Pokemon temp = a[index];
			a[index] = a[i];
			a[i] = temp;
			
		}
		
		for (int i = 0; i < 6; i += 2) {
			
			b.addAlly(a[i]);
			b.addFoe(a[i + 1]);
			
		}
		
		b.go();
	}

}