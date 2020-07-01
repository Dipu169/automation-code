package dudedelivery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationFlow {

	public static void main(String[] args) {
		
		
		WebDriver driver = Dudebase.getDriver();
		driver.get("http://automationpractice.com/");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("shakildip77@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement dress= driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(dress).perform();
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")).click();
        driver.findElement(By.className("icon-plus")).click();
        
        Select size=new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
        size.selectByIndex(2);
        
        driver.findElement(By.id("color_24")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        
        WebElement cart= driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b"));
        Actions cartact=new Actions(driver);
        cartact.moveToElement(cart).perform();
        
        driver.findElement(By.xpath("//*[@id=\"button_order_cart\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
        driver.findElement(By.className("cheque")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
        
        WebElement confirm= driver.findElement(By.className("page-heading"));
        String result= confirm.getText();
        System.out.println(result);
        
        if(result.equals("ORDER CONFIRMATION")) {
        	
        	System.out.println("Flow is passed successfully");
        }
        else {
        
        	System.out.println("Flow is failed");
	}

}
}
