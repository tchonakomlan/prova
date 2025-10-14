package ProvaLog.provalog;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App {
	
	private static final Logger logger = Logger.getLogger(App.class);
	 
	
    public static void main( String[] args ) throws FileNotFoundException, IOException{
    	
    	Properties log4jProps = new Properties();
		
		log4jProps.load(new FileInputStream("log4j.properties"));
		PropertyConfigurator.configure(log4jProps);
		
        System.out.println( "Hello World!" );
        logger.info("this is a log");
        
    }
}
