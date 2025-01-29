package personnages;

public abstract class Personnage {
	protected String name;
	protected int force;
	protected boolean enVie;

    public Personnage(String name, int force) {
        this.name = name;
        this.force = force;
        this.enVie = true; 
    }
    
	public String getName() {
		return name ;
	}
	public int getForce() {
		return force ;
	}
	public boolean estAterre() {
        return this.enVie;  
    }
	
	public void parler(String text) {
		System.out.println(this.donnerAuteur()+ " " + this.getName() + " : " + text );
	}
	public void recevoirCoup(int coup) {
		this.force = this.force - coup ;
		if (this.force<=0) {
			this.force = 0 ;
			this.parler("J'abandonne...");
			this.enVie = false;
		}
		else if (this.force >0) {
			this.parler("Aie !");
		}
	}
	public void frapper(Personnage neuille) {
		this.parler(this.getName() + " envoie un grand coup dans la machoire de " + neuille.getName());
		neuille.recevoirCoup(force);
	}
	public abstract String donnerAuteur();
}