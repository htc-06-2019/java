package fr.htc.impot.core;

public class Habitation {
	public String nom;
	public String adresse;
	public double surface;

	public Habitation(String nom, String adresse, double surface) {
		this.nom = nom;
		this.adresse = adresse;
		this.surface = surface;
	}

	public double Impot() {
		// TODO Auto-generated method stub
		Habitation hab = new Habitation(nom, adresse, surface);
		double i = 2 * surface;
		System.out.println("la somme d'impôt à payer est " + i);
		return i;
	}

	public void Affiche() {
		System.out.println(nom);
		System.out.println(adresse);
		System.out.println(surface);
	}

}
