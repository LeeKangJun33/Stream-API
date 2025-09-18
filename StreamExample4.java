import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "LEE", "Yoon");

        names.stream()
                .filter(name -> {
                    System.out.println("filter: " + name);
                    return name.startsWith("K");
                })
                .map(name ->{
                    System.out.println("map: " + name);
                    return name.toUpperCase();
                })
                .forEach(System.out::println);
    }
}
