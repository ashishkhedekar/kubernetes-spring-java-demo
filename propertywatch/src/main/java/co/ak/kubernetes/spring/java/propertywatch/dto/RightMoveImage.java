
package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "srcUrl",
    "url"
})
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RightMoveImage
{

    @JsonProperty("srcUrl")
    private String srcUrl;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("srcUrl")
    public String getSrcUrl() {
        return srcUrl;
    }

    @JsonProperty("srcUrl")
    public void setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
