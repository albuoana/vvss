package ubb.com.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ubb.com.pages.api.ApiMethods;

public class ApiSetup extends ScenarioSteps{

    ApiMethods apiMethods = new ApiMethods();

    @Step
    public void set_user_key_and_token(String key, String token){
        apiMethods.setKey(key);
        apiMethods.setToken(token);
    }

    @Step
    public void create_board(String boardName) {
        apiMethods.createBoard(boardName);
    }

    @Step
    public void create_list_on_the_board(String listname){
        apiMethods.createList(listname);
    }

    @Step
    public void create_card_on_the_list(String cardname){
        apiMethods.createCard(cardname);
    }

    @Step
    public void close_the_created_board(){
        apiMethods.closeBoard();
    }
}
