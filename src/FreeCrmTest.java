import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FreeCrmTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/himanshu.dubey/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.freecrm.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//a[text()='Contacts']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//driver.findElement(By.xpath("//a[text()='New Contact']")).click();
		//driver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[7]/a")).click();
	}
}
