import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class sql_exTest {

    @Test
    @DisplayName("Positive test")
    void positiveTest() {

        open("http://sql-ex.ru/");

        $(byName("login")).setValue("varuna108@yandex.ru");

        $(byName("psw")).setValue("java_forever").pressEnter();

        $x("//tr[3]//td//div//a").$(byText("Упражнения по SQL")).click();

        $("#exe").$(byText("SELECT (обучающий этап)")).click();

        $("#LN").selectOptionByValue("1");

        $("#txtsql").setValue("SELECT model, speed, hd FROM pc WHERE price < 500");

        $(byName("cmdanswer")).click();

    }
}