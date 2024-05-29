package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
//		boolean b =
//		driver.findElement(By.xpath("//input[@name='vehicle'][2]")).isSelected();
//		System.out.println(b); //Prints true
//		boolean c =
//		driver.findElement(By.xpath("//input[@name='vehicle'][1]")).isSelected();
//		System.out.println(c); //Prints false
		
//		boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
//		System.out.println(displayed);
//	
//		boolean displayed1 = driver.findElement(By.id("but1")).isDisplayed();
//		System.out.println(displayed1);
//		
//		
//		boolean displayed3 = driver.findElement(By.id("but1")).isEnabled();
//		System.out.println(displayed3);
//		boolean isEnabled2 = driver.findElement(By.id("but2")).isEnabled();
//		System.out.println(isEnabled2);
		
		boolean isSelected1 = driver.findElement(By.id("radio2")).isSelected();
		System.out.println(isSelected1);
		driver.close();
	}

}
