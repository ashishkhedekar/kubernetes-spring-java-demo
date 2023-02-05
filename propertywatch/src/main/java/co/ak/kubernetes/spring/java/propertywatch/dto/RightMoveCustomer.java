
package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "branchId",
    "brandPlusLogoURI",
    "contactTelephone",
    "branchDisplayName",
    "branchName",
    "brandTradingName",
    "branchLandingPageUrl",
    "development",
    "showReducedProperties",
    "commercial",
    "showOnMap",
    "enhancedListing",
    "developmentContent",
    "brandPlusLogoUrl"
})
public class RightMoveCustomer
{

    @JsonProperty("branchId")
    private Integer branchId;
    @JsonProperty("brandPlusLogoURI")
    private String brandPlusLogoURI;
    @JsonProperty("contactTelephone")
    private String contactTelephone;
    @JsonProperty("branchDisplayName")
    private String branchDisplayName;
    @JsonProperty("branchName")
    private String branchName;
    @JsonProperty("brandTradingName")
    private String brandTradingName;
    @JsonProperty("branchLandingPageUrl")
    private String branchLandingPageUrl;
    @JsonProperty("development")
    private Boolean development;
    @JsonProperty("showReducedProperties")
    private Boolean showReducedProperties;
    @JsonProperty("commercial")
    private Boolean commercial;
    @JsonProperty("showOnMap")
    private Boolean showOnMap;
    @JsonProperty("enhancedListing")
    private Boolean enhancedListing;
    @JsonProperty("developmentContent")
    private Object developmentContent;
    @JsonProperty("brandPlusLogoUrl")
    private String brandPlusLogoUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("branchId")
    public Integer getBranchId() {
        return branchId;
    }

    @JsonProperty("branchId")
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @JsonProperty("brandPlusLogoURI")
    public String getBrandPlusLogoURI() {
        return brandPlusLogoURI;
    }

    @JsonProperty("brandPlusLogoURI")
    public void setBrandPlusLogoURI(String brandPlusLogoURI) {
        this.brandPlusLogoURI = brandPlusLogoURI;
    }

    @JsonProperty("contactTelephone")
    public String getContactTelephone() {
        return contactTelephone;
    }

    @JsonProperty("contactTelephone")
    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
    }

    @JsonProperty("branchDisplayName")
    public String getBranchDisplayName() {
        return branchDisplayName;
    }

    @JsonProperty("branchDisplayName")
    public void setBranchDisplayName(String branchDisplayName) {
        this.branchDisplayName = branchDisplayName;
    }

    @JsonProperty("branchName")
    public String getBranchName() {
        return branchName;
    }

    @JsonProperty("branchName")
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @JsonProperty("brandTradingName")
    public String getBrandTradingName() {
        return brandTradingName;
    }

    @JsonProperty("brandTradingName")
    public void setBrandTradingName(String brandTradingName) {
        this.brandTradingName = brandTradingName;
    }

    @JsonProperty("branchLandingPageUrl")
    public String getBranchLandingPageUrl() {
        return branchLandingPageUrl;
    }

    @JsonProperty("branchLandingPageUrl")
    public void setBranchLandingPageUrl(String branchLandingPageUrl) {
        this.branchLandingPageUrl = branchLandingPageUrl;
    }

    @JsonProperty("development")
    public Boolean getDevelopment() {
        return development;
    }

    @JsonProperty("development")
    public void setDevelopment(Boolean development) {
        this.development = development;
    }

    @JsonProperty("showReducedProperties")
    public Boolean getShowReducedProperties() {
        return showReducedProperties;
    }

    @JsonProperty("showReducedProperties")
    public void setShowReducedProperties(Boolean showReducedProperties) {
        this.showReducedProperties = showReducedProperties;
    }

    @JsonProperty("commercial")
    public Boolean getCommercial() {
        return commercial;
    }

    @JsonProperty("commercial")
    public void setCommercial(Boolean commercial) {
        this.commercial = commercial;
    }

    @JsonProperty("showOnMap")
    public Boolean getShowOnMap() {
        return showOnMap;
    }

    @JsonProperty("showOnMap")
    public void setShowOnMap(Boolean showOnMap) {
        this.showOnMap = showOnMap;
    }

    @JsonProperty("enhancedListing")
    public Boolean getEnhancedListing() {
        return enhancedListing;
    }

    @JsonProperty("enhancedListing")
    public void setEnhancedListing(Boolean enhancedListing) {
        this.enhancedListing = enhancedListing;
    }

    @JsonProperty("developmentContent")
    public Object getDevelopmentContent() {
        return developmentContent;
    }

    @JsonProperty("developmentContent")
    public void setDevelopmentContent(Object developmentContent) {
        this.developmentContent = developmentContent;
    }

    @JsonProperty("brandPlusLogoUrl")
    public String getBrandPlusLogoUrl() {
        return brandPlusLogoUrl;
    }

    @JsonProperty("brandPlusLogoUrl")
    public void setBrandPlusLogoUrl(String brandPlusLogoUrl) {
        this.brandPlusLogoUrl = brandPlusLogoUrl;
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
