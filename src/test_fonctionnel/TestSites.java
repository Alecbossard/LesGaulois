package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Personnage;
import personnages.Romain;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestSites{
	public static void main(String[] args) {
		
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Gaulois agecanonix  = new Gaulois("Agecanonix ", 1);
		Gaulois assurancetourix  = new Gaulois("Assurancetourix ", 2);
		Gaulois obelix   = new Gaulois("Obelix  ", 15);
		Gaulois prolix   = new Gaulois("Prolix  ", 2);
		Gaulois astérix  = new Gaulois("Astérix", 5);
		
		Soldat minus = new Soldat("Minus", 2,Grade.SOLDAT);
		Soldat brutus  = new Soldat("Brutus ", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tullius = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);

		
		Village village2 = new Village(vercingetorix);
		Camp camp2 = new Camp(minus);
		village2.ajouteGaulois(agecanonix);
		village2.ajouteGaulois(assurancetourix);
		village2.ajouteGaulois(astérix);
		village2.ajouteGaulois(obelix);
		village2.ajouteGaulois(prolix);
		
		camp2.ajouteSoldat(brutus);
		camp2.ajouteSoldat(milexcus);
		camp2.ajouteSoldat(tullius);
		camp2.ajouteSoldat(ballondebaudrus);
		
		village2.afficherVillage();
		camp2.afficherCamp();
		
		
		
		
		
		
	}
}