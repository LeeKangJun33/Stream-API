import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> names = List.of("Kim","LEE","Park","Son","Cha");

        names.stream()
                .filter(n -> {
                    System.out.println("filter:" +n);
                    return n.startsWith("K");
                })
                .map(n -> {
                    System.out.println("map:" +n);
                    return n.toUpperCase();
                })
                .forEach(n-> System.out.println("forEach:" +n));
    }
}
