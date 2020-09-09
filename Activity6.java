package Selenuim_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void jobTestCase() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//li[@id='menu-item-24']//a[contains(text(),'Jobs')]")).click();
    	Thread.sleep(5000);
    	WebElement job = driver.findElement(By.id("search_keywords"));
    	job.sendKeys("AutomationSDET");
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//div[@class='search_submit']//input")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//li[@class='post-1498 job_listing type-job_listing status-publish hentry job-type-full-time']//a")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//input[@class='application_button button']")).click();
    	WebElement email = driver.findElement(By.xpath("//a[@class='job_application_email']"));
    	System.out.println("Email is "+ email.getText());
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
    	
    	
    	
    
    	
    	
    	
    	