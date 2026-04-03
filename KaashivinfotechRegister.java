package Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KaashivinfotechRegister {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testing.kaashivinfotech.in/Register.html");
		driver.manage().window().maximize();
		
		
				
				
		
		
	WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys("Aswin");
	
	
	
	
	WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastname.sendKeys("Banu");
	
	WebElement textareatext=driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
	
	textareatext.sendKeys("Salmiya, kuwait");
	
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aswinbanu123@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("97953877");
	
	WebElement maleRadio = driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']"));
	if (!maleRadio.isSelected()) {
	    maleRadio.click();
	}
	
	WebElement cricketcheck=driver.findElement(By.id("checkbox2"));
	cricketcheck.click();
	
	WebElement skilldropdown=driver.findElement(By.id("Skills"));
	Select select=new Select(skilldropdown);
	select.selectByValue("js");
driver.findElement(By.xpath("//span[@role='presentation']")).click();


List<WebElement> countries = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));

//List<WebElement> countries = driver.findElements(By.id("country"));
for(WebElement country : countries) {
	if(country.getText().equalsIgnoreCase("india")) {
		country.click();
	}
}

WebElement year=driver.findElement(By.id("yearbox"));	
Select selectyear=new Select(year);
selectyear.selectByVisibleText("1989");





//<List>WebElements countries=driver.findElements(By.xpath("")) 
	
	
	
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

System.out.println(skilldropdown.getText());
System.out.println(skilldropdown.getTagName());


	
	
	
	
	
		
		

	}
}
