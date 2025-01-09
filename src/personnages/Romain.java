package personnages;

public class Romain {
	private String name;
	private int force;
	
	public Romain(String name, int force) {
		this.name = name;
		this.force = force;
	}
	
	public String getName() {
		return name ;
	}
	public int getForce() {
		return force ;
	}
	public void parler(String text) {
		System.out.println("Le romain " + this.getName() + " : " + text );
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
}
