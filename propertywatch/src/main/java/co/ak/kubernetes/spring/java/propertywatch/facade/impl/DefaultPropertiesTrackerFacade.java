package co.ak.kubernetes.spring.java.propertywatch.facade.impl;

import co.ak.kubernetes.spring.java.propertywatch.dto.RightMoveProperty;
import co.ak.kubernetes.spring.java.propertywatch.facade.PropertiesTrackerFacade;
import co.ak.kubernetes.spring.java.propertywatch.service.PropertiesFetcher;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class DefaultPropertiesTrackerFacade implements PropertiesTrackerFacade {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultPropertiesTrackerFacade.class);

    @Autowired
    private PropertiesFetcher propertiesFetcher;

    @Value("${locations.to.track}")
    private String locationsToTrack;

    @Override
    public void getPropertiesForType(String type) {
        Map<String, String> locationsToWatch = getLocationsToWatch();
        locationsToWatch.forEach((locationName,locationCode) -> {
            List<RightMoveProperty> rightMoveProperties = propertiesFetcher.fetchPropertiesForLocationAndType(locationCode, type);
            LOG.info("Found [{}] properties for location [{}]", rightMoveProperties.size(), locationName);
            rightMoveProperties.forEach(property -> {
                LOG.debug("Got update for the property [{}]", property.getId());
            });
        });
    }

    private Map<String, String> getLocationsToWatch() {
        Map<String, String> locationToWatch = new HashMap<>();
        String[] allLocations = locationsToTrack.split(";");
        for (String location : allLocations) {
            String[] locationDetails = location.split(",");
            locationToWatch.put(locationDetails[0], locationDetails[1]);
        }
        return locationToWatch;
    }
}
