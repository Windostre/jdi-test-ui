package login;

import com.epam.jdi.light.elements.composite.WebPage;
import org.junit.Test;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.UIFactory.$;

public class LoginTests {

    @Test
    public void loginSuccess() {
        openUrl("https://jdi-testing.github.io/jdi-light/");
        $("img#user-icon").click();
        $("#name").sendKeys("Roman");
        $("#password").sendKeys("Jdi1234");
        $("#login-button").click();
        $("#user-name").is().displayed();

    }
}
