package HomeworkSelenium1.tests;

import HomeworkSelenium1.tests.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class MtsTest extends BaseTest {

    @Test(description = "Проверка блока «Онлайн пополнение без комиссии»")
    public void checkName(){
        mainPage
                .open()
                .acceptCookies()
                .checkName();
    }
    @Test(description = "Проверяем наличие логотипов платёжных систем")
    public void checkLogoPayPartners(){
        mainPage
                .open()
                .acceptCookies()
                .checkLogoPayPartners();
    }
    @Test(description = "Проверяем работу ссылки «Подробнее о сервисе»")
    public void checkDetailsButton(){
        mainPage
                .open()
                .acceptCookies()
                .checkDetailsButton();
    }
    @Test(description = "Заполняем поля и проверяем работу кнопки «Продолжить»")
    public void FillingFieldsAndCheckButton(){
        mainPage
                .open()
                .acceptCookies();
        driver.findElement(By.id("connection-phone")).sendKeys("(29)777-77-77");
        driver.findElement(By.id("connection-sum")).sendKeys("10");
        driver.findElement(By.xpath("//*[@id='pay-connection']/button[text()='Продолжить']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class=bepaid-iframe]")));
        boolean actualSuccessful = driver.findElement(By.cssSelector("[id=google-pay-button]")).isDisplayed();
        Assert.assertEquals(actualSuccessful, "или используйте карту",
                "Payment window hasn't opened");
    }
    @Test(description = "Проверяем placeholder в поле <Email для отправки чека>  во вкладке <Услуги связи>")
    public void testEmailPlaceholderOnConnection() {
        mainPage
                .open()
                .acceptCookies()
                .testEmailPlaceHolderOnConnetion();
    }
    @Test(description = "Проверяем placeholder в поле <Сумма>  во вкладке <Услуги связи>")
    public void testSumPlaceholderOnConnection() {
        mainPage
                .open()
                .acceptCookies()
                .testSumPlaceHolderOnConnetion();
    }
    @Test(description = "Проверяем placeholder в поле <Номер телефона> во вкладке <Домашний интернет>")
    public void testPhonePlaceholderOnInternet() {
        mainPage
                .open()
                .acceptCookies()
                .testPhonePlaceHolderOnInternet();
    }
    @Test(description = "Проверяем placeholder в поле <Email для отправки чека>  во вкладке <Домашний интернет>")
    public void testEmailPlaceholderOnInternet() {
        mainPage
                .open()
                .acceptCookies()
                .testEmailPlaceHolderOnInternet();
    }
    @Test(description = "Проверяем placeholder в поле <Сумма>  во вкладке <Домашний интернет>")
    public void testSumPlaceholderOnInternet() {
        mainPage
                .open()
                .acceptCookies()
                .testSumPlaceHolderOnInternet();
    }
    @Test(description = "Проверяем placeholder в поле <Номер телефона> во вкладке <Услуги связи>")
    public void testPhonePlaceholderOnConnection() {
        mainPage
                .open()
                .acceptCookies()
                .testPhonePlaceHolderOnConnetion();
    }
    @Test(description = "Проверяем placeholder в поле <Email для отправки чека>  во вкладке <Рассрочка>")
    public void testEmailPlaceholderOnInstalment() {
        mainPage
                .open()
                .acceptCookies()
                .testEmailPlaceHolderOnInstalment();
    }
    @Test(description = "Проверяем placeholder в поле <Сумма>  во вкладке <Рассрочка>")
    public void testSumPlaceholderOnInstalment() {
        mainPage
                .open()
                .acceptCookies()
                .testSumPlaceHolderOnInstalment();
    }
    @Test(description = "Проверяем placeholder в поле <Номер счета на 44> во вкладке <Рассрочка>")
    public void testScorePlaceholderOnInstalment() {
        mainPage
                .open()
                .acceptCookies()
                .testScorePlaceHolderOnInstalment();
    }
    @Test(description = "Проверяем placeholder в поле <Email для отправки чека>  во вкладке <Задолженность>")
    public void testEmailPlaceholderOnArrears() {
        mainPage
                .open()
                .acceptCookies()
                .testEmailPlaceHolderOnArrears();
    }
    @Test(description = "Проверяем placeholder в поле <Сумма>  во вкладке <Задолженность>")
    public void testSumPlaceholderOnArrears() {
        mainPage
                .open()
                .acceptCookies()
                .testSumPlaceHolderOnArrears();
    }
    @Test(description = "Проверяем placeholder в поле <Номер счета на 2073> во вкладке <Задолженность>")
    public void testScorePlaceholderOnArrears() {
        mainPage
                .open()
                .acceptCookies()
                .testScorePlaceHolderOnArrears();
    }
}
