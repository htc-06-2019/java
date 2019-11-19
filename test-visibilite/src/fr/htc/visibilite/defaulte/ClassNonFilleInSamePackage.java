package fr.htc.visibilite.defaulte;

public class ClassNonFilleInSamePackage {
	
	
	public void name() {
		DefaultClass defaultClass = new DefaultClass();
		
		defaultClass.age = 55;
		defaultClass.print();
		
		//********************************************************
		//**************    --> OK <--    ************************
		//********************************************************
	}

}
