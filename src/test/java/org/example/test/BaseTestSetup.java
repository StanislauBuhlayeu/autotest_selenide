package org.example.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import java.time.Duration;
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
        Thread.sleep(101);
        Selenide.closeWebDriver();
    }

}
