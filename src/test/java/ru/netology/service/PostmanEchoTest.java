package ru.netology.service;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class PostmanEchoTest {
    @Test
    void shouldReturnData (){
        given()
                .baseUri("https://postman-echo.com")
                .body("Test")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body ("data", equalTo("Test"))
                ;
    }
}
