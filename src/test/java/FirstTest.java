//import lib.CoreTestCase;
//import lib.ui.*;
//import lib.ui.factories.ArticlePageObjectFactory;
//import lib.ui.factories.SearchPageObjectFactory;
//import org.junit.Test;
//
//
//public class FirstTest extends CoreTestCase {
//
//    @Test
//    public void testSearch () {
//
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
////                "Cannot find 'Search Wikipedia' input",
////                5
////        );
////
////        MainPageObject.waitForElementAndSendKeys(
////                By.xpath("//*[contains(@text, 'Search…')]"),
////                "Java",
////                "Cannot find search input",
////                15
////        );
////
////        MainPageObject.waitForElementPresent(
////                By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_container']//*[@text = 'Object-oriented programming language']"),
////                "Cannot find 'Object-oriented programming language' topic searching by 'Java'",
////                15
////        );
//
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput(); //Это заменяет 1 шаг (waitForElementAndClick)
//        SearchPageObject.typeSearchLine("Java"); //Заменяет 2 шаг
//        SearchPageObject.waitForSearchResult("Object-oriented programming language"); //Заменяет 3 шаг
//    }
//
//    @Test
//    public void testCancelSearch() {
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        SearchPageObject.waitForCancelButtonToAppear();
//        SearchPageObject.clickCancelSearch();
//        SearchPageObject.waitForCancelButtonToDisappear();
//    }
//
//    @Test
//    public void testCompareArticleTitle(){
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
////                "Cannot find 'Search Wikipedia' input",
////                5
////        );
////
////        MainPageObject.waitForElementAndSendKeys(
////                By.xpath("//*[contains(@text, 'Search…')]"),
////                "Appium",
////                "Cannot find search input",
////                15
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_container']//*[@text = 'Object-oriented programming language']"),
////                "Cannot find 'Search Wikipedia' input",
////                10
////        );
////
////        WebElement title_element = MainPageObject.waitForElementPresent(
////                By.id("org.wikipedia:id/view_page_title_text"),
////                "Cannot find article title",
////                15
////        );
////
////        String article_title = title_element.getAttribute("text");
////
////        Assert.assertEquals(
////                "We see unexpected title",
////                "Java (programming language)",
////                article_title
////        );
//
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        SearchPageObject.typeSearchLine("Java");
//        SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");
//
//        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);;
//        String article_title = ArticlePageObject.getArticleTitle();
//
//        assertEquals(
//                "We see unexpected title",
//                "Java (programming language)",
//                article_title
//        );
//
//
//    }
//
//
//    @Test
//    public void testSwipeArticle(){
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
////                "Cannot find 'Search Wikipedia' input",
////                5
////        );
////
////        MainPageObject.waitForElementAndSendKeys(
////                By.xpath("//*[contains(@text, 'Search…')]"),
////                "Appium",
////                "Cannot find search input",
////                15
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_title'][@text = 'Appium']"),
////                "Cannot find 'Appium' article in search",
////                10
////        );
////
////        WebElement title_element = MainPageObject.waitForElementPresent(
////                By.id("org.wikipedia:id/view_page_title_text"),
////                "Cannot find article title",
////                15
////        );
////
////        MainPageObject.swipeUpToFindElement(
////                By.xpath("//*[@text = 'View page in browser']"),
////                "Cannot find the end of the article",
////                20
////        );
//
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        SearchPageObject.typeSearchLine("Appium");
//        SearchPageObject.clickByArticleWithSubstring("Appium");
//
//        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);;
//        ArticlePageObject.waitForTitleElement();
//        ArticlePageObject.swipeToFooter();
//
//    }
//
//    @Test
//    public void testSaveFirstArticleToMyList () {
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
////                "Cannot find 'Search Wikipedia' input",
////                5
////        );
////
////        MainPageObject.waitForElementAndSendKeys(
////                By.xpath("//*[contains(@text, 'Search…')]"),
////                "Java",
////                "Cannot find search input",
////                15
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_container']//*[@text = 'Object-oriented programming language']"),
////                "Cannot find 'Object-oriented programming language' input",
////                5
////        );
////
////        MainPageObject.waitForElementPresent(
////                By.id("org.wikipedia:id/view_page_title_text"),
////                "Cannot find article title",
////                15
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//android.widget.ImageView[@content-desc = 'More options']"),
////                "Cannot find button to open article options",
////                10
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[@text='Add to reading list']"),
////                "Cannot find options to add article to reading list",
////                5
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.id("org.wikipedia:id/onboarding_button"),
////                "Cannot find 'Got it' tip overlay",
////                10
////        );
////
////        MainPageObject.waitForElementAndClear(
////                By.id("org.wikipedia:id/text_input"),
////                "Cannot find input to set name of articles folder",
////                5
////        );
////
////        String name_of_folder = "Learning programming";
////
////        MainPageObject.waitForElementAndSendKeys(
////                By.id("org.wikipedia:id/text_input"),
////                name_of_folder,
////                "Cannot put text into articles folder input",
////                5
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[@text = 'OK']"),
////                "Cannot press 'OK' button",
////                5
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//android.widget.ImageButton[@content-desc = 'Navigate up']"),
////                "Cannot close article, cannot find X link",
////                5
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//android.widget.FrameLayout[@content-desc = 'My lists']"),
////                "Cannot find navigation button to My list",
////                5
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[@text ='"  + name_of_folder + "']"),
////                "Cannot find created folder",
////                10
////        );
////
////        MainPageObject.swipeElementToLeft(
////                By.xpath("//*[@text = 'Java (programming language)']"),
////                "Cannot find save article"
////        );
////
////        MainPageObject.waitForElementNotPresent(
////                By.xpath("//*[@text = 'Java (programming language)']"),
////                "Cannot delete saved article",
////                5
////        );
//
//
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        SearchPageObject.typeSearchLine("Java");
//        SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");
//
//        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);
//        ArticlePageObject.waitForTitleElement();
//        String article_title = ArticlePageObject.getArticleTitle();
//        String name_of_folder = "Learning programming";
//        ArticlePageObject.addArticleToMyList(name_of_folder);
//        ArticlePageObject.closeArticle();
//
//        NavigationUI NavigationUI = new NavigationUI(driver);
//        NavigationUI.clickMyLists();
//
//        MyListsPageObject MyListsPageObject = new MyListsPageObject(driver);
//        MyListsPageObject.openFolderByName(name_of_folder);
//        MyListsPageObject.swipeByArticleToDelete(article_title);
//
//
//
//    }
//
//    @Test
//    public void testAmountOfNotEmptySearch () {
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
////                "Cannot find 'Search Wikipedia' input",
////                5
////        );
////
////        String search_line = "Linkin Park Diskography";
////        MainPageObject.waitForElementAndSendKeys(
////                By.xpath("//*[contains(@text, 'Search…')]"),
////                search_line,
////                "Cannot find search input",
////                15
////        );
////
////        String search_result_locator = "//*[@resource-id='org.wikipedia:id/search_results_list']/*[@resource-id='org.wikipedia:id/page_list_item_container']";
////        MainPageObject.waitForElementPresent(
////                By.xpath(search_result_locator),
////                "Cannot find anything by the request " + search_line,
////                15
////        );
////
////        int amount_of_search_results = MainPageObject.getAmountOfElements(
////                By.xpath(search_result_locator)
////        );
////
////        Assert.assertTrue(
////                "We found too few results!",
////                amount_of_search_results > 0
////        );
//
//
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        String search_line = "Linkin Park Diskography";
//        SearchPageObject.typeSearchLine(search_line);
//        int amount_of_search_results = SearchPageObject.getAmountOfFoundArticles();
//        assertTrue(
//                "We found too few results!",
//                amount_of_search_results > 0
//        );
//    }
//
//    @Test
//    public void testAmountOfEmptySearch () {
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
////                "Cannot find 'Search Wikipedia' input",
////                5
////        );
////
////        String search_line = "Linkin Park Diskographyc";
////        MainPageObject.waitForElementAndSendKeys(
////                By.xpath("//*[contains(@text, 'Search…')]"),
////                search_line,
////                "Cannot find search input",
////                15
////        );
////
////        String search_result_locator = "//*[@resource-id='org.wikipedia:id/search_results_list']/*[@resource-id='org.wikipedia:id/page_list_item_container']";
////        String empty_result_label = "//*[@text = 'No results found']";
////
////        MainPageObject.waitForElementPresent(
////                By.xpath(empty_result_label),
////                "Cannot find empty result label by the request " + search_line,
////                15
////        );
////
////        MainPageObject.assertElementNotPresent(
////                By.xpath(search_result_locator),
////                "We've found some results by request " + search_line
////        );
//
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        String search_line = "Linkin Park Diskographyc";
//        SearchPageObject.typeSearchLine(search_line);
//        SearchPageObject.waitForEmptyResultsLabel();
//        SearchPageObject.assertThereIsResultOfSearch();
//
//    }
//
//    @Test
//    public void testChangeScreenOrientationOnSearchResults () {
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
////                "Cannot find 'Search Wikipedia' input",
////                5
////        );
////
////        String search_line = "Java";
////        MainPageObject.waitForElementAndSendKeys(
////                By.xpath("//*[contains(@text, 'Search…')]"),
////                search_line,
////                "Cannot find search input",
////                15
////        );
////
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_container']//*[@text = 'Object-oriented programming language']"),
////                "Cannot find 'Object-oriented programming language' topic searching by " + search_line,
////                15
////        );
////
////        String title_before_rotation = MainPageObject.waitForElementAndGetAttribute(
////                By.id("org.wikipedia:id/view_page_title_text"),
////                "text",
////                "Cannot find title of article",
////                15
////        );
////
////        driver.rotate(ScreenOrientation.LANDSCAPE);
////
////        String title_after_rotation = MainPageObject.waitForElementAndGetAttribute(
////                By.id("org.wikipedia:id/view_page_title_text"),
////                "text",
////                "Cannot find title of article",
////                15
////        );
////
////        Assert.assertEquals(
////                "Article title have been changed after screen rotation",
////                title_before_rotation,
////                title_after_rotation
////        );
////
////        driver.rotate(ScreenOrientation.PORTRAIT);
////
////        String title_after_second_rotation = MainPageObject.waitForElementAndGetAttribute(
////                By.id("org.wikipedia:id/view_page_title_text"),
////                "text",
////                "Cannot find title of article",
////                15
////        );
////
////        Assert.assertEquals(
////                "Article title have been changed after screen rotation",
////                title_before_rotation,
////                title_after_second_rotation
////        );
//
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        SearchPageObject.typeSearchLine("Java");
//        SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");
//
//        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);
//        String title_before_rotation = ArticlePageObject.getArticleTitle();
//        this.rotateScreenLandscape();
//        String title_after_rotation = ArticlePageObject.getArticleTitle();
//
//        assertEquals(
//                "Article title have been changed after screen rotation",
//                title_before_rotation,
//                title_after_rotation
//        );
//
//        this.rotateScreenPortrait();
//        String title_after_second_rotation = ArticlePageObject.getArticleTitle();
//
//        assertEquals(
//                "Article title have been changed after screen rotation",
//                title_before_rotation,
//                title_after_second_rotation
//        );
//
//
//    }
//
//    @Test
//    public void testCheckSearchArticleInBackground () {
////        MainPageObject.waitForElementAndClick(
////                By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
////                "Cannot find 'Search Wikipedia' input",
////                5
////        );
////
////        MainPageObject.waitForElementAndSendKeys(
////                By.xpath("//*[contains(@text, 'Search…')]"),
////                "Java",
////                "Cannot find search input",
////                15
////        );
////
////        MainPageObject.waitForElementPresent(
////                By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_container']//*[@text = 'Object-oriented programming language']"),
////                "Cannot find 'Object-oriented programming language' input",
////                5
////        );
////
////        driver.runAppInBackground(2); // Отправляем приложение в бэкграунд на 2 сек
////
////        MainPageObject.waitForElementPresent(
////                By.xpath("//*[@resource-id = 'org.wikipedia:id/page_list_item_container']//*[@text = 'Object-oriented programming language']"),
////                "Cannot find article after returning from background",
////                5
////        );
//
//        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
//        SearchPageObject.initSearchInput();
//        SearchPageObject.typeSearchLine("Java");
//        SearchPageObject.waitForSearchResult("Object-oriented programming language");
//        this.backgroundApp(2);
//        SearchPageObject.waitForSearchResult("Object-oriented programming language");
//    }
//}
//
