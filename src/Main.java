import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        IntStream
                .range(2, 101)
                        .forEach(nums::add);

        System.out.println(howManyPrimes(nums));

    }

    public static List<Integer> howManyPrimes(List<Integer> nums) {
        return nums
                .stream()
                .filter(n -> n != 1 && (n % 2 != 0 || n == 2))
                .filter(n -> IntStream.range(2, n - 1)
                        .allMatch(i -> n % i != 0))
                .collect(Collectors.toList());
    }
}
