import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class First {
   public static void main(String[] args) {
       List<String> names = Arrays.asList("Alice","Bob","Charlie","David");

       System.out.println("Using traditional loop: ");
       List<String > filteredAndSortedNames = new ArrayList<>();
       for(String name : names) {
           if (name.startsWith("A")&& name.length() >=4){
               filteredAndSortedNames.add(name);
           }
       }

       Collections.sort(filteredAndSortedNames);
       for(String name : filteredAndSortedNames) {
           System.out.println(name);
       }

       //위의 반복문 코드를 Stream 사용해서 가독성 향상, 코드 변환
       System.out.println("Using Stream API:");
       names.stream()
               .filter(name ->name.startsWith("A") && name.length()>=4)
               .sorted()
               .forEach(System.out::println);
   }
}
