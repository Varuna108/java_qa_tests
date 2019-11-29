import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AuthTest {

    @Test
    @DisplayName("Negative test")
    void negativeTest() {

        open("https://www.leprosorium.ru/");

        $(".b-login_navigation_auth").click();

        $(byName("username")).val("sorry");

        $(byName("password")).val("qwertyqwertyqwerty");

        $(".b-login_auth_forever").click();

        $(".b-login_auth_remember_ip").click();

        $(byId("js-auth_form_submit")).click();

//        $(".futu_alert_outer").shouldBe(visible); фиксация самого факта появления ошибки

        $(".futu_alert_outer")
                .should(or("Простите, но нам бы очень хотелось быть уверенными в том, что вы не робот.",
                text("Вы ошиблись с паролем, и теперь мы попросим вас подтвердить, что вы не робот."),
                text("Пожалуйста, подтвердите, что вы не робот.")));

        sleep(5000);

    }
}


