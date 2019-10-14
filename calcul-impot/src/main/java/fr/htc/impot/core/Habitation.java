package fr.htc.impot.core;

public class Habitation {
	private String nom;
	private String adresse;
	private double surface;

	public Habitation(String nom, String adresse, double surface) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.surface = surface;
	}

	public String getNom() {
		return nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public double getSurface() {
		return surface;
	}

	public double impot() {
		double impotSurface = 2 * surface;
		System.out.println(impotSurface);
		return impotSurface;
	}

	public void affiche() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Habitation [nom=" + nom + ", adresse=" + adresse + ", surface=" + surface + "]";
	}

}
