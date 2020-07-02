package dhamakadigital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import dudedelivery.Dudebase;



public class ShopCreation {

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
			
			WebElement addshop = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/section[2]/div/div[1]/div/div[3]/div/ul/li[2]/ul/li[3]/a"));
			addshop.click();
			
			
			
			WebElement shopName = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[2]/div[1]/div[1]/input"));
            shopName.sendKeys("SWAPNO");
            
            WebElement email = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[2]/div[2]/div[1]/input"));
            email.sendKeys("shakildipu33@gmail.com");
            
            WebElement shopalias = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[2]/div[1]/div[2]/input"));
            shopalias.sendKeys("bazar");
            
            WebElement phonenumber = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[2]/div[2]/div[2]/input"));
            phonenumber.sendKeys("01754929023");
            
            WebElement address = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[3]/div[1]/div/input"));
            address.sendKeys("mirpur 10");
            
            WebElement returnaddress = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[3]/div[2]/div/input"));
            returnaddress.sendKeys("mohakhali");
            
            WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[4]/div[2]/div[1]/input"));
            zipcode.sendKeys("1216");
            
            Select country = new Select(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[4]/div[2]/div[2]/select")));
            country.selectByIndex(1);
            
            Select state = new Select(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[4]/div[1]/div[2]/select")));
            state.selectByIndex(1);
            
            Select city = new Select(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[4]/div[1]/div[1]/select")));
            city.selectByIndex(1);
            
            WebElement headingtext = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[5]/div/div/input"));
            headingtext.sendKeys("swapno express");
            
            WebElement announcement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[1]/div[6]/div/div/input"));
            announcement.sendKeys("new shop is coming");
            
            WebElement defaultprice = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[2]/div[2]/div[1]/div[1]/input"));
            defaultprice.sendKeys("800");
            
            WebElement processingtime = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[2]/div[2]/div[2]/div[2]/input"));
            processingtime.sendKeys("3");
            
            WebElement priceforeachquantity = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[2]/div[2]/div[1]/div[2]/input"));
            priceforeachquantity.sendKeys("700");
            
            WebElement shippinganddelivery = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[2]/div[2]/div[2]/div[3]/input"));
            shippinganddelivery.sendKeys("yes");
            
            WebElement shippingpolicy = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[2]/div[2]/div[1]/div[3]/input"));
            shippingpolicy.sendKeys("yes");
            
            WebElement returnandreplacementpolicy = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[2]/div[2]/div[2]/div[4]/input"));
            returnandreplacementpolicy.sendKeys("yes");
            
            WebElement refundpolicy = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[2]/div[2]/div[1]/div[4]/input"));
            refundpolicy.sendKeys("yes");
            
            WebElement shopcreate = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/form/div[3]/div/button"));
            shopcreate.click();
            
            
           
	}

}
