package ubb.com.steps.serenity;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import ubb.com.pages.BoardsPage;
import ubb.com.pages.LoginPage;
import ubb.com.pages.MyBoardPage;

public class UiTestSteps extends ScenarioSteps {

    BoardsPage boardsPage;
    LoginPage loginPage;
    MyBoardPage myBoardPage;


    @Step
    public void logs_in(String username, String password) {
        loginPage.open();
        loginPage.login(username, password);
    }

    @Step
    public void selects_the_created_board(String boardName) {
        boardsPage.selectBoard(boardName);
    }

    @Step
    public void selects_the_card_and_moves_it(String cardName) {
        Assert.assertTrue("The created card not found! ",
                myBoardPage.myCardDisplayed());
        myBoardPage.selectMyCard(cardName);
    }

    @Step
    public void deletes_the_board() {
        myBoardPage.deleteAllBoards();
    }

}


