package assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Windows.html");

        driver.manage().window().maximize();

        // Click the  New Tab Windows
        WebElement tabbedWindowTab = driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]"));
        tabbedWindowTab.click();

        // Click the button to open new window
        WebElement clickButton = driver.findElement(By.xpath("//button[contains(text(),'click')]"));
        clickButton.click();

        // main window handle
        String mainWindow = driver.getWindowHandle();

        // all window handles
        Set<String> allWindows = driver.getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                Thread.sleep(2000);
                //print
                System.out.println("New Window Title is: " + driver.getTitle());

                driver.close();
            }
        }

        // Switch back
        driver.switchTo().window(mainWindow);
        System.out.println("Back to Main Window: " + driver.getTitle());

        driver.quit();
    }
}

