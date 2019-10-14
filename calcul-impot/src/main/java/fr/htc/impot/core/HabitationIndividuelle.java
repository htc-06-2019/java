package fr.htc.impot.core;

public class HabitationIndividuelle extends Habitation {

	private int nbPieces;
	private boolean piscine;

	public HabitationIndividuelle(String nom, String adresse, int suface, int nbPieces, boolean aUnePiscine) {
		super(nom, adresse, suface);
		this.nbPieces = nbPieces;
		this.piscine = aUnePiscine;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	public boolean isPiscine() {
		return piscine;
	}

	public void setPiscine(boolean piscine) {
		this.piscine = piscine;
	}

}
