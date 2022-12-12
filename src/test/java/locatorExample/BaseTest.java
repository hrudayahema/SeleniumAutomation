package locatorExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        System.out.println(conf.get_NOP_URL());
        
        
       // driver = WebDriverManager.chromedriver().create();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(conf.get_NOP_URL());
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