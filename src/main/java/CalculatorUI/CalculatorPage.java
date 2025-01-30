package CalculatorUI;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class CalculatorPage extends BaseClass {

    public void selectNumber(int number) {
        driver.findElement(By.xpath("//div[@class='row-block']/div/input[@value='" + number + "']")).click();
    }

    public void clickOnPlus() {
        driver.findElement(By.id("add")).click();
    }

    public void clickOnMinus() {
        driver.findElement(By.id("subtract")).click();
    }

    public void clickOnMultiply() {
        driver.findElement(By.id("multiply")).click();
    }

    public void clickOnDivide() {
        driver.findElement(By.id("divide")).click();
    }

    public void clickOnEquals() {
        driver.findElement(By.xpath("//input[@value='=']")).click();
    }

    public void verifyResult(int expectedValue) {
        try {
            String actualValue = driver.findElement(By.id("display")).getText();
            Assert.assertEquals(expectedValue, Integer.parseInt(actualValue));
            Reporter.log("Expected value '" + expectedValue + "' verified successfully");
        } catch (Exception e) {
            Reporter.log("Expected value '" + expectedValue + "' is not available");
            Assert.fail();
        }

    }
}