package apitests;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import pojo.User;
import pojo.UserResponse;

public class GetUserDetailsTest {

    @Test
    void  getpojorequest()
    {
        // Base URI
        RestAssured.baseURI = "https://reqres.in";


        // Send GET request and map response to POJO
        UserResponse userResponse = given()
                .queryParam("page", 2)
                .pathParam("u","users")
                .when()
                .get("/api/{u}")
                .then()
                .statusCode(200)
                .extract()
                .as(UserResponse.class);

        // Print first names
        System.out.println("First names from page 2:");
        for (User user : userResponse.getData()) {
            System.out.println(user.getFirst_name());
        }
    }
}

