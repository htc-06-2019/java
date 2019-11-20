package fr.htc.impot.core;

import fr.htc.impot.utils.Imposable;

public class CalculImpot{
	
	double process (Imposable imp) {
		Habitation h= new Habitation("Djamel", "Cergy", 25);
		return imp.impot(h);
	}
	
	
	public static void main(String[] args) {
		CalculImpot ci = new CalculImpot();
		double impot = ci.process((h) -> (h.getSurface() * 10));
		System.out.println(impot);

	}
	
}
