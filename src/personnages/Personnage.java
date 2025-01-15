package personnages;

public abstract class Personnage {
	protected String name;
	protected int force;
	
	
		
	public String getName() {
		return name ;
	}
	public int getForce() {
		return force ;
	}	
	public void parler(String text) {
		System.out.println(this.donnerAuteur()+ " " + this.getName() + " : " + text );
	}
	public void recevoirCoup(int coup) {
		this.force = this.force - coup ;
		if (this.force<0) {
			this.force = 0 ;
		}
		else if (this.force >0) {
			this.parler("Aie !");
		}
		if(this.force==0) {
			this.parler("J'abandonne...");
		}
	}
	public void frapper(Personnage neuille) {
		this.parler(this.getName() + " envoie un grand coup dans la machoire de " + neuille.getName());
		neuille.recevoirCoup(force/3);
	}
	public abstract String donnerAuteur();
}