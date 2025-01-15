package personnages;

public class Romain extends Personnage {

	public Romain(String name, int force) {
		this.name = name;
		this.force = force;
	}
	@override
	public String donnerAuteur() {
		return "Le Romain";
	}
}
