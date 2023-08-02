package LoggerGroup.loggerapp;

/**
 * Hello world!
 *
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.log4j.*;
//import org.apache.log4j.xml.DOMConfigurator;
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger=LoggerFactory.getLogger(App.class.getName());
    	logger.info("info from slf4j");
    	logger.debug("debug info");
    	//Logger logger=Logger.getLogger(App.class.getName());
    	//DOMConfigurator.configure("log4j.xml");
    	//logger.info("info from logger");
        System.out.println( "Hello World!" );
    }
}
