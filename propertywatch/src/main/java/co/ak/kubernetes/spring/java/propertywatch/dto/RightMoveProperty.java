
package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "bedrooms",
    "numberOfImages",
    "numberOfFloorplans",
    "numberOfVirtualTours",
    "summary",
    "displayAddress",
    "countryCode",
    "location",
    "propertySubType",
    "listingUpdate",
    "premiumListing",
    "featuredProperty",
    "price",
    "customer",
    "distance",
    "transactionType",
    "productLabel",
    "commercial",
    "development",
    "residential",
    "students",
    "auction",
    "feesApply",
    "feesApplyText",
    "displaySize",
    "showOnMap",
    "propertyUrl",
    "contactUrl",
    "channel",
    "firstVisibleDate",
    "keywords",
    "keywordMatchType",
    "saved",
    "hidden",
    "onlineViewingsAvailable",
    "heading",
    "enhancedListing",
    "propertyTypeFullDescription",
    "propertyImages",
    "displayStatus",
    "formattedBranchName",
    "addedOrReduced",
    "isRecent",
    "formattedDistance",
    "hasBrandPlus"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RightMoveProperty
{
    private Long id;
    @JsonProperty("bedrooms")
    private Integer bedrooms;
    @JsonProperty("numberOfImages")
    private Integer numberOfImages;
    @JsonProperty("numberOfFloorplans")
    private Integer numberOfFloorplans;
    @JsonProperty("numberOfVirtualTours")
    private Integer numberOfVirtualTours;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("displayAddress")
    private String displayAddress;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("location")
    private RightMoveLocation rightMoveLocation;
    @JsonProperty("propertySubType")
    private String propertySubType;
    @JsonProperty("listingUpdate")
    private RightMoveListingUpdate rightMoveListingUpdate;
    @JsonProperty("premiumListing")
    private Boolean premiumListing;
    @JsonProperty("featuredProperty")
    private Boolean featuredProperty;
    @JsonProperty("price")
    private RightMovePrice rightMovePrice;
    @JsonProperty("customer")
    private RightMoveCustomer rightMoveCustomer;
    @JsonProperty("distance")
    private Object distance;
    @JsonProperty("transactionType")
    private String transactionType;
    @JsonProperty("productLabel")
    private RightMoveProductLabel rightMoveProductLabel;
    @JsonProperty("commercial")
    private Boolean commercial;
    @JsonProperty("development")
    private Boolean development;
    @JsonProperty("residential")
    private Boolean residential;
    @JsonProperty("students")
    private Boolean students;
    @JsonProperty("auction")
    private Boolean auction;
    @JsonProperty("feesApply")
    private Boolean feesApply;
    @JsonProperty("feesApplyText")
    private Object feesApplyText;
    @JsonProperty("displaySize")
    private String displaySize;
    @JsonProperty("showOnMap")
    private Boolean showOnMap;
    @JsonProperty("propertyUrl")
    private String propertyUrl;
    @JsonProperty("contactUrl")
    private String contactUrl;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("firstVisibleDate")
    private String firstVisibleDate;
    @JsonProperty("keywords")
    private List<Object> keywords = null;
    @JsonProperty("keywordMatchType")
    private String keywordMatchType;
    @JsonProperty("saved")
    private Object saved;
    @JsonProperty("hidden")
    private Object hidden;
    @JsonProperty("onlineViewingsAvailable")
    private Boolean onlineViewingsAvailable;
    @JsonProperty("heading")
    private String heading;
    @JsonProperty("enhancedListing")
    private Boolean enhancedListing;
    @JsonProperty("propertyTypeFullDescription")
    private String propertyTypeFullDescription;
    @JsonProperty("propertyImages")
    private RightMovePropertyImages rightMovePropertyImages;
    @JsonProperty("displayStatus")
    private String displayStatus;
    @JsonProperty("formattedBranchName")
    private String formattedBranchName;
    @JsonProperty("addedOrReduced")
    private String addedOrReduced;
    @JsonProperty("isRecent")
    private Boolean isRecent;
    @JsonProperty("formattedDistance")
    private String formattedDistance;
    @JsonProperty("hasBrandPlus")
    private Boolean hasBrandPlus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonIgnore
    private String fullPropertyUrl;
    @JsonIgnore
    private long daysOnMarket;

    @JsonProperty("isFirstUpdate")
    private boolean isFirstUpdate;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("bedrooms")
    public Integer getBedrooms() {
        return bedrooms;
    }

    @JsonProperty("bedrooms")
    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    @JsonProperty("numberOfImages")
    public Integer getNumberOfImages() {
        return numberOfImages;
    }

    @JsonProperty("numberOfImages")
    public void setNumberOfImages(Integer numberOfImages) {
        this.numberOfImages = numberOfImages;
    }

    @JsonProperty("numberOfFloorplans")
    public Integer getNumberOfFloorplans() {
        return numberOfFloorplans;
    }

    @JsonProperty("numberOfFloorplans")
    public void setNumberOfFloorplans(Integer numberOfFloorplans) {
        this.numberOfFloorplans = numberOfFloorplans;
    }

    @JsonProperty("numberOfVirtualTours")
    public Integer getNumberOfVirtualTours() {
        return numberOfVirtualTours;
    }

    @JsonProperty("numberOfVirtualTours")
    public void setNumberOfVirtualTours(Integer numberOfVirtualTours) {
        this.numberOfVirtualTours = numberOfVirtualTours;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("displayAddress")
    public String getDisplayAddress() {
        return displayAddress;
    }

    @JsonProperty("displayAddress")
    public void setDisplayAddress(String displayAddress) {
        this.displayAddress = displayAddress;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("location")
    public RightMoveLocation getRightMoveLocation() {
        return rightMoveLocation;
    }

    @JsonProperty("location")
    public void setRightMoveLocation(RightMoveLocation rightMoveLocation) {
        this.rightMoveLocation = rightMoveLocation;
    }

    @JsonProperty("propertySubType")
    public String getPropertySubType() {
        return propertySubType;
    }

    @JsonProperty("propertySubType")
    public void setPropertySubType(String propertySubType) {
        this.propertySubType = propertySubType;
    }

    @JsonProperty("listingUpdate")
    public RightMoveListingUpdate getRightMoveListingUpdate() {
        return rightMoveListingUpdate;
    }

    @JsonProperty("listingUpdate")
    public void setRightMoveListingUpdate(RightMoveListingUpdate rightMoveListingUpdate) {
        this.rightMoveListingUpdate = rightMoveListingUpdate;
    }

    @JsonProperty("premiumListing")
    public Boolean getPremiumListing() {
        return premiumListing;
    }

    @JsonProperty("premiumListing")
    public void setPremiumListing(Boolean premiumListing) {
        this.premiumListing = premiumListing;
    }

    @JsonProperty("featuredProperty")
    public Boolean getFeaturedProperty() {
        return featuredProperty;
    }

    @JsonProperty("featuredProperty")
    public void setFeaturedProperty(Boolean featuredProperty) {
        this.featuredProperty = featuredProperty;
    }

    @JsonProperty("price")
    public RightMovePrice getRightMovePrice() {
        return rightMovePrice;
    }

    @JsonProperty("price")
    public void setRightMovePrice(RightMovePrice rightMovePrice) {
        this.rightMovePrice = rightMovePrice;
    }

    @JsonProperty("customer")
    public RightMoveCustomer getRightMoveCustomer() {
        return rightMoveCustomer;
    }

    @JsonProperty("customer")
    public void setRightMoveCustomer(RightMoveCustomer rightMoveCustomer) {
        this.rightMoveCustomer = rightMoveCustomer;
    }

    @JsonProperty("distance")
    public Object getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Object distance) {
        this.distance = distance;
    }

    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("productLabel")
    public RightMoveProductLabel getRightMoveProductLabel() {
        return rightMoveProductLabel;
    }

    @JsonProperty("productLabel")
    public void setRightMoveProductLabel(RightMoveProductLabel rightMoveProductLabel) {
        this.rightMoveProductLabel = rightMoveProductLabel;
    }

    @JsonProperty("commercial")
    public Boolean getCommercial() {
        return commercial;
    }

    @JsonProperty("commercial")
    public void setCommercial(Boolean commercial) {
        this.commercial = commercial;
    }

    @JsonProperty("development")
    public Boolean getDevelopment() {
        return development;
    }

    @JsonProperty("development")
    public void setDevelopment(Boolean development) {
        this.development = development;
    }

    @JsonProperty("residential")
    public Boolean getResidential() {
        return residential;
    }

    @JsonProperty("residential")
    public void setResidential(Boolean residential) {
        this.residential = residential;
    }

    @JsonProperty("students")
    public Boolean getStudents() {
        return students;
    }

    @JsonProperty("students")
    public void setStudents(Boolean students) {
        this.students = students;
    }

    @JsonProperty("auction")
    public Boolean getAuction() {
        return auction;
    }

    @JsonProperty("auction")
    public void setAuction(Boolean auction) {
        this.auction = auction;
    }

    @JsonProperty("feesApply")
    public Boolean getFeesApply() {
        return feesApply;
    }

    @JsonProperty("feesApply")
    public void setFeesApply(Boolean feesApply) {
        this.feesApply = feesApply;
    }

    @JsonProperty("feesApplyText")
    public Object getFeesApplyText() {
        return feesApplyText;
    }

    @JsonProperty("feesApplyText")
    public void setFeesApplyText(Object feesApplyText) {
        this.feesApplyText = feesApplyText;
    }

    @JsonProperty("displaySize")
    public String getDisplaySize() {
        return displaySize;
    }

    @JsonProperty("displaySize")
    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    @JsonProperty("showOnMap")
    public Boolean getShowOnMap() {
        return showOnMap;
    }

    @JsonProperty("showOnMap")
    public void setShowOnMap(Boolean showOnMap) {
        this.showOnMap = showOnMap;
    }

    @JsonProperty("propertyUrl")
    public String getPropertyUrl() {
        return propertyUrl;
    }

    @JsonProperty("propertyUrl")
    public void setPropertyUrl(String propertyUrl) {
        this.propertyUrl = propertyUrl;
    }

    @JsonProperty("contactUrl")
    public String getContactUrl() {
        return contactUrl;
    }

    @JsonProperty("contactUrl")
    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("firstVisibleDate")
    public String getFirstVisibleDate() {
        return firstVisibleDate;
    }

    @JsonProperty("firstVisibleDate")
    public void setFirstVisibleDate(String firstVisibleDate) {
        this.firstVisibleDate = firstVisibleDate;
    }

    @JsonProperty("keywords")
    public List<Object> getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(List<Object> keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("keywordMatchType")
    public String getKeywordMatchType() {
        return keywordMatchType;
    }

    @JsonProperty("keywordMatchType")
    public void setKeywordMatchType(String keywordMatchType) {
        this.keywordMatchType = keywordMatchType;
    }

    @JsonProperty("saved")
    public Object getSaved() {
        return saved;
    }

    @JsonProperty("saved")
    public void setSaved(Object saved) {
        this.saved = saved;
    }

    @JsonProperty("hidden")
    public Object getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Object hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("onlineViewingsAvailable")
    public Boolean getOnlineViewingsAvailable() {
        return onlineViewingsAvailable;
    }

    @JsonProperty("onlineViewingsAvailable")
    public void setOnlineViewingsAvailable(Boolean onlineViewingsAvailable) {
        this.onlineViewingsAvailable = onlineViewingsAvailable;
    }

    @JsonProperty("heading")
    public String getHeading() {
        return heading;
    }

    @JsonProperty("heading")
    public void setHeading(String heading) {
        this.heading = heading;
    }

    @JsonProperty("enhancedListing")
    public Boolean getEnhancedListing() {
        return enhancedListing;
    }

    @JsonProperty("enhancedListing")
    public void setEnhancedListing(Boolean enhancedListing) {
        this.enhancedListing = enhancedListing;
    }

    @JsonProperty("propertyTypeFullDescription")
    public String getPropertyTypeFullDescription() {
        return propertyTypeFullDescription;
    }

    @JsonProperty("propertyTypeFullDescription")
    public void setPropertyTypeFullDescription(String propertyTypeFullDescription) {
        this.propertyTypeFullDescription = propertyTypeFullDescription;
    }

    @JsonProperty("propertyImages")
    public RightMovePropertyImages getRightMovePropertyImages() {
        return rightMovePropertyImages;
    }

    @JsonProperty("propertyImages")
    public void setRightMovePropertyImages(RightMovePropertyImages rightMovePropertyImages) {
        this.rightMovePropertyImages = rightMovePropertyImages;
    }

    @JsonProperty("displayStatus")
    public String getDisplayStatus() {
        return displayStatus;
    }

    @JsonProperty("displayStatus")
    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    @JsonProperty("formattedBranchName")
    public String getFormattedBranchName() {
        return formattedBranchName;
    }

    @JsonProperty("formattedBranchName")
    public void setFormattedBranchName(String formattedBranchName) {
        this.formattedBranchName = formattedBranchName;
    }

    @JsonProperty("addedOrReduced")
    public String getAddedOrReduced() {
        return addedOrReduced;
    }

    @JsonProperty("addedOrReduced")
    public void setAddedOrReduced(String addedOrReduced) {
        this.addedOrReduced = addedOrReduced;
    }

    @JsonProperty("isRecent")
    public Boolean getIsRecent() {
        return isRecent;
    }

    @JsonProperty("isRecent")
    public void setIsRecent(Boolean isRecent) {
        this.isRecent = isRecent;
    }

    @JsonProperty("formattedDistance")
    public String getFormattedDistance() {
        return formattedDistance;
    }

    @JsonProperty("formattedDistance")
    public void setFormattedDistance(String formattedDistance) {
        this.formattedDistance = formattedDistance;
    }

    @JsonProperty("hasBrandPlus")
    public Boolean getHasBrandPlus() {
        return hasBrandPlus;
    }

    @JsonProperty("hasBrandPlus")
    public void setHasBrandPlus(Boolean hasBrandPlus) {
        this.hasBrandPlus = hasBrandPlus;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getFullPropertyUrl()
    {
        return fullPropertyUrl;
    }

    public void setFullPropertyUrl(String fullPropertyUrl)
    {
        this.fullPropertyUrl = fullPropertyUrl;
    }

    public long getDaysOnMarket()
    {
        return daysOnMarket;
    }

    public void setDaysOnMarket(long daysOnMarket)
    {
        this.daysOnMarket = daysOnMarket;
    }

    public boolean isFirstUpdate() {
        return isFirstUpdate;
    }

    public void setFirstUpdate(boolean firstUpdate) {
        isFirstUpdate = firstUpdate;
    }
}
