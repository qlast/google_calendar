import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class CopyGoogleCalendar {
    public static void main(String[] args) {

        // Устанавливаем настройки Selenide
        Configuration.browser = "chrome";

        open("https://www.google.com"); /** Открываем Google.com*/
        $(By.xpath("//a[text()='Почта']")).click();
        Selenide.sleep(5000);

        // Добавьте код для выполнения дополнительных действий, если необходимо
    }
}
