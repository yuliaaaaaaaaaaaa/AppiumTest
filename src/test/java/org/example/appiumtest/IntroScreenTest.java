package org.example.appiumtest;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.jupiter.api.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;


public class IntroScreenTest {
    private AndroidDriver driver;
    private IntroScreen IntroScreen;

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
        IntroScreen = new IntroScreen(driver);
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

    @Test
    public void skipCheckTest() {
        assertTrue(IntroScreen.checkSkipButton(),"Нет кнопки пропуска");

    }
}
