package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois{
	protected int forceP=0;
	protected int nbP=0;
	private Random random;
	
	public 	Druide(String name, int force) {	
		super(name, force);
		try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public String donnerAuteur() {
		return "Le Gaulois";
	}	
	
	public void creerPotion() {
		this.nbP = random.nextInt(6) + 2;
		 this.forceP = random.nextInt(5) + 2;
		this.parler("J'ai concoct� " + this.nbP +" doses de potion magique. Elle a une force de "+ this.forceP);
	}
	 public void boosterGaulois(Gaulois king) {
		 if (king.getName().equals("Obelix")) {
	            this.parler(" Non, Ob�lix Non !... Et tu le sais tr�s bien !");
		 }
		 else {
			 if (nbP ==0) {
				 this.parler("D�sol� "+ king.getName() + " il n'y a plus une seule goutte de potion. ");
			 }
			 else {
				 System.out.println(this.getName() + " a donn� une potion � " + king.getName() + " avec une puissance de " + this.forceP + ".");
				 king.boostGaulois(this.forceP);
				 nbP--;
			}
	}
}
}