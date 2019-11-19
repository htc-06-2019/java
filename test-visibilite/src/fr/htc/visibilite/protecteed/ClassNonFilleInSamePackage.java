package fr.htc.visibilite.protecteed;

public class ClassNonFilleInSamePackage {
	
	public void useIt() {
		
		
		ProtectedMemebres memebres = new ProtectedMemebres();
		memebres.protectedName = "";
		memebres.getProtected();
		
		
	}

}
