package test1;

import javax.xml.datatype.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 


public class Five {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("alert1")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String Alerttext = alert.getText();
		System.out.println(Alerttext);
		Thread.sleep(3000);
		alert.accept();
		 
		driver.close();
		
	}

}
