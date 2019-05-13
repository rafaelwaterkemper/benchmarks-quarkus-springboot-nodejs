package com.waterkcorp.easyoffice.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

@QuarkusTest
public class PersonResourceTest {

    @Test
    public void testPersonGET() {
        given()
          .when().get("/person")
          .then()
             .statusCode(200);
    }

}