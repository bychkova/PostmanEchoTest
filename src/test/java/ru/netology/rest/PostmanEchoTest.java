package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void PostRequestTest(){
        given()
                .baseUri("https://postman-echo.com")
                //.body("data", name)
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                //.body(/* --> ваша проверка здесь <-- */)
        ;
    }
}
