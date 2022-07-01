
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  MiniProject_Cont
{
public static void main(String[] args) throws Throwable
{ 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\com.selenium.project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebElement signin = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
	signin.click();
	driver.findElement(By.name("email")).sendKeys("smkmuthu91@gmail.com");
	driver.findElement(By.name("passwd")).sendKeys("123456");
	driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
	driver.findElement(By.xpath("//img[@alt='My Store']")).click();
	//driver.findElement(By.name("SubmitLogin")).click();
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//a[normalize-space()='Faded Short Sleeve T-shirts'])[1]"))).click().build().perform();
	act.moveToElement(driver.findElement(By.name("Submit"))).click().build().perform();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"))));
	act.click(driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"))).build().perform();
	act.click(driver.findElement(By.xpath("//span[text()='Proceed to checkout']"))).build().perform();
	act.click(driver.findElement(By.xpath("//span[text()='Proceed to checkout']"))).build().perform();
	act.click(driver.findElement(By.name("cgv"))).build().perform();
	act.click(driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"))).build().perform();
	 
	TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Muthu\\eclipse-workspace\\Seleniumnew\\Screenshot\\miniprojectend.png");
		FileUtils.copyFile(src, dest);
		
}
}
