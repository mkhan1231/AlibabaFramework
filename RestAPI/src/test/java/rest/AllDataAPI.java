package rest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class AllDataAPI {

    @Test
    public void callAllEmployeeResources() {
        Response response = given().when().get("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=a104f9105b384c15b810feafd3fa56be").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().print();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
        System.out.println(statusCode);
    }
    @Test
    public void badCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=a104f9105b384c15b810feafd3fa56bexxx");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        System.out.println(statusCode);
        Assert.assertEquals(statusCode, 401);
    }
    @Test
    public void serverErrorCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=a104f9105b384c15b810feafd3fa56be").then().statusCode(200).extract().response();
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        System.out.println(statusCode);
        Assert.assertEquals(statusCode, 200);
    }
}