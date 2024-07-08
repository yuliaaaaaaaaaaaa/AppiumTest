package org.example.appiumtest;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class IntroScreen {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Пропустить\"]")
    private WebElement SkipButton;

    public Boolean checkSkipButton() {
        return SkipButton.isEnabled();
    }

    public IntroScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
