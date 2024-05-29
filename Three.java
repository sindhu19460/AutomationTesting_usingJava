package test1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Three {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
		driver.findElement(By.className("dropbtn")).click();
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Facebook")));
		
//		driver.findElement(By.linkText("Facebook")).click();
		driver.close();
		
	}

}
