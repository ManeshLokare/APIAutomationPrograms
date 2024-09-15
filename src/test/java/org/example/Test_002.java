package org.example;

import io.restassured.RestAssured;

public class Test_002 {
    public static void main(String[] args) {
        System.out.println("Rest Assured Test Case");
        System.out.println("GET Request Demo");

        // Gherkins syntax....>
        // given() --> URL , Headers, Payload or Body
        // when () --> HTTP Methods  (get,post,patch,put,delete)
        // then () --> verify response (ER==AR)

        RestAssured
                .given()
                      .baseUri("https://reqres.in/api")
                      .basePath("/users/2")
                .when()
                     .get()
                .then().log().all()
                      .statusCode(200);



    }
}
