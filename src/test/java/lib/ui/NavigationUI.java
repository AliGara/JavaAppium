package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationUI extends MainPageObject{

    protected static  String
        MY_LISTS_LINK,
        WINDOW_CLOSE,
        OPEN_NAVIGATION;

    public NavigationUI(RemoteWebDriver driver){
        super(driver);
    }

    public void setOpenNavigation() {
        if (Platform.getInstance().isMW()) {
            this.waitForElementAndClick(OPEN_NAVIGATION, "Cannot find and click open navigation button", 5);
        } else {
            System.out.println("Method setOpenNavigation() do nothing for platform " + Platform.getInstance().getPlatformVar());
        }
    }

    public void clickMyLists() {
        if (Platform.getInstance().isMW()) {
                this.tryClickElementWithFewAttempts(
                        MY_LISTS_LINK,
                        "Cannot find navigation button to My list",
                        5
                );
        } else {
            this.waitForElementAndClick(
                    MY_LISTS_LINK,
                    "Cannot find navigation button to My list",
                    5
            );
        }
    }

    public void clickCloseWindow() {
        this.waitForElementAndClick(
                WINDOW_CLOSE,
                "Cannot find navigation button to close window",
                5

        );
    }
}
