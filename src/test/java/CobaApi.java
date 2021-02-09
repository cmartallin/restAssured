import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CobaApi {

  public static void main(String[] args) {
    RequestSpecification spec = RestAssured.given();
    Response response = spec.baseUri("https://reqres.in/")
        .log().all()
        .basePath("/api")
        .get("/users/2");

    System.out.println("status code = " + response.getStatusCode());
    response.getBody().prettyPrint();

    GetSecondUser getSecondUser = response.as(GetSecondUser.class);
    System.out.println("eh url-nya nih: " + getSecondUser.getSupport().getUrl());
  }

}
