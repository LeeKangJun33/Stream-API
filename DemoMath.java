import java.util.List;

public class DemoMath {
    public static void main(String[] args) {
        List<String> names = List.of("Kim", "Lee", "Park");

        boolean hasKim = names.stream()
                .anyMatch(n -> n.equals("Kim"));
        System.out.println("anyMatch Kim: " + hasKim);

        boolean allThreeLetters = names.stream()
                .allMatch(n -> n.length() == 3);
        System.out.println("allMatch length=3: " + allThreeLetters);

        boolean noneStartsWithX = names.stream()
                .noneMatch(n -> n.startsWith("X"));
        System.out.println("noneMatch startsWith X: " + noneStartsWithX);
    }
}
