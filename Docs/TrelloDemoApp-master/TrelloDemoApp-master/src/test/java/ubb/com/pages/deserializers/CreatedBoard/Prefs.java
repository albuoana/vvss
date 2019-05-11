
package ubb.com.pages.deserializers.CreatedBoard;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "permissionLevel",
        "voting",
        "comments",
        "invitations",
        "selfJoin",
        "cardCovers",
        "cardAging",
        "calendarFeedEnabled",
        "background",
        "backgroundImage",
        "backgroundImageScaled",
        "backgroundTile",
        "backgroundBrightness",
        "backgroundColor",
        "canBePublic",
        "canBeOrg",
        "canBePrivate",
        "canInvite"
})
public class Prefs {

    @JsonProperty("permissionLevel")
    private String permissionLevel;
    @JsonProperty("voting")
    private String voting;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("invitations")
    private String invitations;
    @JsonProperty("selfJoin")
    private Boolean selfJoin;
    @JsonProperty("cardCovers")
    private Boolean cardCovers;
    @JsonProperty("cardAging")
    private String cardAging;
    @JsonProperty("calendarFeedEnabled")
    private Boolean calendarFeedEnabled;
    @JsonProperty("background")
    private String background;
    @JsonProperty("backgroundImage")
    private Object backgroundImage;
    @JsonProperty("backgroundImageScaled")
    private Object backgroundImageScaled;
    @JsonProperty("backgroundTile")
    private Boolean backgroundTile;
    @JsonProperty("backgroundBrightness")
    private String backgroundBrightness;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("canBePublic")
    private Boolean canBePublic;
    @JsonProperty("canBeOrg")
    private Boolean canBeOrg;
    @JsonProperty("canBePrivate")
    private Boolean canBePrivate;
    @JsonProperty("canInvite")
    private Boolean canInvite;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("permissionLevel")
    public String getPermissionLevel() {
        return permissionLevel;
    }

    @JsonProperty("permissionLevel")
    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    @JsonProperty("voting")
    public String getVoting() {
        return voting;
    }

    @JsonProperty("voting")
    public void setVoting(String voting) {
        this.voting = voting;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("invitations")
    public String getInvitations() {
        return invitations;
    }

    @JsonProperty("invitations")
    public void setInvitations(String invitations) {
        this.invitations = invitations;
    }

    @JsonProperty("selfJoin")
    public Boolean getSelfJoin() {
        return selfJoin;
    }

    @JsonProperty("selfJoin")
    public void setSelfJoin(Boolean selfJoin) {
        this.selfJoin = selfJoin;
    }

    @JsonProperty("cardCovers")
    public Boolean getCardCovers() {
        return cardCovers;
    }

    @JsonProperty("cardCovers")
    public void setCardCovers(Boolean cardCovers) {
        this.cardCovers = cardCovers;
    }

    @JsonProperty("cardAging")
    public String getCardAging() {
        return cardAging;
    }

    @JsonProperty("cardAging")
    public void setCardAging(String cardAging) {
        this.cardAging = cardAging;
    }

    @JsonProperty("calendarFeedEnabled")
    public Boolean getCalendarFeedEnabled() {
        return calendarFeedEnabled;
    }

    @JsonProperty("calendarFeedEnabled")
    public void setCalendarFeedEnabled(Boolean calendarFeedEnabled) {
        this.calendarFeedEnabled = calendarFeedEnabled;
    }

    @JsonProperty("background")
    public String getBackground() {
        return background;
    }

    @JsonProperty("background")
    public void setBackground(String background) {
        this.background = background;
    }

    @JsonProperty("backgroundImage")
    public Object getBackgroundImage() {
        return backgroundImage;
    }

    @JsonProperty("backgroundImage")
    public void setBackgroundImage(Object backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @JsonProperty("backgroundImageScaled")
    public Object getBackgroundImageScaled() {
        return backgroundImageScaled;
    }

    @JsonProperty("backgroundImageScaled")
    public void setBackgroundImageScaled(Object backgroundImageScaled) {
        this.backgroundImageScaled = backgroundImageScaled;
    }

    @JsonProperty("backgroundTile")
    public Boolean getBackgroundTile() {
        return backgroundTile;
    }

    @JsonProperty("backgroundTile")
    public void setBackgroundTile(Boolean backgroundTile) {
        this.backgroundTile = backgroundTile;
    }

    @JsonProperty("backgroundBrightness")
    public String getBackgroundBrightness() {
        return backgroundBrightness;
    }

    @JsonProperty("backgroundBrightness")
    public void setBackgroundBrightness(String backgroundBrightness) {
        this.backgroundBrightness = backgroundBrightness;
    }

    @JsonProperty("backgroundColor")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @JsonProperty("backgroundColor")
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @JsonProperty("canBePublic")
    public Boolean getCanBePublic() {
        return canBePublic;
    }

    @JsonProperty("canBePublic")
    public void setCanBePublic(Boolean canBePublic) {
        this.canBePublic = canBePublic;
    }

    @JsonProperty("canBeOrg")
    public Boolean getCanBeOrg() {
        return canBeOrg;
    }

    @JsonProperty("canBeOrg")
    public void setCanBeOrg(Boolean canBeOrg) {
        this.canBeOrg = canBeOrg;
    }

    @JsonProperty("canBePrivate")
    public Boolean getCanBePrivate() {
        return canBePrivate;
    }

    @JsonProperty("canBePrivate")
    public void setCanBePrivate(Boolean canBePrivate) {
        this.canBePrivate = canBePrivate;
    }

    @JsonProperty("canInvite")
    public Boolean getCanInvite() {
        return canInvite;
    }

    @JsonProperty("canInvite")
    public void setCanInvite(Boolean canInvite) {
        this.canInvite = canInvite;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
