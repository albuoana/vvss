package ubb.com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ubb.com.util.TrelloConstants;

import java.util.List;

public class MyBoardPage extends PageObject {
    @FindBy(css = "div.list-card-details")
    public List<WebElementFacade> cardDetailsDiv;

    @FindBy(id = "board")
    public WebElementFacade boardContainer;

    @FindBy(className = "list")
    public List<WebElementFacade> boardLists;

    @FindBy(css = "a.js-delete")
    public WebElementFacade deleteBoardButton;

    @FindBy(css = ".js-confirm")
    public WebElementFacade confirmBoardDeleteButton;

    public boolean myCardDisplayed() {
        waitFor(boardContainer);
        return cardDetailsDiv.get(0).isCurrentlyVisible();
    }

    public void selectMyCard(String cardName) {
        waitFor(cardDetailsDiv.get(0));
        for (WebElementFacade element : cardDetailsDiv) {
            if (element.getText().toLowerCase().contains(cardName.toLowerCase())) {
                (new Actions(getDriver()).dragAndDrop(element, boardLists.get(1))).perform();
                waitABit(1000);
                break;
            }
        }
    }

    public void deleteAllBoards() {
        getDriver().get(TrelloConstants.myBoardUrl);
        waitFor(deleteBoardButton);
        clickOn(deleteBoardButton);
        waitFor(confirmBoardDeleteButton);
        clickOn(confirmBoardDeleteButton);
    }
}
