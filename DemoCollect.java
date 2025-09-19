import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoCollect {
    public static void main(String[] args) {
        // 리스트 Collect
        List<String> names = List.of("John", "Jane", "Jack", "Jill", "Bob");
        List<String> list = names.stream()
                .collect(Collectors.toList());
        System.out.println("toList:"+list);

        // 중복 없는 집합
        Set<String> set = names.stream()
                .collect(Collectors.toSet());
        System.out.println("toSet:"+set);

        //문자열 결합
        String joined = names.stream()
                .collect(Collectors.joining(","));
        System.out.println("joined:"+joined);
    }
}
