package apitests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class OrderApiTest


{

    @Test
    public void weatherAPITest()
    {

        /*

        baseURI="https://openweathermap.org";

        Response response=
                given()
                        .queryParam("lat","51.5156177")
                        .queryParam("lon","-0.0919983")
                        .queryParam("appid","1ae3605562075895c28e02c7a3dbd4f1")
                        .when()
                        .get("/current")
                        .then().extract().response();

        Assert.assertEquals( response.statusCode(),200);
        Assert.assertTrue(response.asString().contains("51.51"));



        File jsonFile = new File("src/test/resources/testdata/userPayload.json");
        JsonPath jsonPath = new JsonPath(jsonFile);

        Response response;
        System.out.println(response.asString());



 */

        String jsonString = "{\n" +
                "  \"id\": \"0001\",\n" +
                "  \"type\": \"donut\",\n" +
                "  \"name\": \"Cake\",\n" +
                "  \"ppu\": 0.55,\n" +
                "  \"batters\": {\n" +
                "    \"batter\": [\n" +
                "      {\n" +
                "        \"id\": \"1001\",\n" +
                "        \"type\": \"Regular\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"1002\",\n" +
                "        \"type\": \"Chocolate\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"1003\",\n" +
                "        \"type\": \"Blueberry\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"1004\",\n" +
                "        \"type\": \"Devil's Food\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"topping\": [\n" +
                "    {\n" +
                "      \"id\": \"5001\",\n" +
                "      \"type\": \"None\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"5002\",\n" +
                "      \"type\": \"Glazed\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"5005\",\n" +
                "      \"type\": \"Sugar\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"5007\",\n" +
                "      \"type\": \"Powdered Sugar\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"5006\",\n" +
                "      \"type\": \"Chocolate with Sprinkles\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"5003\",\n" +
                "      \"type\": \"Chocolate\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"5004\",\n" +
                "      \"type\": \"Maple\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

       // JSONObject jsonObject = new JSONObject(jsonString);

        JsonPath jp=new JsonPath(jsonString);

       for(int i=0;i<5;i++) {
        System.out.println(   jp.getString("topping["+i+"].type"));

       }





    }
}
