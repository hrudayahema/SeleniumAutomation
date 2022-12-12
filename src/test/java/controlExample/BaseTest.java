package controlExample;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadData;

public class BaseTest {
    
    
    
    WebDriver driver;
    ReadData conf;
    //ctrl+Shoift+O ----- autoimport
    //pre-condition    ----- @BeforeSuite-----
    //Test
    //post-condition   ----- @AfterSuite
    
    
    @BeforeTest
    public void launchApp() throws Exception {
        
        System.out.println("launching application");
        
        
        //create an Object on ReadConfig file
        conf = new ReadData();
        System.out.println(conf.getSampleappurl());
        
        
        driver = WebDriverManager.chromedriver().create();
       driver.get(conf.getSampleappurl());
        
        driver.manage().window().maximize();
       // driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        
    }
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(5000);
        driver.close();
        System.out.println("closing application");
    }

}