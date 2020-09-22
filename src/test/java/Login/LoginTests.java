package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //Import the selenium driver
    private WebDriver driver;
    //Import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        //Input project URL github login
        driver.get("https://github.com/login");
        //wait globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //locate username field
        driver.findElement(By.id("login_field")).sendKeys("");
        //locate password field
        driver.findElement(By.id("password")).sendKeys("");
        //Click on the sign in button
        driver.findElement(By.name("commit")).click();
        Thread.sleep(10000);
        //close the browser after test
        driver.quit();
    }
    //Initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}
