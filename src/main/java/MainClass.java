import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import controller.APIsGettingEndpoints;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("This is main class");
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = ClassLoader.getSystemClassLoader().getResourceAsStream("configs.properties");
			prop.load(input); // Adding all the data in prop variable.
			//	All the values in enum			
			System.out.println(prop.toString());
		} catch (IOException io) {
			io.printStackTrace();
		}
		/*
		// checking values in Enumeration data
		System.out.println("Enum name: -" + APIsGettingEndpoints.type_effectiveness);
		System.out.println("Enum name attached: -" + APIsGettingEndpoints.type_effectiveness.name());
		System.out.println("Enum value attached: -" + APIsGettingEndpoints.type_effectiveness.getAction());
		*/
	}

}
