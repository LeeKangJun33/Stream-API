import java.util.List;

//reduce(identity, accumulator) 형태
// 합계 곱 최소/최대 등 누적처리에 활용
public class DemoReduce {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);

        int sum = nums.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println("sum:"+sum);

        int max = nums.stream()
                .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println("max:"+max);
    }
}
