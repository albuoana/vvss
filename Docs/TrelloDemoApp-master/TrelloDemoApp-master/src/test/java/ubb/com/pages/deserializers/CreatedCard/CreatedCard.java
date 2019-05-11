
package ubb.com.pages.deserializers.CreatedCard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "badges",
        "checkItemStates",
        "closed",
        "dateLastActivity",
        "desc",
        "descData",
        "due",
        "dueComplete",
        "email",
        "idBoard",
        "idChecklists",
        "idLabels",
        "idList",
        "idMembers",
        "idShort",
        "idAttachmentCover",
        "manualCoverAttachment",
        "labels",
        "name",
        "pos",
        "shortUrl",
        "url",
        "stickers"
})
public class CreatedCard {

    @JsonProperty("id")
    private String id;
    @JsonProperty("badges")
    private Badges badges;
    @JsonProperty("checkItemStates")
    private List<Object> checkItemStates = null;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("dateLastActivity")
    private String dateLastActivity;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("descData")
    private DescData descData;
    @JsonProperty("due")
    private Object due;
    @JsonProperty("dueComplete")
    private Boolean dueComplete;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("idBoard")
    private String idBoard;
    @JsonProperty("idChecklists")
    private List<Object> idChecklists = null;
    @JsonProperty("idLabels")
    private List<Object> idLabels = null;
    @JsonProperty("idList")
    private String idList;
    @JsonProperty("idMembers")
    private List<Object> idMembers = null;
    @JsonProperty("idShort")
    private Integer idShort;
    @JsonProperty("idAttachmentCover")
    private Object idAttachmentCover;
    @JsonProperty("manualCoverAttachment")
    private Boolean manualCoverAttachment;
    @JsonProperty("labels")
    private List<Object> labels = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pos")
    private Integer pos;
    @JsonProperty("shortUrl")
    private String shortUrl;
    @JsonProperty("url")
    private String url;
    @JsonProperty("stickers")
    private List<Object> stickers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("badges")
    public Badges getBadges() {
        return badges;
    }

    @JsonProperty("badges")
    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    @JsonProperty("checkItemStates")
    public List<Object> getCheckItemStates() {
        return checkItemStates;
    }

    @JsonProperty("checkItemStates")
    public void setCheckItemStates(List<Object> checkItemStates) {
        this.checkItemStates = checkItemStates;
    }

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("dateLastActivity")
    public String getDateLastActivity() {
        return dateLastActivity;
    }

    @JsonProperty("dateLastActivity")
    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonProperty("descData")
    public DescData getDescData() {
        return descData;
    }

    @JsonProperty("descData")
    public void setDescData(DescData descData) {
        this.descData = descData;
    }

    @JsonProperty("due")
    public Object getDue() {
        return due;
    }

    @JsonProperty("due")
    public void setDue(Object due) {
        this.due = due;
    }

    @JsonProperty("dueComplete")
    public Boolean getDueComplete() {
        return dueComplete;
    }

    @JsonProperty("dueComplete")
    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("idBoard")
    public String getIdBoard() {
        return idBoard;
    }

    @JsonProperty("idBoard")
    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    @JsonProperty("idChecklists")
    public List<Object> getIdChecklists() {
        return idChecklists;
    }

    @JsonProperty("idChecklists")
    public void setIdChecklists(List<Object> idChecklists) {
        this.idChecklists = idChecklists;
    }

    @JsonProperty("idLabels")
    public List<Object> getIdLabels() {
        return idLabels;
    }

    @JsonProperty("idLabels")
    public void setIdLabels(List<Object> idLabels) {
        this.idLabels = idLabels;
    }

    @JsonProperty("idList")
    public String getIdList() {
        return idList;
    }

    @JsonProperty("idList")
    public void setIdList(String idList) {
        this.idList = idList;
    }

    @JsonProperty("idMembers")
    public List<Object> getIdMembers() {
        return idMembers;
    }

    @JsonProperty("idMembers")
    public void setIdMembers(List<Object> idMembers) {
        this.idMembers = idMembers;
    }

    @JsonProperty("idShort")
    public Integer getIdShort() {
        return idShort;
    }

    @JsonProperty("idShort")
    public void setIdShort(Integer idShort) {
        this.idShort = idShort;
    }

    @JsonProperty("idAttachmentCover")
    public Object getIdAttachmentCover() {
        return idAttachmentCover;
    }

    @JsonProperty("idAttachmentCover")
    public void setIdAttachmentCover(Object idAttachmentCover) {
        this.idAttachmentCover = idAttachmentCover;
    }

    @JsonProperty("manualCoverAttachment")
    public Boolean getManualCoverAttachment() {
        return manualCoverAttachment;
    }

    @JsonProperty("manualCoverAttachment")
    public void setManualCoverAttachment(Boolean manualCoverAttachment) {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("pos")
    public Integer getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    @JsonProperty("shortUrl")
    public String getShortUrl() {
        return shortUrl;
    }

    @JsonProperty("shortUrl")
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("stickers")
    public List<Object> getStickers() {
        return stickers;
    }

    @JsonProperty("stickers")
    public void setStickers(List<Object> stickers) {
        this.stickers = stickers;
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
