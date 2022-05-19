import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetPageTitle {
    public static void main (String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("Https://se.godaddy.com");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
         e.printStackTrace();
        }
        String title = driver.getTitle();
        if (title.equals("Domännamn, webbplatser, verktyg för värdtjänster och onlinemarknadsföring – GoDaddy SE")) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
            System.out.println("Pagetitle is: " + title);
        }
        driver.quit();
    }
}
