import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class BuyDomain {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://se.godaddy.com");
        driver.manage().window().maximize();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("id-fb016f7a-780c-492d-92dc-b1627d458523")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("id-1601340d-b852-40f4-b456-8f8f2b11e6e8")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement searchinput = driver.findElement(By.name("domainToCheck"));
        searchinput.sendKeys("testinggodadwithselenium.se");
        driver.findElement(By.className("searchText")).click();
    }
}
