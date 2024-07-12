package org.example.appiumtest.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private static AndroidDriver driver;

    @BeforeEach
    public void setUp() {
        var options = new BaseOptions()
                .amend("appium:app", "C:\\Users\\yulia\\Downloads\\КонсультантПлюс_ Студент_10.0.1724_APKPure.apk")
                .amend("platformName", "Android")
                .amend("appium:deviceName", "Pixel 5")
                .amend("appium:automationName", "uiAutomator2")
                .amend("appium:appWaitActivity", "com.consultantplus.app.main.MainActivity")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);
        driver = new AndroidDriver(this.getUrl(), options);
    }

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}
