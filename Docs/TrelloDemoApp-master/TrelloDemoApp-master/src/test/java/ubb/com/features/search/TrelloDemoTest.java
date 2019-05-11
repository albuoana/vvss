package ubb.com.features.search;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ubb.com.steps.serenity.ApiSetup;
import ubb.com.steps.serenity.UiTestSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/data.csv")
public class TrelloDemoTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    private String username, password, key, token;
    private String boardName = "TestBoardName";
    private String listName = "TestListName";
    private String cardName = "TestCardName";


    @Qualifier
    public String qualifier() {
        return username;
    }

    @Steps
    public ApiSetup setup;

    @Steps
    public UiTestSteps user;

    @Test
    public void check_the_drag_and_drop_functionality() {
        user.logs_in(username, password);
        setup.set_user_key_and_token(key, token);
        setup.create_board(boardName);
        user.selects_the_created_board(boardName);
        setup.create_list_on_the_board(listName);
        setup.create_card_on_the_list(cardName);
        user.selects_the_card_and_moves_it(cardName);
        setup.close_the_created_board();
        user.deletes_the_board();
    }

}
