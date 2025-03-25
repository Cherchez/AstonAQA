package HomeworkSelenium1.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.testng.Assert.assertTrue;


public class MainPage extends BasePage {
    public static final By CHECK_NAME = By.xpath("//*[contains(text(), 'Онлайн пополнение ')]");
    public static final By COOKIE_AGREE = By.id("cookie-agree");
    public static final By PARTNERS_LOGO = By.xpath("//*[@class='pay__partners']");
    public static final By MORE_DETAILS_ABOUT_SERVICE_LINK = By.xpath("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']");
    public static final By CONNECTION_PLACEHOLDER_EMAIL_FIELD = By.id("connection-email");
    public static final By CONNECTION_PLACEHOLDER_SUM_FIELD = By.id("connection-sum");
    public static final By CONNECTION_PLACEHOLDER_PHONE_FIELD = By.id("connection-phone");
    public static final By INTERNET_PLACEHOLDER_EMAIL_FIELD = By.id("internet-email");
    public static final By INTERNET_PLACEHOLDER_SUM_FIELD = By.id("internet-sum");
    public static final By INTERNET_PLACEHOLDER_PHONE_FIELD = By.id("internet-phone");
    public static final By INSTALMENT_PLACEHOLDER_EMAIL_FIELD = By.id("instalment-email");
    public static final By INSTALMENT_PLACEHOLDER_SUM_FIELD = By.id("instalment-sum");
    public static final By INSTALMENT_PLACEHOLDER_SCORE_FIELD = By.id("score-instalment");
    public static final By ARREARS_PLACEHOLDER_EMAIL_FIELD = By.id("arrears-email");
    public static final By ARREARS_PLACEHOLDER_SUM_FIELD = By.id("arrears-sum");
    public static final By ARREARS_PLACEHOLDER_SCORE_FIELD = By.id("score-arrears");


    public MainPage(WebDriver driver) {
        super(driver);
    }
    public MainPage open() {
        driver.get(BASE_URL);
        return this;
    }
    public MainPage checkName(){
        String actualError = driver.findElement(CHECK_NAME).getText();
        Assert.assertEquals(actualError, "Онлайн пополнение" +"\n" +
                "без комиссии", "Тест упал");
        return this;
    }
    public MainPage checkLogoPayPartners(){
        boolean partnersLogoIsNotAppear = driver.findElement(PARTNERS_LOGO).isDisplayed();
        assertTrue(partnersLogoIsNotAppear, "Логотипы партнеров не появились");
        return this;
    }
    public MainPage checkDetailsButton(){
        driver.findElement(MORE_DETAILS_ABOUT_SERVICE_LINK).click();
        String actualError = driver.findElement(By.xpath("//*[contains(text(), 'Оплата банковской картой')]")).getText();
        Assert.assertEquals(actualError, "Оплата банковской картой",
                "Тест упал");
        return this;
    }
    public MainPage testEmailPlaceHolderOnConnetion(){
        String placeholder = driver.findElement(CONNECTION_PLACEHOLDER_EMAIL_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "E-mail для отправки чека", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testSumPlaceHolderOnConnetion(){
        String placeholder = driver.findElement(CONNECTION_PLACEHOLDER_SUM_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Сумма", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testPhonePlaceHolderOnConnetion(){
        String placeholder = driver.findElement(CONNECTION_PLACEHOLDER_PHONE_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Номер телефона", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testEmailPlaceHolderOnInternet(){
        String placeholder = driver.findElement(INTERNET_PLACEHOLDER_EMAIL_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "E-mail для отправки чека", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testSumPlaceHolderOnInternet(){
        String placeholder = driver.findElement(INTERNET_PLACEHOLDER_SUM_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Сумма", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testPhonePlaceHolderOnInternet(){
        String placeholder = driver.findElement(INTERNET_PLACEHOLDER_PHONE_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Номер телефона", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testEmailPlaceHolderOnInstalment(){
        String placeholder = driver.findElement(INSTALMENT_PLACEHOLDER_EMAIL_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "E-mail для отправки чека", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testSumPlaceHolderOnInstalment(){
        String placeholder = driver.findElement(INSTALMENT_PLACEHOLDER_SUM_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Сумма", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testScorePlaceHolderOnInstalment(){
        String placeholder = driver.findElement(INSTALMENT_PLACEHOLDER_SCORE_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Номер счета на 44", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testEmailPlaceHolderOnArrears(){
        String placeholder = driver.findElement(ARREARS_PLACEHOLDER_EMAIL_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "E-mail для отправки чека", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testSumPlaceHolderOnArrears(){
        String placeholder = driver.findElement(ARREARS_PLACEHOLDER_SUM_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Сумма", "Плейсхолдер не найден");
        return this;
    }
    public MainPage testScorePlaceHolderOnArrears(){
        String placeholder = driver.findElement(ARREARS_PLACEHOLDER_SCORE_FIELD).getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Номер счета на 2073", "Плейсхолдер не найден");
        return this;
    }
    public MainPage acceptCookies() {
        try {
            driver.findElement(COOKIE_AGREE).click();
        } catch (ElementNotInteractableException e) {
            System.err.println("Ошибка: элемент есть, но с ним нельзя взаимодействовать!");
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден в DOM!");
        }
        return this;
    }
}
