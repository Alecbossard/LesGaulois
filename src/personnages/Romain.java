package personnages;

public class Romain extends Personnage {
    private String[] equipements;
    private boolean casque = false;
    private boolean plastron = false;
    private boolean bouclier = false;
    
	public Romain(String name, int force) {
		super(name,force);
		equipements = new String[3];
	}
	@override
	public String donnerAuteur() {
		return "Le Romain";
	}
	 public void equiper(String equipement) {
	        switch (equipement) {
	            case "casque":
	                if (!casque) {
	                    casque = true;
	                    equipements[0] = "Casque";
	                    System.out.println("Le soldat " + this.getName() + " s'équipe avec un casque.");
	                } else {
	                    System.out.println(this.getName() + " porte déjà un casque.");
	                }
	                break;
	            case "plastron":
	            	if(!plastron) {
	            		plastron=true;
	            		equipements[1] = "Plastron";
	            		System.out.println("Le soldat " + this.getName() + " s'équipe avec un plastron.");
	            	}
	            	else {
	            		System.out.println(this.getName() + " porte déjà un plastron.");
	            	}
	            	break;
	            case "bouclier":
	            	if(!bouclier) {
	            		bouclier = true;
	                    equipements[2] = "Bouclier";
	                    System.out.println("Le soldat " + this.getName() + " s'équipe avec un bouclier.");
	                } else {
	                    System.out.println(this.getName() + " a deja un bouclier.");
	                }
	                break;
	 			default:
	 					System.out.println("Équipement inconnu.");
	 					break;
	        }
	 }
	 public int calculProtec() {
		 int protec = 0;
		 if (casque) {
			 protec = protec +2;
		 }
		 if (plastron) {
			 protec = protec +3;
		 }
		 if (bouclier) {
			 protec = protec + 3 ;
		 }
		 return protec;
	 }
	    @Override
	    public void recevoirCoup(int coup) {
	        int reduction = calculProtec();
	        coup -= reduction;			
	        
	        if (coup < 0) coup = 0;

	        super.recevoirCoup(coup);
	        
	        if (reduction > 0) {
	            System.out.println("Le bouclier absorbe " + Math.min(3, reduction) + " du coup.");
	            System.out.println("Le casque absorbe " + Math.min(2, reduction) + " du coup.");
	            System.out.println("Le plastron absorbe " + Math.min(3, reduction) + " du coup.");
	        }
	    }

	 
}
