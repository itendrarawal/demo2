package Demoproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * example
 */
public class example {    
    
    @Test
    public  void exampe() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
        driver.get("https://www.atlantisuniversity.edu/");

       // System.out.println("hi");
        
    }
}