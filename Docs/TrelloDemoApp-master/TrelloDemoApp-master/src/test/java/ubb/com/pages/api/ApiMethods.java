package ubb.com.pages.api;

import io.restassured.RestAssured;
import ubb.com.pages.deserializers.CreatedBoard.CreatedBoard;
import ubb.com.pages.deserializers.CreatedCard.CreatedCard;
import ubb.com.pages.serializers.CloseBoard;
import ubb.com.pages.serializers.CreateBoard;
import ubb.com.pages.serializers.CreateCard;
import ubb.com.pages.serializers.CreateList;
import ubb.com.pages.deserializers.CreatedList.CreatedList;
import ubb.com.util.TrelloConstants;

public class ApiMethods{

    private String key;
    private String token;
    private String boardId;
    private String listId;

    public void setKey(String key){
        this.key = key;
    }

    public String getKey(){
        return key;
    }
    public void setToken(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }
    
    public void setBoardId(String boardId){
        this.boardId = boardId;
    }

    public String getBoardId(){
        return boardId;
    }

    public void setListId(String listId){
        this.listId = listId;
    }

    public String getListId(){
        return listId;
    }

    
    public void createBoard(String boardName) {
        RestAssured.baseURI = TrelloConstants.boardsUrl;
        CreatedBoard createdBoard = RestAssured.given().contentType("application/json").body(setBoardDetails(boardName)).then().statusCode(200).when().post().as(CreatedBoard.class);
        setBoardId(createdBoard.getId());
    }

    private CreateBoard setBoardDetails(String boardName) {
        CreateBoard createBoard = new CreateBoard();
        createBoard.setKey(getKey());
        createBoard.setName(boardName);
        createBoard.setToken(getToken());
        return createBoard;
    }

    public void createList(String listName) {
        RestAssured.baseURI = TrelloConstants.listsUrl;
        CreatedList createdList = RestAssured.given().contentType("application/json").body(setListDetails(listName)).then().statusCode(200).when().post().as(CreatedList.class);
        setListId(createdList.getId());
    }

    private CreateList setListDetails(String listName) {
        CreateList createList = new CreateList();
        createList.setName(listName);
        createList.setToken(getToken());
        createList.setKey(getKey());
        createList.setIdBoard(getBoardId());
        return createList;
    }

    public String createCard(String cardName) {
        RestAssured.baseURI = TrelloConstants.cardsUrl;
        CreatedCard createdCard = RestAssured.given().contentType("application/json").body(setCardDetails(cardName)).then().statusCode(200).when().post().as(CreatedCard.class);
        return createdCard.getId();
    }

    private CreateCard setCardDetails(String cardName) {
        CreateCard createCard = new CreateCard();
        createCard.setKey(getKey());
        createCard.setToken(getToken());
        createCard.setName(cardName);
        createCard.setPos("top");
        createCard.setDue(null);
        createCard.setIdList(getListId());
        return createCard;
    }

    public boolean closeBoard() {
        RestAssured.baseURI = TrelloConstants.boardsUrl + "/" + getBoardId() + "/closed";
        CreatedBoard board = RestAssured.given().contentType("application/json").body(setBoardClosed()).then().statusCode(200).when().put().as(CreatedBoard.class);
        return board.getClosed();
    }

    private CloseBoard setBoardClosed() {
        CloseBoard closeBoard = new CloseBoard();
        closeBoard.setValue("true");
        closeBoard.setKey(getKey());
        closeBoard.setToken(getToken());
        return closeBoard;
    }
}
