package sites;


import personnages.Gaulois;
import personnages.Personnage;

public class Village{
	protected Personnage chef;
	protected Gaulois[] membres;
	private int nbMembres;
	
	public Village(Personnage vercingetorix) {
		this.chef = vercingetorix;
		this.membres = new Gaulois[4];
		this.nbMembres = 0;
	}
	public Personnage getChef() {
		return chef;
	}
	public void ajouteGaulois(Gaulois agecanonix){
		if (nbMembres==4) {
			chef.parler("Désolé " + agecanonix.getName() +" mon village est déjà bien rempli");
		}
		else {
			membres[nbMembres]= agecanonix ;
			nbMembres ++ ;
			chef.parler("Bienvenue  " + agecanonix.getName() +" !");
		}
	}
	public void afficherVillage() {
		System.out.println("Le village de " +this.chef.getName() +" est habité par : ");
		for ( int i=0; i<nbMembres;i++) {
			System.out.println("- "+ membres[i].getName());
		}
	}
}