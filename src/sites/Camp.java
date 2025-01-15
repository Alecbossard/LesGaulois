package sites;

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
		System.out.println("Le village de " +this.commandant.getName() +" est habité par : ");
		for ( int i=0; i<nbMembres;i++) {
			System.out.println("- "+ membres[i].getName());
		}
	}
}