package fr.htc.impot.mains;

import fr.htc.impot.core.Habitation;

public class TestAnnexeA1 {

	public static void main(String[] args) {
		double impot;
		// creation d’un objet de type Habitation 
		Habitation hab = new Habitation("Jean", "METZ", 120);
		// calcul de l’imp^ot 
		impot = hab.Impot();
		// affichage des attributs de la classe Habitation 
		hab.Affiche();

	}

}
