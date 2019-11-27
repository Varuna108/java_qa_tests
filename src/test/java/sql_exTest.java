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

        $("input[type='text']").val("varuna108@yandex.ru");

        $("input[type='password']").val("java_forever").pressEnter();

        $(byXpath("/html/body/table[2]/tbody/tr/td[1]/table[1]/tbody/tr[3]/td/div[1]/a")).click();

        $(byXpath("/html/body/table[2]/tbody/tr/td[1]/table[1]/tbody/tr[3]/td/div[2]/pre/a[2]")).click();

        $("select[id='LN']").selectOptionByValue("1");

        $("textarea[id='txtsql']").setValue("SELECT model, speed, hd FROM pc WHERE price < 500");

        $("input[type='submit']").click();

        Configuration.holdBrowserOpen = true;

    }
}