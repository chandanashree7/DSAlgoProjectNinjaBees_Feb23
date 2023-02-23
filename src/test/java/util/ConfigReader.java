package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigReader {
	
	private static Properties properties;
	private final static String propertyFilepath="src/test/resources/config/config.properties";
	public static WebDriver driver;
	/**
	 * This method is used to load the properties from config.properties file
	 * @return it returns properties properties object
	 */
	public static Properties init_prop() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilepath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilepath);
		}
		//driver.get(properties.getProperty("url"));
		return properties;
		
	}
	
	
}
