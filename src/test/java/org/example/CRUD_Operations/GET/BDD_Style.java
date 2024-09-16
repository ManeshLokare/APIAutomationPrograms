package org.example.CRUD_Operations.GET;

import io.restassured.RestAssured;

public class BDD_Style {
    public static void main(String[] args) {
        // GET Request -
        // Given()........................
        // URL
        // Header
        // get method,
        // base url -- https://api.zippopotam.us
        // basePath -- /IN/560037

        // When()...................
        // payload - yes/no  - json,.xml ->string ,hashmap,object class
        //GET Method ---> GET,POST,PUT,PATCH,DELETE

        // Then()...................
        // Response validation
        // status code
        // response body
        // time,headers,Cookies

        // BDD framework is different - Gherkins Syntax-(given, when,then)
        //  non BDD style -Gherkins Syntax (using classes)

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
