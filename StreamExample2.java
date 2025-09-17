import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String > names = Arrays.asList("Kim","Lee","Park","Choi","Seo","Yoon");

        names.stream()
                .filter(name -> name.length() <= 4) //글자수 4이하만
                .sorted()
                .forEach(System.out::println);
    }
}
