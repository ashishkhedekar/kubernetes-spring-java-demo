package co.ak.kubernetes.spring.java.propertywatch.webclient;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RightMoveWebClient {

    private static final Logger LOG = LoggerFactory.getLogger(RightMoveWebClient.class);

    @Value("${right.move.base.url}")
    private String rightMoveBaseUrl;

    @Value("${right.move.search.api.url}")
    private String rightMoveSearchApiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @SneakyThrows
    public String getPropertiesForLocation(final String locationId, String type, int index)
    {
        return restTemplate.getForObject(URI.create(buildSearchUrl(locationId, type, index)), String.class);
    }

    private String buildSearchUrl(String locationId, String type, int index)
    {

        if (type != null && type.equalsIgnoreCase("BUY"))
        {
            final String url = rightMoveBaseUrl + rightMoveSearchApiUrl + String.format("?locationIdentifier=%s&channel=BUY&radius=3.0&minBedrooms=3&includeSSTC=true&index=%d", locationId, index);
            LOG.debug("The BUY url is [{}] ", url);
            return url;
        }
        else {
            final String url = rightMoveBaseUrl + rightMoveSearchApiUrl + String.format("?locationIdentifier=%s&channel=RENT&radius=3.0&minBedrooms=3&includeLetAgreed=true&index=%d", locationId, index);
            LOG.debug("The LET url is [{}] ", url);
            return url;
        }
    }

}
