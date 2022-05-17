import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Hello {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
        try {
            Thread.sleep(5000);
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
