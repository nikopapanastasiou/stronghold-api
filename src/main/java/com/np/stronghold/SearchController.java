package com.np.stronghold;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

import java.util.List;

@RestController
@RequestMapping
public class SearchController {

    private static final Logger LOG = LoggerFactory.getLogger(SearchController.class);

    private final String baseUrl;
    private final RestOperations rest;

    public SearchController(String baseUrl, RestOperations rest) {
        this.baseUrl = baseUrl;
        this.rest = rest;
    }

    @GetMapping("/search")
    @Cacheable(value = "searchResults", key = "#q")
    public SearchResult search(@RequestParam String q) {
        LOG.info("searching [q={}]", q);

        return rest.getForObject(baseUrl + "?q=" + q, SearchResult.class);
    }

}
