package CalculatorUI;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    protected static WebDriver driver;

    @BeforeTest
    public void launchApplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html");
    }

    @AfterTest
    public void clearResult() {
        driver.findElement(By.xpath("//input[@value='C']")).click();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
