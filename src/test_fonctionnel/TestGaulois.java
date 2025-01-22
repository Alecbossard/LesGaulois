package test_fonctionnel;

import personnages.Romain;
import personnages.Druide;
import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 5);
        Gaulois obelix = new Gaulois("Obelix", 7);
        Gaulois assurancetourix  = new Gaulois("Assurancetourix ", 2);
        Gaulois abraracourcix  = new Gaulois("Abraracourcix", 5);
        Gaulois agecanonix  = new Gaulois("Agecanonix ", 1);
        
        Druide panoramix = new Druide("Panoramix", 5);
        
        Romain minus = new Romain("Minus", 6);

     

        
        panoramix.creerPotion();
        panoramix.boosterGaulois(asterix);
        panoramix.boosterGaulois(obelix);
        panoramix.boosterGaulois(assurancetourix);
        panoramix.boosterGaulois(abraracourcix);
        panoramix.boosterGaulois(agecanonix);
        
        
        
        System.out.println(asterix.getName() + " a maintenant une force de " + asterix.getForce());
        System.out.println(obelix.getName() + " a maintenant une force de " + obelix.getForce());

       
    }
	
	}
