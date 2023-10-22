import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginFailed {
    @Test
    public void  open_browser(){

        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";
        String username = "standard_user";
        String password = "secretsauce";
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();

        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("TESTING LOGIN, Password not registered");


        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        String errorMessage = driver.findElement(By.className("error-message-container")).getText();
        Assert.assertEquals("Swag Labs", errorMessage);
//        driver.close();
    }

}
