package personnages;

public class Gaulois extends Personnage {

	public Gaulois(String name, int force) {
		this.name = name;
		this.force = force;
	}
	@override
	public String donnerAuteur() {
		return "Le Gaulois";
	}
}
