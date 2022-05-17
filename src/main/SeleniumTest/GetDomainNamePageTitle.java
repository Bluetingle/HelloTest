import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GetDomainNamePageTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("Https://se.godaddy.com");
        driver.manage().window().maximize();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("id-fb016f7a-780c-492d-92dc-b1627d458523")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("id-1601340d-b852-40f4-b456-8f8f2b11e6e8")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String title = driver.getTitle();
        if (title.equals("Domännamnssökning – köp och registrera tillgängliga domäner - GoDaddy SE")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Title is " + title);
        }
        driver.quit();
    }
}