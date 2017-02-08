import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author dani
 */
@AllArgsConstructor
public class ExampleEvent implements Event {
    @Getter private Object data;
}
