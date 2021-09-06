package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mehedisumi/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String uri = "https://www.facebook.com/";
		
		driver.get(uri);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mehedimithu@live.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Imp'sinn");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
		
		//Let's check it now
		

	}

}
