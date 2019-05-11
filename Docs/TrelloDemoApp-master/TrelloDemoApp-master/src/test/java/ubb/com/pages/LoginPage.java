package ubb.com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://trello.com/login")
public class LoginPage extends PageObject {

    // Page Elements
    @FindBy(id = "user")
    private WebElementFacade usernameField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(id = "login")
    private WebElementFacade logInButton;
    @FindBy(id = "header")
    private WebElementFacade headerDiv;

    public void login(String username, String password) {
        waitFor(usernameField);
        typeInto(usernameField, username);
        typeInto(passwordField, password);
        clickOn(logInButton);
        waitFor(headerDiv);
    }
}
