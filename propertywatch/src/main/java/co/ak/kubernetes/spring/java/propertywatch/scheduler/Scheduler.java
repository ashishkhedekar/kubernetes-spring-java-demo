package co.ak.kubernetes.spring.java.propertywatch.scheduler;

import co.ak.kubernetes.spring.java.propertywatch.facade.PropertiesTrackerFacade;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
public class Scheduler {

    private static final Logger LOG = LoggerFactory.getLogger(Scheduler.class);
    private final PropertiesTrackerFacade propertiesTrackerFacade;

    @Scheduled(cron = "${rightMove.buy.property.fetch.schedule}")
    public void fetchRightMoveBuyPropertyUpdates() {
        propertiesTrackerFacade.getPropertiesForType("BUY");
    }

    @Scheduled(cron = "${rightMove.let.property.fetch.schedule}")
    public void fetchRightMoveLetPropertyUpdates() {
        propertiesTrackerFacade.getPropertiesForType("LET");
    }
}
