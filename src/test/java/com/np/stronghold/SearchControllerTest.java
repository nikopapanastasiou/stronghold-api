package com.np.stronghold;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestOperations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SearchControllerTest {

    @Test
    public void testSearch() {
        var baseUrl = "http://fake.url";
        var rest = mock(RestOperations.class);

        var controller = new SearchController(baseUrl, rest);

        controller.search("123");

        verify(rest).getForObject("http://fake.url?q=123", SearchResult.class);
    }

}
