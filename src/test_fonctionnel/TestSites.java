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
		Gaulois abraracourcix  = new Gaulois("Abraracourcix", 5);
		
		
		Soldat minus = new Soldat("Minus", 2,Grade.SOLDAT);
		Soldat brutus  = new Soldat("Brutus ", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tullius = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		Soldat briseradius = new Soldat("Briseradius", 4,Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4,Grade.CENTURION);

		
		Village village2 = new Village(vercingetorix);
		Camp camp2 = new Camp(minus);
		village2.ajouteGaulois(agecanonix);
		village2.ajouteGaulois(assurancetourix);
		village2.ajouteGaulois(astérix);
		village2.ajouteGaulois(obelix);
		village2.ajouteGaulois(prolix);
		village2.ajouteGaulois(abraracourcix);
		
		camp2.ajouteSoldat(brutus);
		camp2.ajouteSoldat(milexcus);
		camp2.ajouteSoldat(tullius);
		camp2.ajouteSoldat(ballondebaudrus);
		camp2.ajouteSoldat(briseradius);
		camp2.ajouteSoldat(chorus);
		
		village2.afficherVillage();
		camp2.afficherCamp();
		
		village2.changerChef(abraracourcix);
		camp2.changerCommandant(briseradius);
		camp2.changerCommandant(chorus);

		
		
		
		
	}
}