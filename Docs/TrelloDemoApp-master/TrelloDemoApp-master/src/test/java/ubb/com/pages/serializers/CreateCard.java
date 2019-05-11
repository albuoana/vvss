package ubb.com.pages.serializers;

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
        "name",
        "key",
        "token",
        "desc",
        "pos",
        "due",
        "idList"
})
public class CreateCard {

    @JsonProperty("name")
    private String name;
    @JsonProperty("key")
    private String key;
    @JsonProperty("token")
    private String token;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("due")
    private Object due;
    @JsonProperty("idList")
    private String idList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("due")
    public Object getDue() {
        return due;
    }

    @JsonProperty("due")
    public void setDue(Object due) {
        this.due = due;
    }

    @JsonProperty("idList")
    public String getIdList() {
        return idList;
    }

    @JsonProperty("idList")
    public void setIdList(String idList) {
        this.idList = idList;
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