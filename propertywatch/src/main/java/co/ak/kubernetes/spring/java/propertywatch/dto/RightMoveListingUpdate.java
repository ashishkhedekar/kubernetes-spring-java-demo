
package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "listingUpdateReason",
    "listingUpdateDate"
})
public class RightMoveListingUpdate
{

    @JsonProperty("listingUpdateReason")
    private String listingUpdateReason;
    @JsonProperty("listingUpdateDate")
    private String listingUpdateDate;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("listingUpdateReason")
    public String getListingUpdateReason() {
        return listingUpdateReason;
    }

    @JsonProperty("listingUpdateReason")
    public void setListingUpdateReason(String listingUpdateReason) {
        this.listingUpdateReason = listingUpdateReason;
    }

    @JsonProperty("listingUpdateDate")
    public String getListingUpdateDate() {
        return listingUpdateDate;
    }

    @JsonProperty("listingUpdateDate")
    public void setListingUpdateDate(String listingUpdateDate) {
        this.listingUpdateDate = listingUpdateDate;
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
