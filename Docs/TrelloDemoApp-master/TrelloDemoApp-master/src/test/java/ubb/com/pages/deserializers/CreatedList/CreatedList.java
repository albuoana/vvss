
package ubb.com.pages.deserializers.CreatedList;

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
    "id",
    "name",
    "closed",
    "idBoard",
    "pos"
})
public class CreatedList {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("idBoard")
    private String idBoard;
    @JsonProperty("pos")
    private Integer pos;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("idBoard")
    public String getIdBoard() {
        return idBoard;
    }

    @JsonProperty("idBoard")
    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    @JsonProperty("pos")
    public Integer getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(Integer pos) {
        this.pos = pos;
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
