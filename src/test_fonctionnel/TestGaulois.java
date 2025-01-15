package test_fonctionnel;

import personnages.Personnage;
import personnages.Romain;
import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Personnage asterix = new Gaulois("Astrerix", 8);
		Personnage minus = new Romain("Minus", 6);
		System.out.println("Le nom est : " + asterix.getName() + " et sa force est de : " + asterix.getForce() );
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
	}
}
