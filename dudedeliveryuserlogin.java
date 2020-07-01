package dudedelivery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserLogin {

	public static void main(String[] args) {
		
		
		WebDriver driver = Dudebase.getDriver();
		driver.get("http://courier.dhamakaexpress.com/");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/header/div/button[2]/span"));
		login.click();
		
		
		WebElement phnnumber = driver.findElement(By.id("input-186"));
		phnnumber.sendKeys("+8801709815623");
		
		WebElement password = driver.findElement(By.id("input-190"));
		password.sendKeys("12345678");
		
		WebElement submit = driver.findElement(By.className("v-btn__content"));
		submit.click();
		
		WebElement validation=driver.findElement(By.className("heading"));
		String loginvalidation = validation.getText();
		
		System.out.println(loginvalidation);
		
		if(loginvalidation.equals("DELIVERY HISTORY")) 
			
			
			{
				
				System.out.println("Dude Delivery Login Test is Passed");
				
			}
			else {
				
				System.out.println("Dude Delivery Login Test is Failed");
				
			}
		}
		

	}


