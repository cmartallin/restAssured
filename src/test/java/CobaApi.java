import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CobaApi {

  public static void main(String[] args) {
    RequestSpecification spec = RestAssured.given();
    Response response = spec.baseUri("https://reqres.in/")
        .log().all()
        .basePath("/api")
        .queryParam("page", "2")
        .header("Accept", "application/json")
        .get("/users");

    System.out.println("status code = " + response.getStatusCode());
    response.getBody().prettyPrint();

    //extract 1 data aja, pakai json path
    String avatar = response.path("data[1].avatar");
    System.out.println("avatarnya nih = " + avatar);

//    //convert json keseluruhan ke object
    GetUsersResponse getUsersResponse = response.as(GetUsersResponse.class);
    System.out.println("avatarnya = " + getUsersResponse.getData().get(2).getAvatar());

    // for each hanya jalan di list
    for (DataItem data : getUsersResponse.getData()) {
      System.out.println("first namenya adalah: " + data.getFirstName());
    }
    System.out.println("urlnya: " + getUsersResponse.getSupport().getUrl());
  }

}
