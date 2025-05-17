package Masai.com;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    // 1. Simple Alert - Just OK
        // ========================
        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
        
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

        Alert simpleAlert = driver.switchTo().alert();
       
        simpleAlert.accept(); 
        
        // 2. Confirmation Alert - OK & Cancel
        
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        
        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();

        Alert confirmAlert = driver.switchTo().alert();
      
        confirmAlert.dismiss(); 

        // 3. Prompt Alert 
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        //promptAlert.sendKeys("Student");
        promptAlert.accept();

        // Close the browser
        driver.quit();
		
	}

}
