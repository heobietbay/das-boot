package learn.spring;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

/**
 * Created by Administrator on 7/15/2016.
 */
@WebIntegrationTest
public class ShipwreckControllerWebIntegrationTest extends BaseIntegrationTestInterface {
    @Test
    public void testListAll() throws IOException {
        RestTemplate restTemplate = new TestRestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:7777/api/v1/shipwrecks", String.class);

        assertThat( response.getStatusCode() , equalTo(HttpStatus.OK));

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode responseJson = objectMapper.readTree(response.getBody());

        assertThat( responseJson.isMissingNode() , is(false) );
        assertThat( responseJson.toString() , equalTo("[]") );

    }
}
