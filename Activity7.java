package Selenuim_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Activity7 {
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
    	
    	driver.findElement(By.xpath("//a[contains(text(),'Post a Job')]")).click();
    	Thread.sleep(5000);
    	
    	WebElement email = driver.findElement(By.id("create_account_email"));
    	email.sendKeys("subbu.hp08@gmail.com");
    	Thread.sleep(5000);
    	
    	WebElement jobTitle = driver.findElement(By.id("job_title"));
    	jobTitle.sendKeys("AutomationTester");
    	Thread.sleep(5000);
    	
    	WebElement jobLocation = driver.findElement(By.id("job_location"));
    	jobLocation.sendKeys("Bangalore");
    	Thread.sleep(5000);
    	
    	Select objSelect =new Select(driver.findElement(By.id("job_type")));
    	objSelect.selectByVisibleText("Full Time");
    	Thread.sleep(5000);
    	
    	WebElement applicationUrl = driver.findElement(By.id("application"));
    	applicationUrl.sendKeys("https://alchemy.hguy.co/jobs/");
    	Thread.sleep(5000);
    	
    	driver.switchTo().frame(0);
    	WebElement description = driver.findElement(By.cssSelector("#tinymce"));
    	description.sendKeys("Fulltime job");
    	driver.switchTo().defaultContent();
    
    	
    	WebElement companyName = driver.findElement(By.id("company_name"));
    	companyName.sendKeys("IBM India PVT LTD");
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("//input[@name='submit_job']")).click();
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("//a[contains(text(),'click here')]")).click();
    	Thread.sleep(5000);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	