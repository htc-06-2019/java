package fr.htc.impot.mains;

import org.apache.log4j.Logger;

public class TestLogger {
	static Logger logger = Logger.getLogger(TestLogger.class);

	public static void main(String[] args) {

		logger.fatal("FATAL MSG");
		logger.error("ERROR MSG");
		logger.warn("WARN MSG");
		logger.info("INFO MSG");
		logger.debug("DEBUG MSG");
	}
	
}
