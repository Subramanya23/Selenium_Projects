package Selenuim_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void backendTestCase() throws InterruptedException {
    	
    	WebElement username = driver.findElement(By.id("user_login"));
    	username.sendKeys("root");
    	
    	WebElement password = driver.findElement(By.id("user_pass"));
    	password.sendKeys("pa$$w0rd");
    	
    	driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
    	Thread.sleep(2000);
    	
    	WebElement textArea = driver.findElement(By.id("post-title-0"));
    	textArea.sendKeys("Position1");
    	Thread.sleep(2000);
    	
    	WebElement companyWeb = driver.findElement(By.id("_company_website"));
    	companyWeb.sendKeys("www.IBM.com");
    	Thread.sleep(2000);
    	
    	WebElement companyTwitter = driver.findElement(By.id("_company_twitter"));
    	companyTwitter.sendKeys("@IBM");
    	Thread.sleep(2000);
    	
    	WebElement dateWidget = driver.findElement(By.xpath("//input[@id='_job_expires']"));
    	List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

    	for (WebElement cell: columns){
    	   //Select 13th Date 
    	   if (cell.getText().equals("8")){
    	      cell.findElement(By.linkText("8")).click();
    	      break;
    	   }
    	}	   
    
    	WebElement jobLocation = driver.findElement(By.id("_job_location"));
    	jobLocation.sendKeys("India");
    	Thread.sleep(2000);
    	
    	WebElement compName = driver.findElement(By.id("_company_name"));
    	compName.sendKeys("IBM");
    	Thread.sleep(2000);
    	
    	WebElement compTag = driver.findElement(By.id("_company_tagline"));
    	compTag.sendKeys("Think");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//a[@class='components-button is-secondary']")).click();
    	Thread.sleep(2000);
    }
    
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
