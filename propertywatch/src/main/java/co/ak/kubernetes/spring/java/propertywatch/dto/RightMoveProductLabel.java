
package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productLabelText"
})
public class RightMoveProductLabel
{

    @JsonProperty("productLabelText")
    private String productLabelText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("productLabelText")
    public String getProductLabelText() {
        return productLabelText;
    }

    @JsonProperty("productLabelText")
    public void setProductLabelText(String productLabelText) {
        this.productLabelText = productLabelText;
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
