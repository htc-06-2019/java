package fr.htc.impot.mains;

import fr.htc.impot.core.Habitation;
import fr.htc.impot.core.HabitationIndividuelle;

public class TestAnnexeA3 {

	public static void main(String[] args) {

		// creation d’un objet de type Habitation
		Habitation hab = new HabitationIndividuelle("Paul", "METZ", 120, 5, true);

		// calcul de l’impôt
		double impot = hab.impot();

		// affichage des attributs de la classe Habitation
		hab.Affiche();
		System.out.println("Impot = " + impot + "€");

	}
}
