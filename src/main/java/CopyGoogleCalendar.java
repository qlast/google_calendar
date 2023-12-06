import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class CopyGoogleCalendar {
    public static void main(String[] args) {
        // Устанавливаем настройки Selenide (например, браузер и URL)
        Configuration.browser = "chrome";
        Configuration.startMaximized = true; // Используем метод startMaximized

        // Открываем Google.com
        open("https://www.google.com");

        // Добавьте код для выполнения дополнительных действий, если необходимо
    }
}
