package personnages;

public class Gaulois extends Personnage {
	protected boolean boost;

	public Gaulois(String name, int force) {
		super(name,force);
		this.boost=false ;
	}
	@override
	public String donnerAuteur() {
		return "Le Gaulois";
	}
	
	public void boostGaulois(int forceP){
		if (!this.boost) {
            this.boost = true;
            this.force = this.force * forceP;
        }
	}
	public void enleverBoost(int forceInitiale) {
        this.boost = false;
        this.force = forceInitiale;
    }
	
	public void frapper(Personnage neuille) {
		System.out.println("Le gaulois "+ this.getName() + "  donne un grand coup de force "+  this.getForce() + " au soldat " + neuille.getName() );
		neuille.recevoirCoup(force);
		if (this.boost) {
			if (this.force>1)
			this.force =  this.force - 1;
		}else {
			this.boost=false;
			this.force=1;
		}
	}
}
