import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;



public class MarketTest{

    @Test
    @DisplayName("Positive test")
    void positiveTest() {

        open("http://market.yandex.ru");

        $("#header-search").val("холодильник samsung").pressEnter();

        $$(".link.n-link_theme_blue.link_type_cpc").get(0).click();

    }


}