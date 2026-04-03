package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookRegistration {

	public static void main(String[] args)
	{
		 WebDriver driver;
		 WebDriverWait wait;
		 
		
		driver=new ChromeDriver();
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		By email_loc=By.id("email");
		WebElement email_enter=wait.until(ExpectedConditions.visibilityOfElementLocated(email_loc));
		email_enter.sendKeys("Aswin");
		
		
				
				//driver.findElement(By.id("email")).sendKeys("Aswin");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Blelow line is not working check with trainer
		driver.findElement(By.name("firstname")).sendKeys("Aswin");
		driver.findElement(By.name("lastname")).sendKeys("banu");
		
		
		 WebElement date=driver.findElement(By.id("day"));
		 Select select=new Select(date);
		 select.selectByIndex(3);
		 
		 WebElement month=driver.findElement(By.id("month"));
		 Select select1=new Select(month);
		 select1.selectByValue("2");
		 
		 WebElement year=driver.findElement(By.id("year"));
		 Select select2=new Select(year);
		 select2.selectByVisibleText("2012");
		 
		 //below code is not working check with trainer
		 WebElement RB=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		//input[@name="sex" and @value="1"]
		RB.click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("0096597953877");
		driver.findElement(By.id("password_step_input")).sendKeys("Muna@123");
		
		WebElement subbtn=driver.findElement(By.name("websubmit"));
		subbtn.click();
		
		
		
		
			
	}
	
	
	
}
