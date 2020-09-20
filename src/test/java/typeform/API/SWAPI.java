package typeform.API;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.annotations.Test;


public class SWAPI {

    @Test
    public void mainTestCase() {

        String baseUrl = "https://swapi.dev/api/";

        HttpResponse<JsonNode> jsonResponse = Unirest.get(baseUrl + "people/1")
                .asJson();

        org.junit.Assert.assertNotNull(jsonResponse);
        org.junit.Assert.assertEquals("Luke Skywalker", jsonResponse.getBody().getObject().get("name"));



        System.out.println(jsonResponse.getStatus());
        System.out.println(jsonResponse.getBody().toPrettyString());


    }

}
