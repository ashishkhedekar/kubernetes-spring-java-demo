
package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "displayPrice",
    "displayPriceQualifier"
})
public class RightMoveDisplayPrice
{

    @JsonProperty("displayPrice")
    private String displayPrice;
    @JsonProperty("displayPriceQualifier")
    private String displayPriceQualifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayPrice")
    public String getDisplayPrice() {
        return displayPrice;
    }

    @JsonProperty("displayPrice")
    public void setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
    }

    @JsonProperty("displayPriceQualifier")
    public String getDisplayPriceQualifier() {
        return displayPriceQualifier;
    }

    @JsonProperty("displayPriceQualifier")
    public void setDisplayPriceQualifier(String displayPriceQualifier) {
        this.displayPriceQualifier = displayPriceQualifier;
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
