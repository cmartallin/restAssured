package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.Arrays;
import model.add_users.AddUser;

public class CobaPost {

  public static void main(String[] args) {
    String jsonBody = "{\n"
        + "    \"id\": \"\",\n"
        + "    \"firstName\": \"dua\",\n"
        + "    \"lastName\": \"lipa\",\n"
        + "    \"age\": 35,\n"
        + "    \"occupation\": \"singer\",\n"
        + "    \"nationality\": \"british\",\n"
        + "    \"hobbies\": [\n"
        + "        \"singing\"\n"
        + "    ],\n"
        + "    \"gender\": \"FEMALE\",\n"
        + "    \"createdDate\": \"2021-02-22T13:29:20.005Z\",\n"
        + "    \"updatedDate\": \"2021-02-22T13:29:20.005Z\"\n"
        + "}";

    RequestSpecification spec = RestAssured.given();
    Response response = spec.baseUri("http://localhost:1234").log().all()
        .basePath("/v1")
        .header("Content-Type", "application/json")
        .header("accept", "application/json")
        .body(generateAddUserRequestBody())
        .post("/users");

    response.getBody().prettyPrint();
    System.out.println("Status codenya: " + response.getStatusCode());
  }

  public static AddUser generateAddUserRequestBody() {

    //tanpa builder
//    AddUser user = new AddUser();
//    user.setFirstName("Paul");
//    user.setLastName("Klein");
//    user.setAge(37);
//    user.setOccupation("vocalist");
//    user.setNationality("American");
//    user.setGender("MALE");
//    user.setHobbies(Arrays.asList("Dancing", "Singing", "Photography"));
////    return user;

    //dengan builder
    return AddUser.builder().firstName("Gigi").lastName("Hadid").age(28).occupation("Model")
        .nationality("American").gender("FEMALE")
        .hobbies(Arrays.asList("Photoshoot", "Endorsement")).build();
  }

}
