import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.List;

public class HomeWork3_4 {
    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", "main.MainActivity");
        capabilities.setCapability("app", "/Users/malinka/Desktop/JavaAppiumAutomation/apks/org.wikipedia.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSearchAndVerificationOfCompliance() {

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
                "Cannot find 'Search Wikipedia' input",
                5
        );


        waitForElementAndSendKeys(
                By.xpath("//*[contains(@text, 'Search…')]"),
                "QA",
                "Cannot find search input",
                15
        );

        waitForElementPresent(
                By.id("org.wikipedia:id/search_results_list"),
                "Cannot find result topic searching by 'QA'",
                5
        );

        checkForComplianceWithTheSearch (
           By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_container0']"),
                "This is element not found",
                5

        );

        }


//        List<WebElement> e=driver.findElements(By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_container']"));
//        System.out.println(e.size());
//        for(WebElement element : e){
//            String title = element.findElement(By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_title']")).getAttribute("text") ;
//            int index = title.lastIndexOf("QA");
//
//            if(index == - 1){
//                throw new Error("Подстрока \"QA\" не найдена");
//            }
//        }



    private WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    private WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.click();
        return element;
    }

    private WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.sendKeys(value);
        return element;
    }

    private void checkForComplianceWithTheSearch (By by, String error_message, long timeoutInSeconds) {
        WebElement search_element = waitForElementPresent(by, error_message, timeoutInSeconds);
        List<WebElement> e = driver.findElements(by);
        System.out.println(e.size());
        for (WebElement element : e) {
            String title = element.findElement(By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_title']")).getAttribute("text");
            int index = title.lastIndexOf("QA");

            if (index == -1) {
                throw new Error("Подстрока \"QA\" не найдена");
            }
        }
    }
}




