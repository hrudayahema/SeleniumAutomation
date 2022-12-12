package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginTest {
	
@Test
  
public void verifyLogin() throws Exception{

	//WebDriver driver = WebDriverManager.chromedriver().create();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.id("Email"));
	
	WebElement password = driver.findElement(By.name("Password"));
	Thread.sleep(2000);
	
	WebElement login = driver.findElement(By.tagName("button"));
Thread.sleep(3000);

//WebElement customer = driver.findElement(By.className("nav-link"));
Thread.sleep(2000);
	email.clear();
	email.sendKeys("admin@yourstore.com");
	password.clear();
	Thread.sleep(2000);
	password.sendKeys("admin");
	login.click();
	
//List<WebElement> customer = driver.findElements(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p/text()"));

	//((WebElement) customer).click();
//List<WebElement> customer = driver.findElements(By.xpath("///html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")));
//((WebElement) customer).click();



//((WebElement) driver.findElements(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p"))).click();
	 //validation step
    System.out.println("after sucessful login, application title: " + driver.getTitle());
   
    
    //click on Customer menu/item
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//a[@href=\"#\"]//child::p[contains(text(),'Customers')]")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//child::p[contains(text(),'Customers')]")).click();
    ////a[contains(@href,'Admin/Customer/List')]//child::p[contains(text(),'Customers')]
    
    Thread.sleep(4000);
    //validation step
    System.out.println("after click on Customer menu item, application title: " + driver.getTitle());
    
    Thread.sleep(4000);
    
 driver.findElement(By.xpath("//a[@href=\"/Admin/CustomerRole/List\"]//child::p[contains(text(),'Customer roles')]")).click();
    
    driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
    
  //  driver.findElement(By.xpath("//a[@href='#']//child::p[contains(text(),'Promotions')]")).click();
    Thread.sleep(4000);
	
	
	
	
	
	
	
	
}
}
