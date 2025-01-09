package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astrerix", 8);
		System.out.println("Le nom est : " + asterix.name + " et sa force est de : " + asterix.force );
		asterix.parler("Bonjour a tous");
	}
}
