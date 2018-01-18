package Tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OutlookMailTest {
	
	public static void main(String args[]) throws InterruptedException{
		//System.setProperty("webdriver.gecko.driver","D:/Drivers/geckodriver.exe");
		 //WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver","D:/Drivers/IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		//DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setCa
		driver.get("https://outlook.office.com/owa/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("na395109@wipro.com");
		driver.findElement(By.id("idSIButton9")).click();
        WebDriverWait wdw=new WebDriverWait(driver,50);
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='header']/img")));
        
        driver.findElement(By.id("passwordInput")).sendKeys("******");

        driver.findElement(By.id("submitButton")).click();
        WebDriverWait wdw1=new WebDriverWait(driver,50);
        wdw1.until(ExpectedConditions.visibilityOfElementLocated(By.id("displayName")));
        driver.findElement(By.id("idSIButton9")).click();
        //WebDriverWait wdw2=new WebDriverWait(driver,30);
        //wdw2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='header']/img")));
        driver.findElement(By.xpath(".//*[@id='primaryContainer']/div[5]/div/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div[1]/div/button[1]")).click();
        driver.findElement(By.xpath("//input[@aria-label = 'To']")).sendKeys("nandivada.ramakanth@wipro.com");
      //WebElement tomail= driver.findElement(By.xpath("//input[@aria-label='To']"));
      //tomail.sendKeys("nandivada.ramakanth@wipro.com");
      //tomail.click();
        //driver.findElement(By.xpath("//input[@aria-label='Subject']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@aria-label='Subject,']")).sendKeys("Selenium Demo Tests - Test Mail");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@aria-label='Message body']")).sendKeys("Selenium Demo Tests - Test Mail");
        driver.findElement(By.xpath("//input[@aria-label='Send']")).click();
        
        
        
        }
	

}
