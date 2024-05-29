package test1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*;
public class One {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		
		driver.manage().window().maximize();
//		
//		driver.manage().window().minimize();
//		
//		WebElement element = driver.findElement(By.name("q"));
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		element.sendKeys("Athi");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		element.clear();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		WebElement link = driver.findElement(By.linkText("jqueryui"));
//		link.click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.navigate().back();
//		WebElement user = (WebElement) driver.findElements(By.id("textbox1"));
//		user.sendKeys("Hu");
//		
//		Thread.sleep(2000);
//		
//		user.clear();
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		
		//driver.findElement(By.partialLinkText("onlytesting")).click();
		
		//Thread.sleep(5000);
		//driver.quit();
		
		driver.findElements(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[1]/a")).wait(2000);
	
		
		driver.close();
		
	}

}
