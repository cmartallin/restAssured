import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class GetUsersResponse {

  @JsonProperty("per_page")
  private Integer perPage;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("data")
  private List<DataItem> data;

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("total_pages")
  private Integer totalPages;

  @JsonProperty("support")
  private Support support;
}
