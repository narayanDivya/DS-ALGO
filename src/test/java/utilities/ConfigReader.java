package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties;
	private final static String configFilePath = "./src/test/resources/config.properties";
	
	
	public static void readConfig() throws Throwable {
		
		try {
			FileInputStream fis;
			fis = new FileInputStream(configFilePath);
			properties = new Properties();
			
			try {
				
					properties.load(fis);
					fis.close();
			}catch(IOException e) {
					e.printStackTrace();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + configFilePath);
			
		}
		
	}
	
	//Browser Type
	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("Browser type not specified in the config.properties file");
				
		}
	
	
	
	//Main url
	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null)
			return url;
		else
			
			throw new RuntimeException("Application url not specified in the config.properties file");
	}
	
	//Homepage
	public static String getHomePageUrl() {
		String homePage = properties.getProperty("homepage");
		if(homePage != null)
			return homePage;
		else
			throw new RuntimeException("Homepage url not specified in the config.properties file");
		
	}
	
	//Navigation
	public static String geturl(String pagename) {
		String url = properties.getProperty(pagename);
		if (url != null)
			return url;
		else
			throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
	}
	
	
	//Register
	public static String getRegistrationPage() {
		String registrationPage = properties.getProperty("registrationPage");
		if(registrationPage != null)
			return registrationPage;
		else
			throw new RuntimeException("Registration page url not specified in the config.properties file");
			}
	
	//SignIn
	public static String getSignInPage() {
		String signInPage = properties.getProperty("Loginpage");
		if(signInPage != null)
			return signInPage;
		else
			throw new RuntimeException("Sign In page url not specified in the config.properties file");
		
	}
	
	//Tree
	public static String getTreePage() {
		String treePage = properties.getProperty("Treehome");
		if(treePage != null)
			return treePage;
		else
			throw new RuntimeException("Tree page url not specified in the config.properties file");
	}
	public static String getTryEditor() {
		String tryEditor = properties.getProperty("tryeditor");
		if(tryEditor != null)
			return tryEditor;
		else
			throw new RuntimeException("Try editor url not specified in the config.properties file");
		
	}
	
	
	
}
