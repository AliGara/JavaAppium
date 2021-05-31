package lib.ui.mobile_web;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWArticlePageObject extends ArticlePageObject {
    static {
        TITLE = "css:#content h1";
        FOOTER_ELEMENT = "css:footer";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = "css:#page-actions a#ca-watch.mw-ui-icon-wikimedia-star-base20";
        OPTIONS_REMOVE_FROM_MY_LIST_BUTTON = "css:#page-actions a#ca-watch.mw-ui-icon-wikimedia-unStar-progressive";

    }

    public MWArticlePageObject (RemoteWebDriver driver) {
        super(driver);
    }
}
