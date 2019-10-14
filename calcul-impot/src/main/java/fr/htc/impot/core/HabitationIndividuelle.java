package fr.htc.impot.core;

import static fr.htc.impot.utils.Constantes.PRIX_PAR_PIECE;

import fr.htc.impot.utils.Constantes;

public class HabitationIndividuelle extends Habitation {

	private int nbPiece;
	private boolean aPiscine;

	/**
	 * 
	 * @param propritaire
	 * @param adresse
	 * @param surface
	 */
	public HabitationIndividuelle(String propritaire, String adresse, double surface) {
		super(propritaire, adresse, surface);
	}

	/**
	 * 
	 * @param propritaire
	 * @param adresse
	 * @param surface
	 * @param nbPiece
	 * @param aPiscine
	 */
	public HabitationIndividuelle(String propritaire, String adresse, double surface, int nbPiece, boolean aPiscine) {
		super(propritaire, adresse, surface);
		this.nbPiece = nbPiece;
		this.aPiscine = aPiscine;
	}

	/**
	 * print object status
	 */
	@Override
	public void Affiche() {
		super.Affiche();
		System.out.println("Nombre de pièce = " + nbPiece + ", A une piscine : " + (aPiscine == true ? "OUI" : "NON"));
	}

	@Override
	public double impot() {
		return super.impot() + this.nbPiece * PRIX_PAR_PIECE + (this.aPiscine ? Constantes.PRIX_PAR_PISCINE : 0);

	}

	// ***************************** getters & setters
	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public boolean isaPiscine() {
		return aPiscine;
	}

	public void setaPiscine(boolean aPiscine) {
		this.aPiscine = aPiscine;
	}

}