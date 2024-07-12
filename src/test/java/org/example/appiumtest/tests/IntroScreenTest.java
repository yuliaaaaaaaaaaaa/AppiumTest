package org.example.appiumtest.tests;


import org.example.appiumtest.MyExtension;
import org.example.appiumtest.pages.IntroScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class IntroScreenTest extends BaseTest {

    private IntroScreen IntroScreen;

    @BeforeEach
    public void setUp() {
        super.setUp();
        IntroScreen = new IntroScreen(getDriver());
    }

    @AfterEach
    public void tearDown() {
        super.tearDown();
    }

    @Test
    @DisplayName("Проверка активности кнопки Пропустить")
    public void skipCheckTest() {
        assertTrue(IntroScreen.checkSkipButton(), "Нет кнопки пропуска");
    }

    @Test
    @DisplayName("Проверка, что текст Главный экран есть на странице")
    public void mainScreenTextTest() {
        assertTrue(IntroScreen.mainScreenTextIsDisplayed(), "Текста на странице нет");
    }

    @Test
    @DisplayName("Проверка, что текст Основные разделы... есть на странице")
    public void sectionsTextTest() {
        assertTrue(IntroScreen.sectionsTextIsDisplayed(), "Текста на страниец нет");
    }

    @Test
    @DisplayName("Проверка активности кнопки Далее")
    public void furtherButtonIsEnabledTest() {
        assertTrue(IntroScreen.furtherButtonIsEnabled(), "Кнопка не активна");
    }

    @Test
    @DisplayName("Проверка, что текст Быстрый поиск есть на странице")
    public void searchTextIsDisplayedTest() {
        assertTrue(IntroScreen.searchTextIsDisplayed(), "Текста на странице нет");
    }

    @Test
    @DisplayName("Проверка, что тескст Работа без интернета есть на странице")
    public void workTextIsDisplayedTest() {
        assertTrue(IntroScreen.workTextIsDisplayed(), "Текста на странице нет");
    }

    @Test
    @DisplayName("Проверка активности кнопки Приступить к работе")
    public void workButtonIsEnabledTest() {
        assertTrue(IntroScreen.workButtonIsEnabled(), "Кнопка не активна");
    }

    @Test
    @DisplayName("Проверка, что Поиск есть на странице, при нажатии на кнопку Приступить к работе")
    public void searchElementIsDisplayedTest() {
        assertTrue(IntroScreen.searchElementIsDisplayed(), "Поиска нет на странице");
    }

    @Test
    @DisplayName("Проверка, что Поиск есть на странице, при нажатии на кнопку Пропустить")
    public void searchElementTest() {
        assertTrue(IntroScreen.searchElement(), "Поиска нет на странице");
    }

    @Test
    @DisplayName("Проверка, что элемент Меню есть на странице")
    public void menuElementTest() {
        assertTrue(IntroScreen.menuElement(), "Меню нет на странице");
    }
}

