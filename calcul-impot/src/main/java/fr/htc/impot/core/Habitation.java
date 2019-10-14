package fr.htc.impot.core;

public class Habitation { 
	
	private String nom;
	public String adresse;
	public double surface;
	private  double impot;

	public Habitation(String nom, String adresse, double surface) {
	
		this.nom = nom;
		this.adresse = adresse;
		this.surface = surface;
	}
	
	

	
	
	

	public double Impot() {
//		this.impot = this.surface*(2);
//		
//		return this.impot;
		
		return 0;
	}

	public void Affiche() {
		
//		System.out.println(this.impot);
		
	}

}
