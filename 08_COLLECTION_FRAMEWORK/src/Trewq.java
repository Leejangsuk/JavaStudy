import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor		// 디폴트 생성자
@AllArgsConstructor		// Generate Constructor using Fields
@Getter
@Setter
@ToString
public class Trewq {
	private String name;
	private int age;
}
