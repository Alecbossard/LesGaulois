package personnages;

public class Romain {
	public String name;
	public int force;
	
	public Romain(String name, int force) {
		this.name = name;
		this.force = force;
	}
	
	public String getName() {
		return name ;
	}
	public void parler(String text) {
		System.out.println("Le romain " + name + " : " + text );
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
