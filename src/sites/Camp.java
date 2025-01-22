package sites;

import personnages.Grade;
import personnages.Personnage;
import personnages.Soldat;

public class Camp{
	protected Soldat commandant;
	protected Soldat[] membres; 
	private int nbMembres ;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		this.membres = new Soldat[3];
		this.nbMembres = 0;
	}
	public Personnage getCommandant() {
		return commandant;
	}
	public void ajouteSoldat(Soldat Sque){
		if (nbMembres==3) {
			commandant.parler("Désolé "+ Sque.getName() + " notre camp est complet !");
		}
		else {
			membres[nbMembres]= Sque ;
			nbMembres ++ ;
			Sque.parler(" Je mets mon épée au service de Rome dans le camp dirigé par"+ commandant.getName() );
		}
	}
	public void afficherCamp() {
		System.out.println("Le camp dirigé par " +this.commandant.getName() +" contient les soldats : ");
		for ( int i=0; i<nbMembres;i++) {
			System.out.println("- "+ membres[i].getName());
		}
	}
	public void changerCommandant(Soldat ez) {
		if ( ez.getGrade() == Grade.CENTURION ) {	
			this.commandant = ez ;
			commandant.parler(" Moi " + ez.getName() + " je prends la direction du camp romain.");
		}
		else {
			ez.parler(" Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
		}
	}
}