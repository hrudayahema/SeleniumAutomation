package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
@Test
	public static void shopping() throws Exception {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.navigate().to("https://amazon.com");
		Thread.sleep(2000);
//	driver.findElement(By.xpath("//h2[text()='Shop for your baby by age']//parent::div//following-sibling::div[@class=\"a-cardui-footer\"]//child::a[text()='See more']"))).click();
	

}
	

}
