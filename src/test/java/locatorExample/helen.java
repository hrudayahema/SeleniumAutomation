package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class helen {
	

		@Test
		  
		public void verify() {

			WebDriver driver = WebDriverManager.chromedriver().create();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			
		//	driver.findElement(By.xpath("//td[text()='Helen Bennet']//preceding-sibling::td//child::input[@type='checkbox']")).click();

			System.out.println("checking ");
}
		
		
}
