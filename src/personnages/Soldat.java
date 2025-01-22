package personnages;

public class Soldat extends Romain{
	protected Grade grade;
	
	public 	Soldat(String name, int force, Grade grade) {	
		super(name, force);
		this.grade=grade;
	}
	
	@Override
	public String donnerAuteur() {
		return "Le Romain";
	}
	public Grade getGrade() {
		return this.grade ;
	}
}