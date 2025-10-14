package ProvaLog.provalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback {

	static Logger logger = LoggerFactory.getLogger("Logback");
	
	public static void main(String[] args) {
	
		writelog();
	}
	
	public static void writelog() {
		logger.info(" I'm your info logger");	
	    logger.debug("hey hey! I'm your debug logger");
	    logger.warn("this is a warning");
	}

}
