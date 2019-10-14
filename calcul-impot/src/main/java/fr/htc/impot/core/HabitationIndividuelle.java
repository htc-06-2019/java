package fr.htc.impot.core;

public class HabitationIndividuelle extends Habitation {

		private int Nbpieces ;
		private boolean piscine ;
		
		
	
	public HabitationIndividuelle(String nom, String adresse, double suface, int Nbpieces, boolean piscine  ) {
		super(nom, adresse, suface);
		
		this.Nbpieces = Nbpieces;
		this.piscine = piscine;
		
		
	}



	@Override
	public double Impot() {
		// TODO Auto-generated method stub
		return super.Impot();
	}



	@Override
	public void Affiche() {
		
		super.Affiche();
	}
	
	
	
	

}
