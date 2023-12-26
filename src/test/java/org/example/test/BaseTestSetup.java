package org.example.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.time.Duration;

import static org.company.constants.Constant.ALERTS_URL;
import static org.company.constants.Constant.URL;
import static org.company.constants.FormConstant.FORM_URL;
import static org.company.constants.ProgressBarConstant.PROGRESS_BAR_URL;
import static org.company.constants.SelectableConstant.SELECTABLE_URL;
import static org.company.constants.SliderConstant.SLIDER_URL;
import static org.company.constants.SortConstant.SORT_URL;
import static org.example.constants.Constants.URL;

abstract public class BaseTestSetup {
    public static void setup() {
        WebDriverManager.chromedriver();
        Configuration.browser = "chrome";
        Configuration.browserSize = "2560x1440";
        Configuration.headless = false;
        Selenide.open(URL);
        Configuration.timeout = 20000;
        Configuration.pageLoadTimeout = 15000;
    }

    @BeforeAll
    public static void init() {
        setup();
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        Selenide.closeWebDriver();
    }

}
