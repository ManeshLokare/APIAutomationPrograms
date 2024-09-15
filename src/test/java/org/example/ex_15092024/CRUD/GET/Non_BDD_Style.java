package org.example.ex_15092024.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Non_BDD_Style {
    public static void main(String[] args) {

        // Rest Assured provide us lot of classes
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/560037");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);




    }
}
