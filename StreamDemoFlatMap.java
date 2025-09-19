import java.util.List;

public class StreamDemoFlatMap {
    public static void main(String[] args) {
        List<List<String >> groups = List.of(
                List.of("a","b"),
                List.of("c"),
                List.of("d","e","f")
        );

        groups.stream()
                .flatMap(group ->{
                    System.out.println("flatMap:group ->"+group);
                    return group.stream().map(s ->{
                        System.out.println(" map-inner:"+s);
                        return s.toUpperCase();
                    });
                })
                .forEach(s ->System.out.println("forEach:"+s));
    }
}
