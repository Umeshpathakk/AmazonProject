package apitests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.CreateUserRequest;
import pojo.CreateUserResponse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;


import static io.restassured.RestAssured.*;

public class CreateUserTest
{

    @Test
    public void stringJsonPath() throws IOException {
        RestAssured.baseURI = "https://reqres.in";

        //1. Create request POJO
     //   CreateUserRequest requestBody = new CreateUserRequest("morpheus", "leader");

        //2. Create using external file then pojo
     //   ObjectMapper mapper = new ObjectMapper();
     ///   File file = new File("src/test/resources/testdata/userPayload.json");
       // CreateUserRequest requestBody = mapper.readValue(file, CreateUserRequest.class);


        //3. create using String
        // Read file content into String
        String requestBody = new String(Files.readAllBytes(Paths.get("src/test/resources/testdata/createUser.json")));





        // Send POST request
        Response response = given()
                .contentType(ContentType.JSON)
                .header("x-api-key", "reqres-free-v1")
                .body(requestBody)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .extract()
                .response();

        CreateUserResponse createUser = response.as(CreateUserResponse.class);


        // Print results
        System.out.println("User ID: " + createUser.getId());
        System.out.println("Created At: " + createUser.getCreatedAt());

        //work for string
      JsonPath jp= new JsonPath(requestBody);
     System.out.println(  jp.getString("name"));
    }

    @Test
    public void basicPojo()
        {
    RestAssured.baseURI = "https://reqres.in";

    //1. Create request POJO
       CreateUserRequest requestBody = new CreateUserRequest("morpheus", "leader");

    //2. Create using external file then pojo
    //   ObjectMapper mapper = new ObjectMapper();
    ///   File file = new File("src/test/resources/testdata/userPayload.json");
    // CreateUserRequest requestBody = mapper.readValue(file, CreateUserRequest.class);


    //3. create using String
    // Read file content into String
   // String requestBody = new String(Files.readAllBytes(Paths.get("src/test/resources/testdata/createUser.json")));





    // Send POST request
    CreateUserResponse response = given()
            .contentType(ContentType.JSON)
            .header("x-api-key", "reqres-free-v1")
            .body(requestBody)
            .when()
            .post("/api/users")
            .then()
            .statusCode(201)
            .extract()
            .as(CreateUserResponse.class);

    // Print results
    System.out.println("User ID: " + response.getId());
    System.out.println("Created At: " + response.getCreatedAt());

    //work for string
  //  JsonPath jp= new JsonPath(requestBody);
   // System.out.println(  jp.getString("name"));
}
    @Test
    public void externalFile() throws IOException {
        RestAssured.baseURI = "https://reqres.in";

        //1. Create request POJO
       // CreateUserRequest requestBody = new CreateUserRequest("morpheus", "leader");

        //2. Create using external file then pojo
           ObjectMapper mapper = new ObjectMapper();
           File file = new File("src/test/resources/testdata/userPayload.json");
         CreateUserRequest requestBody = mapper.readValue(file, CreateUserRequest.class);


        //3. create using String
        // Read file content into String
        // String requestBody = new String(Files.readAllBytes(Paths.get("src/test/resources/testdata/createUser.json")));





        // Send POST request
        CreateUserResponse response = given()
                .contentType(ContentType.JSON)
                .header("x-api-key", "reqres-free-v1")
                .body(requestBody)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .extract().response()
                .as(CreateUserResponse.class);

        // Print results
        System.out.println("User ID: " + response.getId());
        System.out.println("Created At: " + response.getCreatedAt());

        //work for string
        //  JsonPath jp= new JsonPath(requestBody);
        // System.out.println(  jp.getString("name"));






       // String str=new S
    }



    @Test
    public void localJson() throws IOException {
        RestAssured.baseURI = "https://reqres.in";



        String str="{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 30,\n" +
                "  \"contact\": {\n" +
                "    \"email\": \"john.doe@example.com\",\n" +
                "    \"phone\": {\n" +
                "      \"home\": \"123-456-7890\",\n" +
                "      \"mobile\": \"987-654-3210\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"address\": {\n" +
                "    \"street\": \"123 Main St\",\n" +
                "    \"city\": \"New York\",\n" +
                "    \"zip\": \"10001\"\n" +
                "  }\n" +
                "}";


        JsonPath jp= new JsonPath(str);

        System.out.println(jp.getString("name"));
        System.out.println(jp.getString("contact.email"));
        System.out.println(jp.getString("address.city"));




    }

    @Test
   public  void testabcpost()
    {

        baseURI="https://reqres.in/api/users";

        JSONObject jo=new JSONObject();
        jo.put("name","morpheus");
        jo.put("job","leader");

        Response response =
                given()
                        .header("x-api-key", "reqres-free-v1")
                        .contentType(ContentType.JSON)
                        .body(jo.toString())
                        .post()
                        .then()
                        .log().all()

                        .extract().response();


        System.out.println(response.asString());

    }


}

