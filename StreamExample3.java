import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "example");

        Map<Character,List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0))); // 첫 글자로 그룹화
        System.out.println(grouped);
    }
}
