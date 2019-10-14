package fr.htc.impot.core;

import static fr.htc.impot.utils.Constantes.NB_SALARIE_PAR_TRANCHE;
import static fr.htc.impot.utils.Constantes.PRIX_PAR_TRANCHE_10;

public class HabitationProfessionnelle extends Habitation {
	
	private int nbEmployes;

	/**
	 * 
	 * @param propritaire
	 * @param adresse
	 * @param surface
	 * @param nbEmployes
	 */
	public HabitationProfessionnelle(String propritaire, String adresse, double surface, int nbEmployes) {
		super(propritaire, adresse, surface);
		this.nbEmployes = nbEmployes;
	}
	
	/**
	 * 
	 */
	@Override
	public double impot() {
		return super.impot() + (this.nbEmployes / NB_SALARIE_PAR_TRANCHE) * PRIX_PAR_TRANCHE_10;
	}
	
	
	@Override
	public void Affiche() {
		super.Affiche();
		System.out.println("Nombre d'employes : " + nbEmployes);
	}
	// ************ getters & setters
	public int getNbEmployes() {
		return nbEmployes;
	}

	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
	}
	
	

}
