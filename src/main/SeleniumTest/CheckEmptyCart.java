import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class CheckEmptyCart {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://se.godaddy.com");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("id-9f67b69a-30b4-4f66-a93b-722eed8e8714")).click();
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        String currenturl = driver.getCurrentUrl();
        if (currenturl.equals("https://se.godaddy.com/empty-cart")){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
            System.out.println("Current Url is: "+ currenturl);
        }
        driver.quit();
    }
}
