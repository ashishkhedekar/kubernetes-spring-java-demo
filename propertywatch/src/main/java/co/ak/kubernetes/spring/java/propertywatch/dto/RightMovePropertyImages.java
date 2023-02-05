
package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "images",
    "mainImageSrc",
    "mainMapImageSrc"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RightMovePropertyImages
{

    @JsonProperty("images")
    private List<RightMoveImage> rightMoveImages = null;
    @JsonProperty("mainImageSrc")
    private String mainImageSrc;
    @JsonProperty("mainMapImageSrc")
    private String mainMapImageSrc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("images")
    public List<RightMoveImage> getRightMoveImages() {
        return rightMoveImages;
    }

    @JsonProperty("images")
    public void setRightMoveImages(List<RightMoveImage> rightMoveImages) {
        this.rightMoveImages = rightMoveImages;
    }

    @JsonProperty("mainImageSrc")
    public String getMainImageSrc() {
        return mainImageSrc;
    }

    @JsonProperty("mainImageSrc")
    public void setMainImageSrc(String mainImageSrc) {
        this.mainImageSrc = mainImageSrc;
    }

    @JsonProperty("mainMapImageSrc")
    public String getMainMapImageSrc() {
        return mainMapImageSrc;
    }

    @JsonProperty("mainMapImageSrc")
    public void setMainMapImageSrc(String mainMapImageSrc) {
        this.mainMapImageSrc = mainMapImageSrc;
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
