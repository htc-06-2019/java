package fr.htc.impot.core;

import fr.htc.impot.utils.Constantes;

public class HabitationProfessionnelle extends Habitation {

	private int nbPiece;
	private int nbEmployes;
	private boolean aPiscine;

	/**
	 * 
	 * @param propritaire
	 * @param adresse
	 * @param surface
	 */
	public HabitationProfessionnelle(String propritaire, String adresse, double surface) {
		super(propritaire, adresse, surface);
	}

	/**
	 * 
	 * @param propritaire
	 * @param adresse
	 * @param surface
	 * @param nbPiece
	 * @param nbEmployes
	 * @param aPiscine
	 */

	public HabitationProfessionnelle(String propritaire, String adresse, double surface, int nbEmployes) {
		super(propritaire, adresse, surface);
		this.nbEmployes = nbEmployes;
	}

	/**
	 * print object status
	 */
	@Override
	public void Affiche() {
		super.Affiche();
		System.out.println("Nombre d'employés = " + nbEmployes);
	}

	@Override
	public double impot() {
		int tranch = nbEmployes/Constantes.TRANCHE_EMPLOYE;
		return super.impot() + tranch * Constantes.PRIX_PAR_EMPLOYE;

	}

	// ***************************** getters & setters

	public int getNbEmployes() {
		return nbEmployes;
	}

	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;

	}

}
