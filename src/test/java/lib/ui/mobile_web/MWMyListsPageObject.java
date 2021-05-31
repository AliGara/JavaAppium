package lib.ui.mobile_web;

import lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWMyListsPageObject extends MyListsPageObject {
    static {
        ARTICLE_BY_TITLE_TPL = "xpath://div[contains(@class,'page-heading')]/h1[contains(text(),'{TITLE}')]";
        REMOVE_FROM_SAVED_BUTTON = "xpath://div[contains(@class,'page-heading')]/h1[contains(text(),'{TITLE}')]/../../div[contains(@class,'watched')]";
    }
    public MWMyListsPageObject (RemoteWebDriver driver) {
        super(driver);
    }
}
