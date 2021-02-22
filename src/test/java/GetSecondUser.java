import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetSecondUser{

	@JsonProperty("data")
	private DataUser data;

	@JsonProperty("support")
	private Support support;
}
