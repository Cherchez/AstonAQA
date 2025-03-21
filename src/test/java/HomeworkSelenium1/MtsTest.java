package HomeworkSelenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MtsTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser, ITestContext testContext) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//            options.addArguments("--headless");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(description = "Проверка блока «Онлайн пополнение без комиссии»")
    public void checkName(){
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
        String actualError = driver.findElement(By.xpath("//*[contains(text(), 'Онлайн пополнение ')]")).getText();
        assertEquals("Wrong text", "Онлайн пополнение\n" +
                "без комиссии", actualError);
    }
    @Test(description = "Проверяем наличие логотипов платёжных систем")
    public void checkLogoPayPartners(){
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
        boolean partnersLogoIsNotAppear = driver.findElement(By.xpath("//*[@class='pay__partners']")).isDisplayed();
        assertTrue(partnersLogoIsNotAppear, "Логотипы партнеров не появились");
    }
    @Test(description = "Проверяем работу ссылки «Подробнее о сервисе»")
    public void checkDetailsButton(){
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
        driver.findElement(By.xpath("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']")).click();
        String actualError = driver.findElement(By.xpath("//*[contains(text(), 'Оплата банковской картой')]")).getText();
        Assert.assertEquals(actualError, "Оплата банковской картой",
                "Тест упал");
    }
    @Test(description = "Заполняем поля и проверяем работу кнопки «Продолжить»")
    public void FillingFieldsAndCheckButton(){
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
        driver.findElement(By.id("connection-phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).sendKeys("10");
        driver.findElement(By.xpath("//*[@id='pay-connection']/button[text()='Продолжить']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[class=bepaid-iframe]")));
        WebElement iframe = driver.findElement(By.cssSelector("iframe[class=bepaid-iframe]"));
        driver.switchTo().frame(iframe);
        String actualSuccessful = driver.findElement(By.xpath("//*[@class='card-page__card-pay ng-star-inserted']/span[@class='card-page__card-pay__title']")).getText();
        Assert.assertEquals(actualSuccessful, "или используйте карту",
                "Payment window hasn't opened");
    }
//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
