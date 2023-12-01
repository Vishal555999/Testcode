package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertydata {

	public static String getPropertyFileData(String key) throws IOException {
		FileInputStream file = new FileInputStream("/Asignment/Data.properties");
		Properties p = new Properties();
		p.load(file);

		String value = p.getProperty(key);
		return value;

	}

}
