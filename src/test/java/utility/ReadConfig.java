package utility;

	import java.io.FileInputStream;
	import java.util.Properties;

	public class ReadConfig {

	    Properties prop;

	    public ReadConfig() throws Exception {

	        FileInputStream fis = new FileInputStream(".\\testData\\config.properties");

	        prop = new Properties();

	        prop.load(fis);

	        // prop.getProperty(null)

	    }

	    public String get_NOP_URL() {

	        return prop.getProperty("appURL");
	    }
	    public String getSampleappurl() {

	        return prop.getProperty("Sample_appURL");
	    }
	    public String get_selenium_url() {

	        return prop.getProperty("Selenium_URL");
	    }
	    
	    public String ui_practice_URL() {

	        return prop.getProperty("ui_practice_url");
	    }
	    
	    public String get_adminuser() {

	        return prop.getProperty("adminUserName");
	    }

	    public String get_adminPass() {

	        return prop.getProperty("adminPassword");
	    }

	}
	


