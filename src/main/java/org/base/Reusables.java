package org.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Reusables {
    public static void maximize(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static void url(WebDriver driver, String url) {
        driver.get(url);
    }

    public static String getAttribute(WebElement element, String attributeName) {
        String value = element.getAttribute(attributeName);
        return value;
    }

    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static void sendValues(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void clear(WebElement element) {
        element.clear();
    }

    public static void jsClick(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public static void mini(WebDriver driver) {
        driver.manage().window().minimize();
    }

    public static void fullscreen(WebDriver driver) {
        driver.manage().window().fullscreen();
    }

    public static void getsize(WebDriver driver) {
        driver.manage().window().getSize();
    }

    public static void click(WebElement element) {
        element.click();

    }

    public static void sendkeys(WebElement element, String value) {
        element.sendKeys(value);

    }

    public static void selectIndex(WebElement element, int index) {
        Select s = new Select(element);
        s.selectByIndex(index);

    }

    public static void selectValue(WebElement element, String value) {
        Select s = new Select(element);
        s.selectByValue(value);
    }

    public static void selectText(WebElement element, String value) {
        Select s = new Select(element);
        s.selectByVisibleText(value);

    }

    public static void alert_Accept(WebDriver driver) {
        Alert a = driver.switchTo().alert();
        a.accept();

    }

    public static void alert_Dismiss(WebDriver driver) {
        Alert a = driver.switchTo().alert();
        a.dismiss();
    }

    public static void alertSendkeys(WebDriver driver, String value) {
        Alert a = driver.switchTo().alert();
        a.sendKeys(value);

    }

    public static String alertGetText(WebDriver driver) {
        Alert a = driver.switchTo().alert();
        return a.getText();

    }


    public static void rightClick(WebDriver driver, WebElement element) {
        Actions b = new Actions(driver);
        b.contextClick(element).build().perform();

    }

    public static void leftClick(WebDriver driver, WebElement element) {
        Actions c = new Actions(driver);
        c.click(element).build().perform();

    }

    public static void downBtn() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

    }

    public static void enterBtn() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_UP);
        r.keyRelease(KeyEvent.VK_UP);

    }

    public static void implicitWait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

    }

    public static void scrollToElement(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
    }

    public static String getElementText(WebElement element){
        return element.getText();
    }

    public static void taksScreenShot(WebDriver driver, String image) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File store = new File("C:\\Users\\DELL\\IdeaProjects\\Calculator_Poc\\target\\Screenshots\\"+image+".png");
        FileUtils.copyFile(file,store);
    }

}
