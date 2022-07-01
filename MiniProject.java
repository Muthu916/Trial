import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class  MiniProject
{
public static void main(String[] args) throws Throwable
{ 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Seleniumnew\\Driver_98\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	 driver.findElement(By.xpath("//a[@class='login']")).click();
	 driver.findElement(By.id("email_create")).sendKeys("smkmuthu91 @gmail.com");
	 driver.findElement(By.id("SubmitCreate")).click();
	 driver.findElement(By.name("id_gender")).click();
	 driver.findElement(By.name("customer_firstname")).sendKeys("Muthu");
	 driver.findElement(By.name("customer_lastname")).sendKeys("Kumar");
	 driver.findElement(By.name("passwd")).sendKeys("123456");
	 driver.findElement(By.name("days")).sendKeys("23");
	 driver.findElement(By.name("months")).sendKeys("May");
	 driver.findElement(By.name("years")).sendKeys("1992");
	 driver.findElement(By.name("newsletter")).click();
	 driver.findElement(By.name("optin")).click();
	 driver.findElement(By.name("company")).sendKeys("Infosys");
	 driver.findElement(By.name("address1")).sendKeys("Nehru Street");
	 driver.findElement(By.name("city")).sendKeys("Los Angeles");
	 Select se = new Select(driver.findElement(By.name("id_state")));
	 se.selectByValue("5");
	 driver.findElement(By.name("postcode")).sendKeys("90011");
	 driver.findElement(By.name("phone_mobile")).sendKeys("987654321");
	 
	 TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Muthu\\eclipse-workspace\\Seleniumnew\\Screenshot\\miniproject.png");
		FileUtils.copyFile(src, dest);
		
		driver.findElement(By.name("submitAccount")).click();
}
}