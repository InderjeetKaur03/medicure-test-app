package com.testing.medicure_test_app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Testing of medicure app
 *
 */
public class App 
{	
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriver driver = new ChromeDriver();

    	//Opening Web Application
    			driver.get("http://99.79.49.186:8082/contact.html");
    			Thread.sleep(2000);

    			String title = driver.getTitle();
    			System.out.println("Title is :" + title);

    	// 1. Find name text box and fill it
    			WebElement Name_textbox = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
    			Name_textbox.sendKeys("Inderjeet");
    			Thread.sleep(2000);
    			System.out.println("Name Entered");

    	// 2. Find phone number text box and fill it
    			WebElement phoneNumber_textbox = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
    			phoneNumber_textbox.sendKeys("123456789");
    			Thread.sleep(2000);
    			System.out.println("Phone number Entered");

    	// 3. Find email text box and fill it
    			WebElement email_textbox = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
    			email_textbox.sendKeys("inderjeetkaur@xyz.com");
    			Thread.sleep(2000);
    			System.out.println("Email Entered");

    	// 4. Find message text box and fill it
    			WebElement message_textbox = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
    			message_textbox.sendKeys("Hello from Inder");
    			Thread.sleep(2000);
    			System.out.println("Message Entered");
    			
    	// 5. Send message
    			WebElement send_button = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
    			send_button.click();

    			System.out.println("Send clicked");

    			String response = driver.findElement(By.id("message")).getText();
    			System.out.println(response);

    			driver.quit();
        
    }
}
