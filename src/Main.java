import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = IntStream
                .range(2, 101)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(howManyPrimes(nums));

    }

    public static List<Integer> howManyPrimes(List<Integer> nums) {
        return nums
                .stream()
                .filter(n -> IntStream.range(2, n)
                        .allMatch(i -> n % i != 0))
                .collect(Collectors.toList());
    }
}
