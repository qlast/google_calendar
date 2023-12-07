import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CopyGoogleCalendar {
    public static void main(String[] args) {
        // Устанавливаем настройки Selenide (например, браузер и URL)
        Configuration.browser = "chrome";
        //Configuration.startMaximized = true; // Используем метод startMaximized

        // Открываем Google.com
        open("https://www.google.com");
        $("[data-pid=23]").pressEnter();
        Selenide.sleep(5000);

        // Добавьте код для выполнения дополнительных действий, если необходимо
    }
}
