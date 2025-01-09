package personnages;

public class Gaulois {
	private String name;
	private int force;
	
	public Gaulois(String name, int force) {
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
		System.out.println("Le gaulois " + this.getName() + " : " + text );
	}
	public void frapper(Romain neuille) {
		System.out.println(this.getName() + " envoie un grand coup dans la machoire de " + neuille.getName());
		neuille.recevoirCoup(force/3);
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astrerix", 8);
		System.out.println("Le nom est : " + asterix.getName() + " et sa force est de : " + asterix.getForce() );
	}
}
