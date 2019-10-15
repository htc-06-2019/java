package fr.htc.impot.core;

import static fr.htc.impot.utils.Constantes.PRIX_METRE_CARRE;

import org.apache.log4j.Logger;

public class Habitation {
	
	static Logger logger = Logger.getLogger(Habitation.class);

	private String propritaire;
	private String adresse;
	private double surface;

	public Habitation(String propritaire, String adresse, double surface) {
		this.propritaire = propritaire;
		this.adresse = adresse;
		this.surface = surface;
	}

	public double impot() {

		logger.info("ceci est un logger");
		logger.warn("info");
		logger.error("erreur");
		logger.fatal("fatal");
		logger.trace("trace");
		logger.warn("warn");
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
