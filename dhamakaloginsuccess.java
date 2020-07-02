package dhamakadigital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dudedelivery.Dudebase;


public class DhamakaLogInSuccess {

	public static void main(String[] args) {
		
		

      WebDriver driver=Dudebase.getDriver();
		
		  driver.get("http://www.dhamakadigital.com/");
		
		  WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/section[2]/div/div[1]/div/div[3]/div/ul/li[2]/a"));
		  element.click();
		
		  element= driver.findElement(By.xpath("//*[@id=\"__next\"]/header/section[2]/div/div[1]/div/div[3]/div/ul/li[2]/ul/li[2]/a"));
      element.click();
        
      element=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div[2]/div/div/div/div[1]/div/form/div[1]/div[2]/div[2]/input"));
		  element.sendKeys("01767774669");
		
		  element=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div[2]/div/div/div/div[1]/div/form/div[2]/div[2]/input"));
	    element.sendKeys("123456");
	
	    element=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div[2]/div/div/div/div[1]/div/form/div[3]/button"));
	    element.click();
	    
	    element = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/section[2]/div/div[1]/div/div[3]/div/ul/li[2]/a"));
		  element.click();
	    
	    WebElement profilename = driver.findElement(By.className("user-profile-name"));
	    String shakil = profilename.getText();
	    
	    
        if(shakil.equals("Ahmed Shakil")) {
	    	
	    	System.out.println("Login is Passed");
	    	
	    }
	    else 
	    {
	    	System.out.println("Login is Failed");
	    }
		

	}

}
