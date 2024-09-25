package org.example.CRUD_Operations.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class NonBDD_Style {
    public static void main(String[] args) {


        String payload  = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";

        // given - request specification

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        // when -- response specification
        Response response = r.when().post();


        // then -- validation  Response
        ValidatableResponse vr = response.then();
        vr.statusCode(200);





    }

}
