package org.jtp.test.maven.eclipse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!!!
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOGGER.trace("We've just greeted the user!");
        LOGGER.debug("We've just greeted the user!");
        LOGGER.info("We've just greeted the user!");
        LOGGER.warn("We've just greeted the user!");
        LOGGER.error("We've just greeted the user!");
        LOGGER.fatal("We've just greeted the user!");
    }
}
