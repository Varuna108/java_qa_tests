import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import io.github.cdimascio.dotenv.Dotenv;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;



public class sql_exTest {


    @Test
    @DisplayName("Positive test")
    void positiveTest() {

        Dotenv dotenv = Dotenv.load();

        open("http://sql-ex.ru/");

        $(byName("login")).setValue(dotenv.get("Username"));

        $(byName("psw")).setValue(dotenv.get("Password")).pressEnter();

        $x("//tr[3]//td//div//a").$(byText("Упражнения по SQL")).click();

        $("#exe").$(byText("SELECT (обучающий этап)")).click();

        $("#LN").selectOptionByValue("1");

        $("#txtsql").setValue("SELECT model, speed, hd FROM pc WHERE price < 500");

        $(byName("cmdanswer")).click();

    }
}