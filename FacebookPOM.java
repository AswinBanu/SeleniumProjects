package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPOM {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				
		driver.findElement(By.linkText("Create new account")).click();
		
		POMClass PC=new POMClass();
			
		
		Select selectd=new Select(PC.selectday(driver));
			
		selectd.selectByVisibleText("28");
		
		Select selectm=new Select(PC.selectmonth(driver));
		selectm.selectByVisibleText("Jun");
		
		
		Select selecty=new Select(PC.selectyear(driver));
		selecty.selectByVisibleText("2005");
		
		
		//with pagefactory
		
		
		
		
	}

}
