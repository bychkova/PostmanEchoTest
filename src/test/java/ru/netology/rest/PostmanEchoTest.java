package ru.netology.rest;

//import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostmanEchoTest {
    @Test
    void postRequestTest() {
        given()
            .baseUri("https://postman-echo.com")
            .body("postRequestTest")
        .when()
            .post("/post")
        .then()
            .statusCode(200)
            .body("data", equalTo("DATA"));
    }
}