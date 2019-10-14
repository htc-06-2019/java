package fr.htc.impot.mains;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import fr.htc.impot.core.Habitation;
import fr.htc.impot.core.HabitationIndividuelle;
import fr.htc.impot.core.HabitationProfessionnelle;

public class TestAnnexeA4 {
	static Logger logger = Logger.getLogger(TestAnnexeA4.class);

	public static void main(String[] args) {

		List<Habitation> habtiations = new ArrayList<Habitation>();

		habtiations.add(new HabitationProfessionnelle("ImportExport", "METZ", 2500, 130));
		habtiations.add(new HabitationProfessionnelle("Export", "METZ", 250, 10));
		habtiations.add(new HabitationIndividuelle("Paul", "METZ", 100, 5, false));
		habtiations.add(new HabitationProfessionnelle("Import", "METZ", 1200, 90));
		habtiations.add(new HabitationIndividuelle("Jean", "METZ", 130, 6, true));
		for (Habitation habitation : habtiations) {
			logger.info("___________________________________________________");
			habitation.Affiche();
			logger.info("Impot = " + habitation.impot() + " €");
			try {
				int a = 5/0;
			} catch (Exception e) {
				logger.error("Division impossible de l'impot sur le revenu", e);
			}
		}


	}

	public void run() {
		// TODO Auto-generated method stub

	}
}
