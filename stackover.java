package newmasai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class stackover {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bstackdemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions ac = new Actions(driver);
	
     	WebElement selectItem = driver.findElement(By.xpath("(//*[.='Apple'])[3]"));
		ac.moveToElement(selectItem).click().sendKeys(Keys.ENTER).perform();

     	driver.findElement(By.xpath("(//*[.='Add to cart'])[1]")).click();
	
		driver.findElement(By.className("bag__quantity")).click();
		
		// Explicit wait
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));  
	    WebElement checkoutBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("buy-btn")));  

	    checkoutBtn.click();

		driver.quit();
		
	}

}
