package step_definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
;

public class send_email {

	WebDriver driver;

	@cucumber.api.java.en.Given("^User is on Gmail Page$")
	public void user_is_on_gmail_Page() throws Throwable {
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/gmail/");
	}
	
	@And("^User Navigate to Gmail sign_in Page$")
	public void user_Navigate_to_Gmail_Sign_inPage() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
		}
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("log")).sendKeys("dimple@yopmail.com"); 	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	    driver.findElement(By.id("login")).click();
		}
	
	@Then("^User clicks to the compose button$")
	public void User_clicks_to_the_compose_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\":mc\"]/div/div")).click();
	}
	
	@Then("^User enters the body$")
	public void User_enters_the_body() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\":t6\"]")).click(); //click on "body"
		driver.findElement(By.xpath("//*[@id=\":t6\"]")).sendKeys("Automation QA test for Incubyte");
	}
	
	@cucumber.api.java.en.Then("^user send an email with subject$")
	public void User_send_an_email_with_subject() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\":si\"]")).click(); //click on "To" field
		driver.findElement(By.id("t6")).sendKeys("incubyte.co"); 
		driver.findElement(By.xpath("//*[@id=\":s0\"]")).click(); //click on "Subject" field
		driver.findElement(By.xpath("//*[@id=\":s0\"]")).sendKeys("incubyte"); 
		driver.findElement(By.xpath("//*[@id=\":rq\"]")).click(); //click on "Send" field

	}
}
		
	
	

