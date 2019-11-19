package fr.htc.visibilite.defaultotherpackage;

import fr.htc.visibilite.defaulte.DefaultClass;

public class ClassNonFilleInOtherPackage {
	
	public void name() {
		DefaultClass defaultClass = new DefaultClass();
		
		defaultClass.age = 55;
		defaultClass.print();
		
		//********************************************************
		//**************    --> KO <--    ************************
		//********************************************************
	}

}
