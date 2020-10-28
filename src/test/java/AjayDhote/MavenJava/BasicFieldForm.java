package AjayDhote.MavenJava;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicFieldForm {

	@Test
	public void inputForm() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("IamAjay");
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		System.out.println(driver.findElement(By.xpath("//span[@id='display']")).getText());
	}
}
