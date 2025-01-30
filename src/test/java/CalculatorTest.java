import CalculatorUI.BaseClass;
import CalculatorUI.CalculatorPage;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseClass {
    CalculatorPage calculatorPage = new CalculatorPage();

    @Test(description = "TC0001: Addition")
    void addition() {
        calculatorPage.selectNumber(1);
        calculatorPage.clickOnPlus();
        calculatorPage.selectNumber(2);
        calculatorPage.clickOnEquals();
        calculatorPage.verifyResult(3);
    }

    @Test(description = "TC0002: Subtraction")
    void subtraction() {
        calculatorPage.selectNumber(5);
        calculatorPage.clickOnMinus();
        calculatorPage.selectNumber(2);
        calculatorPage.clickOnEquals();
        calculatorPage.verifyResult(3);
    }

    @Test(description = "TC0003 Multiplication")
    void Multiplication() {
        calculatorPage.selectNumber(4);
        calculatorPage.clickOnMultiply();
        calculatorPage.selectNumber(2);
        calculatorPage.clickOnEquals();
        calculatorPage.verifyResult(8);
    }

    @Test(description = "TC0004: Division")
    void Division() {
        calculatorPage.selectNumber(8);
        calculatorPage.clickOnDivide();
        calculatorPage.selectNumber(2);
        calculatorPage.clickOnEquals();
        calculatorPage.verifyResult(4);
    }
}