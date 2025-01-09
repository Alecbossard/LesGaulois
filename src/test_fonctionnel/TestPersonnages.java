package test_fonctionnel;

import personnages.Gaulois;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astrerix", 8);
		System.out.println("Le nom est : " + asterix.getName() + " et sa force est de : " + asterix.getForce() );
	}
}
