package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Six {
	
	//DropDownBOx
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("drop1")).sendKeys("doc 1");
		WebElement dropDown = driver.findElement(By.id("drop1"));
		Select select = new Select(dropDown);
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByVisibleText("doc 1");
		Thread.sleep(2000);
		driver.close();
		
	}

}
