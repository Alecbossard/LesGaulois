package personnages;

public class Gaulois {
	public String name;
	public int force;
	
	public Gaulois(String name, int force) {
		this.name = name;
		this.force = force;
	}
	
	public String getName() {
		return name ;
	}
	public void parler(String text) {
		System.out.println("Le gaulois " + name + " : " + text );
	}
	public void frapper(Romain neuille) {
		System.out.println(name + " envoie un grand coup dans la machoire de " + neuille.name);
		neuille.recevoirCoup(force/3);
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astrerix", 8);
		System.out.println("Le nom est : " + asterix.name + " et sa force est de : " + asterix.force );
	}
}
