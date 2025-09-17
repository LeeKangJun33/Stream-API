import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(n->n%2 ==0) //짝수만
                .map(n->n*n) // 제곱
                .reduce(0,Integer::sum); // 합계

        System.out.println("짝수 제곱의 합:" + sum);
    }
}
