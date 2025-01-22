package personnages;

public class Romain extends Personnage {

	public Romain(String name, int force) {
		super(name,force);
	}
	@override
	public String donnerAuteur() {
		return "Le Romain";
	}
}
