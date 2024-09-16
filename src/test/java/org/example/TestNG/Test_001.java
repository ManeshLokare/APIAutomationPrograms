package org.example.TestNG;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test_001 {

    @Test

    public void test_get(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .when().log().all()
                .get()
                .then().log().all()
                .statusCode(200);

    }


}
