package Faculte;

import java.util.ArrayList;
import java.util.List;

public class Ecole {
	// TODO 12 : D�clarer le constructeur de la classe Ecole
	private List<Etudiant> etudiants;
	private String nom;

	public Ecole(String nom) {
		this.etudiants = new ArrayList<>(500);
		this.nom = nom;
	}

	// TODO 13 : Apporter les modifications n�cessaires dans la classe Ecole pour ajouter un �tudiant
	public void ajouterEtudiantt(Etudiant etudiant) {
		if (!etudiants.contains(etudiant)) {
			etudiants.add(etudiant);
		} else {
		}
	}

	// TODO 14 : Impl�menter la m�thode rechercherEtudiant()
	public int rechercherEtudiant(Etudiant etudiant) {
		return etudiants.indexOf(etudiant);
	}

	// TODO 15 : Impl�menter la m�thode ajouterEtudiant()
	public void ajouterEtudiant(Etudiant etudiant)  throws EtudiantExisteException {
		if (this.rechercherEtudiant(etudiant) < 0) {
			etudiants.add(etudiant);
		} else {
			// TODO 21 : Modifier la m�thode ajouterEtudiant() dans la classe Ecole
            throw new EtudiantExisteException("L'�tudiant est d�j� inscrit � l'�cole.");
		}
	}
	
	// TODO 16 : Impl�menter la m�thode getMoyenneDes3A()
    public float getMoyenneDes3A() {
        float sumMoyenne = 0;
        int countEtudiant3eme = 0;

        for (Etudiant etudiant : etudiants) {
            if (etudiant instanceof Etudiant3eme) {
                sumMoyenne += ((Etudiant3eme) etudiant).getMoyenne();
                countEtudiant3eme++;
            }
        }

        return countEtudiant3eme > 0 ? sumMoyenne / countEtudiant3eme : 0;
    }
	
	// TODO 17 : Impl�menter la m�thode moyenneSalaireAlternants()
    public float moyenneSalaireAlternants() {
        float sumSalaire = 0;
        int countEtudiantAlternance = 0;

        for (Etudiant etudiant : etudiants) {
            if (etudiant instanceof EtudiantAlternance) {
                sumSalaire += ((EtudiantAlternance) etudiant).getSalaire();
                countEtudiantAlternance++;
            }
        }

        return countEtudiantAlternance > 0 ? sumSalaire / countEtudiantAlternance : 0;
    }
	
	// TODO 18 : Red�finir la m�thode toString() de la classe Ecole
	@Override
	public String toString() {
	    StringBuilder result = new StringBuilder("Ecole{" +
	                                            "nom='" + nom + '\'' +
	                                            '}');

	    for (Etudiant etudiant : etudiants) {
	        result.append("\n").append(etudiant.toString());
	    }

	    return result.toString();
	}
	
	// TODO 22 : Modifier la m�thode changerEcole() dans la classe Ecole
    public void changerEcole(Etudiant etudiant, Ecole nouvelleEcole) throws EtudiantExisteException {
        if (etudiants.contains(etudiant)) {
            etudiants.remove(etudiant);
            nouvelleEcole.ajouterEtudiant(etudiant);
        } else {
            throw new EtudiantExisteException("L'�tudiant n'est pas inscrit � l'�cole actuelle.");
        }
    }

}
