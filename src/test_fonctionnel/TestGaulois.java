package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astrerix", 8);
		Romain minus = new Romain("Minus", 6);
		System.out.println("Le nom est : " + asterix.name + " et sa force est de : " + asterix.force );
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}
}
