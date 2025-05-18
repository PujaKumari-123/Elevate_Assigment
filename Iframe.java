package assigment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Iframe {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Automatically downloads the right version of ChromeDriver
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
    }

    @Test
    public void testIframeInteraction() throws InterruptedException {
        Thread.sleep(2000);
        WebElement iframe = driver.findElement(By.id("frm1"));

        driver.switchTo().frame(iframe);


     WebElement button = driver.findElement(By.id("selectnav1"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].scrollIntoView(true);",button);

     driver.switchTo().defaultContent();



    }
}
