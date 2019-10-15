package fr.htc.impot.mains;

import org.apache.log4j.Logger;

import fr.htc.impot.core.Habitation;

public class TestLogger {
	static Logger logger = Logger.getLogger(TestLogger.class);

	public static void main(String[] args) {
		logger.info("ceci est un logger");
		logger.warn("info");
		logger.error("erreur");
		logger.fatal("fatal");
		logger.trace("trace");
		logger.warn("warn");
		
		Habitation h = new Habitation("Djam", "Cergy", 25);
		h.impot();

	}

}
