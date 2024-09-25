package org.example.TestNG.POJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class String_Payload {
    public static void main(String[] args) {
        // POST Request
        // URL - https://restful-booker.herokuapp.com/auth
        // BODY - PAYLOAD - JSON
        // {
        //    "username" : "admin",
        //    "password" : "password123"
        //}
        // HEADER - Content Type -> application/json

        //  Payload  - String(1%), Hashmap(4%), Classes( 95%)

        String payload  = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log().all()
                .when().body(payload).post()
                .then().log().all().statusCode(200);

    }
}
