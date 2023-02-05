package co.ak.kubernetes.spring.java.propertywatch.service;

import co.ak.kubernetes.spring.java.propertywatch.dto.RightMoveProperty;
import co.ak.kubernetes.spring.java.propertywatch.dto.RightMoveResult;
import co.ak.kubernetes.spring.java.propertywatch.webclient.RightMoveWebClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
@AllArgsConstructor
public class PropertiesFetcher {

    private static final Logger LOG = LoggerFactory.getLogger(PropertiesFetcher.class);

    private RightMoveWebClient rightMoveWebClient;
    private ObjectMapper objectMapper;

    public List<RightMoveProperty> fetchPropertiesForLocationAndType(String locationCode, String type) {
        List<RightMoveProperty> allPropertiesFromRightMove = new ArrayList<>();
        LOG.info("Finding properties for location [{}]", locationCode);
        int index = 0;
        int resultCount = Integer.MAX_VALUE;
        while (index < resultCount) {
            final String rightMoveResponse = rightMoveWebClient.getPropertiesForLocation(locationCode, type, index);
            final RightMoveResult rightMoveResult;
            try {
                rightMoveResult = objectMapper.readValue(rightMoveResponse, RightMoveResult.class);
                LOG.debug("Total number [{}] ", rightMoveResult.getResultCount());
                if (!CollectionUtils.isEmpty(rightMoveResult.getProperties())) {
                    allPropertiesFromRightMove.addAll(rightMoveResult.getProperties());
                }
                index = index + Integer.parseInt(rightMoveResult.getMaxCardsPerPage());
                resultCount = NumberFormat.getNumberInstance(Locale.FRANCE).parse(rightMoveResult.getResultCount()).intValue();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return allPropertiesFromRightMove;
    }
}
