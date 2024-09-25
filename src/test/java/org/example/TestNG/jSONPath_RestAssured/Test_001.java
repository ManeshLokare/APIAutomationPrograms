package org.example.TestNG.jSONPath_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class Test_001 {
    //  POST - Create -> Verify the Response
    RequestSpecification r;
   // ValidatableResponse vr;


    @Test
    public void test_post() {

        String payload_POST = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payload_POST);

        Response response = r.when().post();

        System.out.println(response.asString());
      // extract data from the response------->
        JsonPath jsonPath = new JsonPath(response.asString());
        String bookingId  = jsonPath.getString("bookingid");
        String firstname  = jsonPath.getString("booking.firstname");
        String checkout  = jsonPath.getString("booking.bookingdates.checkout");

        // print response data------->
        System.out.println(bookingId);
        System.out.println(firstname);
        System.out.println(checkout);

        // validation response by using (assertJ core)
        assertThat(bookingId).isNotNull().isNotBlank().isGreaterThan("0");
        assertThat(firstname).isNotNull().isNotBlank().isEqualTo("Pramod");
        assertThat(checkout).isNotNull().isNotBlank();





    }
}
