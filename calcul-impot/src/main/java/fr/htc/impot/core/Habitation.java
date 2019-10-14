package fr.htc.impot.core;

import static fr.htc.impot.utils.Constantes.PRIX_METRE_CARRE;

public class Habitation {

	private String propritaire;
	private String adresse;
	private double surface;

	public Habitation(String propritaire, String adresse, double surface) {
		this.propritaire = propritaire;
		this.adresse = adresse;
		this.surface = surface;
	}

	public double impot() {
		return surface * PRIX_METRE_CARRE;
	}

	public void Affiche() {
		System.out.println(this.toString());
	}

	public String getPropritaire() {
		return propritaire;
	}

	public void setPropritaire(String propritaire) {
		this.propritaire = propritaire;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	@Override
	public String toString() {
		return "Habitation [propritaire=" + propritaire + ", adresse=" + adresse + ", surface=" + surface + "]";
	}
	
	

}
