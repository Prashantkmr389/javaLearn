
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class StreamApis {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,2,3,4, 5, 6, 7);
        int sum = 0;
        for(int a : nums){
            if(a%2 == 0){
                a = a*2;
                sum += a;
            }

        }
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.print(n + " ");
            }
        };

        Stream<Integer> s1 = nums.stream();
        
        nums.forEach(con);
        nums.forEach(n -> System.out.println(n));
        System.out.println(nums);
        // s1.forEach(n -> System.out.println(n));
        Stream<Integer> s2 =  s1.filter(n -> n%2 == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        s3.forEach(con);

        int res = nums.stream()
                    .filter(n -> n%2 == 0)
                    .map(n -> n*2)
                    .reduce(0, (c, e)-> c+e);
        Stream<Integer> sortedval = nums.stream()
                                        .filter(n -> n%2== 0)
                                        .sorted();
                                    
        
        System.out.println(res);
        sortedval.forEach(n -> System.out.print(n + " "));
    }
}
