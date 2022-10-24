package apiExam.clients;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static apiExam.constants.ProjectConstants.API_KEY;

public class ClickUpClient {

    private static RequestSpecification getRequests(){
        return RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .header("Authorization", API_KEY)
    }

    public static Response getBoardInfo(){
        return RestAssured
                .given(getRequests())
                .when()
                .get("")
    }

}
