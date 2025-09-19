import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoGroupingBy {
    public static void main(String[] args) {
        List<String> names = List.of("Kim","Lee","Park","NJG","NIGGa");

        Map<Character,List<String>> grouped =
                names.stream()
                        .collect(Collectors.groupingBy(n->n.charAt(0)));
        System.out.println(grouped);

    }
}
