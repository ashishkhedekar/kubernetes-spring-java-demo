
package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "frequency",
    "currencyCode",
    "displayPrices"
})
public class RightMovePrice
{

    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("displayPrices")
    private List<RightMoveDisplayPrice> rightMoveDisplayPrices = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("displayPrices")
    public List<RightMoveDisplayPrice> getRightMoveDisplayPrices() {
        return rightMoveDisplayPrices;
    }

    @JsonProperty("displayPrices")
    public void setRightMoveDisplayPrices(List<RightMoveDisplayPrice> rightMoveDisplayPrices) {
        this.rightMoveDisplayPrices = rightMoveDisplayPrices;
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
