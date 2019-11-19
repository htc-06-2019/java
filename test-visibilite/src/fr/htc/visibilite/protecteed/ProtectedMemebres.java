package fr.htc.visibilite.protecteed;

public class ProtectedMemebres {

	protected String protectedName;

	protected void getProtected() {

		System.out.println("it don't works !!!!!!");
	}

	private void useIt() {

		protectedName = "Djamel ";
		getProtected();
	}

}
