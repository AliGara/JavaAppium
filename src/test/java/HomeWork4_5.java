import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.Platform;
import lib.ui.*;
import lib.ui.factories.ArticlePageObjectFactory;
import lib.ui.factories.MyListsPageObjectFactory;
import lib.ui.factories.NavigationUIFactory;
import lib.ui.factories.SearchPageObjectFactory;
import org.junit.Assert;
import org.junit.Test;

@Epic("Tests for my list")
public class HomeWork4_5 extends CoreTestCase {
    private static final String name_of_folder = "Learning programming for automation";
    private static final String
            login = "Alinka nsk",
            password = "!2wsxzaQ";

    @Test
    @Features(value = {@Feature(value = "Search"), @Feature(value = "Article"), @Feature(value = "My List")})
    @DisplayName("Test search articles and added to my saved list")
    @Description("Test open 2 articles and added to my saved list")
    @Step("Starting test save two articles to my list")
    @Severity(value = SeverityLevel.NORMAL)
    public void testSaveTwoArticlesToMyList() throws InterruptedException {
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");
        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);
        String article_title = ArticlePageObject.getArticleTitle();
        Assert.assertEquals(
                "Cannot find article title (Java)",
                "Java (programming language)",
                article_title
        );

        if (Platform.getInstance().isAndroid()) {
            ArticlePageObject.addArticleToMyList(name_of_folder);
        } else {
            ArticlePageObject.addArticlesToMySaved();
        }

        if (Platform.getInstance().isMW()){
            Thread.sleep(2000);
            AuthorizationPageObject Auth = new AuthorizationPageObject(driver);
            Auth.clickAuthButton();
            Auth.enterLoginData(login, password);
            Auth.submitForm();

            ArticlePageObject.waitForTitleElement();
            Assert.assertEquals("We are not on the same page after login",
                    article_title,
                    ArticlePageObject.getArticleTitle()
            );

            ArticlePageObject.addArticlesToMySaved();
        }

        ArticlePageObject.closeArticle();

        if (Platform.getInstance().isIOS()) {
            SearchPageObject.clickClearSearch();
        }

        SearchPageObject.initSearchInput();

        SearchPageObject.typeSearchLine("Python");


        if (Platform.getInstance().isAndroid()) {
            SearchPageObject.clickByArticleWithSubstring("General-purpose programming language");
        } else {
            SearchPageObject.clickByArticleWithSubstring("General-purpose, high-level programming language");
        }

        if (Platform.getInstance().isAndroid()) {
            ArticlePageObject.addAnotherArticleToMyList("Learning programming for automation");
        } else {
            ArticlePageObject.addArticlesToMySaved();
        }

        ArticlePageObject.closeArticle();

        if (Platform.getInstance().isIOS()) {
            SearchPageObject.clickCancelSearch();
        }

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.setOpenNavigation();
        NavigationUI.clickMyLists();

        MyListsPageObject MyListsPageObject = MyListsPageObjectFactory.get(driver);

        if (Platform.getInstance().isAndroid()) {
            MyListsPageObject.openFolderByName(name_of_folder);
        }

        if (Platform.getInstance().isIOS()) {
            NavigationUI.clickCloseWindow();
        }

        MyListsPageObject.swipeByArticleToDelete(article_title);

        MainPageObject MainPageObject = new MainPageObject(driver);

        if (Platform.getInstance().isIOS()) {
            MainPageObject.waitForElementPresent(
                    "xpath://XCUIElementTypeStaticText[@name='General-purpose, high-level programming language']",
                    "No second article found after deletion",
                    5
            );
        } else if (Platform.getInstance().isAndroid()){
            MainPageObject.waitForElementPresent(
                    "xpath://*[@text='general-purpose programming language']",
                    "No second article found after deletion",
                    5
            );
        } else {
            MainPageObject.waitForElementPresent(
                    "xpath://div//a[text()='Fbergo']",
                    "No second article found after deletion",
                    5
            );
        }
    }
}
