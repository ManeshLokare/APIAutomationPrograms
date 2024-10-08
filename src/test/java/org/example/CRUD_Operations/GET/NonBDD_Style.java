package org.example.CRUD_Operations.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

 public class NonBDD_Style {
        static RequestSpecification r = RestAssured.given();

        public static void main(String[] args) {
//        r.useRelaxedHTTPSValidation("TLS""); - HTTPs related issued
            r.baseUri("https://api.zippopotam.us");
            testnon_bdd_1();
            testnon_bdd_2();
        }

        private static void testnon_bdd_2() {
            r.basePath("/IN/560038");
            r.when().log().all().get();
            r.then().statusCode(200);
        }

        private static void testnon_bdd_1() {
            r.basePath("/IN/560037");
            r.when().log().all().get();
            r.then().statusCode(200);
        }
    }

