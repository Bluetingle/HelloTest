import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyRedirect {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://godaddy.com");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
        String currenturl = driver.getCurrentUrl();
        if (currenturl.equals("https://se.godaddy.com/")) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
            System.out.println("Current Url is: "+currenturl);
        }
        driver.quit();
    }
}
