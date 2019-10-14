package fr.htc.impot.mains;

import fr.htc.impot.core.Habitation;
import fr.htc.impot.core.HabitationIndividuelle;
import fr.htc.impot.core.HabitationProfessionnelle;

public class TestAnnexeA2 {

	public static void main(String[] args) {

		// creation d’un objet de type Habitation
		Habitation hab = new HabitationIndividuelle("Paul", "METZ", 120, 5, true);
		Habitation habPro = new HabitationProfessionnelle("ImportExport", "METZ", 2500, 130);

		// calcul de l’impôt
		//double impot = hab.impot();
		double impot = habPro.impot();

		// affichage des attributs de la classe Habitation
		habPro.Affiche();
		System.out.println("Impot = " + impot + "€");
		

	}

}
