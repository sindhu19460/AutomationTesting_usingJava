package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		
		  WebElement list = driver.findElement(By.id("multiselect1"));
		  Select select = new Select(list);
		  select.selectByIndex(1);
		  Thread.sleep(2000);
		  select.deselectAll();
		  Thread.sleep(2000);
		  select.selectByVisibleText("Audi");
		  Thread.sleep(2000);
		  driver.quit();
	}

}
