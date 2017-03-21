package util;

import com.google.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;

public class UrlReaderService {
    private static final Logger LOG = LoggerFactory.getLogger(UrlReaderService.class);

    private final Client client;

    @Inject
    public UrlReaderService(Client client) {
        this.client = client;
    }

    public String sourceFromUrl(String url) {
        LOG.info(String.format("GET : %s", url));
        return client.target(url).request().get(String.class);
    }

}
