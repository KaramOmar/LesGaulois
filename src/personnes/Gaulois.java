package personnes;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

}
