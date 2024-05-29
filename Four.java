package test1;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.HasNetworkConditions;

public class Four {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Open a popup window")).click();
//		String text = driver.findElement(By.xpath("//body[1]//h2[1]")).getText();
//		System.out.println("pop window text"+text);
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
//		while(itr.hasNext())
//		{
//			String win = itr.next();
//			System.out.println(win);
//		}
		
		
		String MainWindow = itr.next();
		String ChildWindow = itr.next();
		driver.switchTo().window(ChildWindow);
		String text = driver.findElement(By.xpath("//body//h2")).getText();
		System.out.println("pop window text "+text);
		driver.quit();
	}

}
