package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement multi=driver.findElement(By.id("cars"));
		Select sel=new Select(multi);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		//sel.deselectByValue("volvo");
		
		List<WebElement> li=sel.getAllSelectedOptions();
		for( WebElement webe : li)
		{
			System.out.println(webe.getText());
			
		}
		driver.quit();
		
		
		
	}
}
