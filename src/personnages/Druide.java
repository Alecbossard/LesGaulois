public class Druide extends Gaulois{
	protected int forceP=0;
	protected int nbP=0;
	
	public 	Druide(String name, int force) {	
		super(name, force);
	}
	
	@Override
	public String donnerAuteur() {
		return "Le Gaulois";
	}
	
	public void creerPotion(int nb) {
		int range = (6 - 2) + 1;
		this.nbP=nb;
		int force = (int) ((range * Math.random()) + 2);
		this.forceP = force ;
		this.parler("J'ai concocté " + this.nbP +" doses de potion magique. Elle a une force de "+ this.forceP);
	}
}