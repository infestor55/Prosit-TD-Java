package Faculte;

public class EtudiantAlternance extends Etudiant {
	//TODO 8 : Compl�ter la d�claration de la classe EtudiantAlternance
	private int salaire;
	
	// TODO 9 : Cr�er le constructeur param�tr� de EtudiantAlternance
	public EtudiantAlternance(int identifiant, String nom, String prenom, float moyenne, int salalire) {
		super(identifiant, nom, prenom, moyenne);
		this.salaire = salaire;
	}
	
	// TODO 10 : �crire la m�thode void ajouterUneAbsence() pour EtudiantAlternance
	@Override
	public void ajouterUneAbsence() {
		moyenne -= 0.5;
	}
	
	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	// TODO 11 : Red�finir la m�thode toString() de la classe EtudiantAlternance
	@Override
	public String toString() {
	    return "EtudiantAlternance{" +
	           "identifiant=" + identifiant +
	           ", nom='" + nom + '\'' +
	           ", prenom='" + prenom + '\'' +
	           ", moyenne=" + moyenne +
	           ", salaire=" + salaire +
	           '}';
	}
}
