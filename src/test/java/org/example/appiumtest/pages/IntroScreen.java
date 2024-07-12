package org.example.appiumtest.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.appiumtest.AllureLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class IntroScreen {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(IntroScreen.class));

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Пропустить\"]")
    private WebElement SkipButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Главный экран\"]")
    private WebElement MainScreenText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Основные разделы, важные новости и документы находятся на главном экране.\"]")
    private WebElement SectionsText;

    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button")
    private WebElement FurtherButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Быстрый поиск\"]")
    private WebElement SearchText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Работа без интернета\"]")
    private WebElement WorkText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Приступить к работе\"]")
    private WebElement WorkButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Быстрый поиск по документам\"]")
    private WebElement SearchElement;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Открыть главное меню\"]")
    private WebElement MenuElement;

    public Boolean checkSkipButton() {
        LOG.info("Проверка активности кнопки Пропустить");
        return SkipButton.isEnabled();
    }

    public Boolean mainScreenTextIsDisplayed() {
        LOG.info("Проверка, что текст Главный экран есть на странице");
        return MainScreenText.isDisplayed();
    }

    public Boolean sectionsTextIsDisplayed() {
        LOG.info("Проверка, что текст Основные разделы... есть на странице");
        return SectionsText.isDisplayed();
    }

    public Boolean furtherButtonIsEnabled() {
        LOG.info("Проверка активности кнопки Далее");
        return FurtherButton.isEnabled();
    }

    public Boolean searchTextIsDisplayed() {
        LOG.info("Проверка, что текст Быстрый поиск есть на странице");
        FurtherButton.click();
        return SearchText.isDisplayed();
    }

    public Boolean workTextIsDisplayed() {
        LOG.info("Проверка, что тескст Работа без интернета есть на странице");
        FurtherButton.click();
        FurtherButton.click();
        return WorkText.isDisplayed();
    }

    public Boolean workButtonIsEnabled() {
        LOG.info("Проверка активности кнопки Приступить к работе");
        FurtherButton.click();
        FurtherButton.click();
        return WorkButton.isEnabled();
    }

    public Boolean searchElementIsDisplayed() {
        LOG.info("Проверка, что Поиск есть на странице, при нажатии на кнопку Приступить к работе");
        FurtherButton.click();
        FurtherButton.click();
        WorkButton.click();
        return SearchElement.isDisplayed();
    }

    public Boolean searchElement() {
        LOG.info("Проверка, что Поиск есть на странице, при нажатии на кнопку Пропустить");
        SkipButton.click();
        return SearchElement.isDisplayed();
    }

    public Boolean menuElement() {
        LOG.info("Проверка, что элемент Меню есть на странице");
        SkipButton.click();
        return MenuElement.isDisplayed();
    }

    public IntroScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
