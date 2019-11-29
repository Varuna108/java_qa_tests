import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    @DisplayName("Positive test")
    void positiveTest() {

        open("https://www.yandex.com/");

        $("#text").val("Leprosorium").pressEnter();

//        $(byName("q")).setValue("leprosorium"); доделать проверку выпадающего списка

//        $$(".erkvQe").shouldHave(size(6));

        $(withText("Лепрозорий")).click();

        $(".b-login_navigation_auth").click();

        $(byName("username")).val("sorry");

        $(byName("password")).val("qwertyqwertyqwerty");

        $(".b-login_auth_forever").click();

        $(".b-login_auth_remember_ip").click();

        $(byId("js-auth_form_submit")).click();

        $(".futu_alert_outer").shouldHave(text("Вы ошиблись с паролем, и теперь мы попросим вас подтвердить, что вы не робот."));

        sleep(5000);

    }
}
