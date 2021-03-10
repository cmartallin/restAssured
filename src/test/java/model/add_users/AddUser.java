package model.add_users;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddUser {

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("occupation")
  private String occupation;

  @JsonProperty("createdDate")
  private String createdDate;

  @JsonProperty("nationality")
  private String nationality;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("hobbies")
  private List<String> hobbies;

  @JsonProperty("id")
  private String id;

  @JsonProperty("updatedDate")
  private String updatedDate;

  @JsonProperty("age")
  private Integer age;


}