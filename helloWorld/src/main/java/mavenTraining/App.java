package mavenTraining;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 * 
 */
public class App {
	private static Log log = LogFactory.getLog(App.class);

	public boolean printinfor(String input) {
		boolean status = false;
		
		if (input == null || input.length() == 0) {
			log.error("The input String is invalid");
		}
		else
		{
			status = true;
			String[] lines = input.split("\n");
			for(String line : lines)
			{
				log.info("*******************************************");
				log.info(line);
			}
		}
		return status;
	}
}
