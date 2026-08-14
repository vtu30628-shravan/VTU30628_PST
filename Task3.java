import java.util.*;
import java.util.stream.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of values:");

        int n = sc.nextInt();
        System.out.println("Enter Values:");

        int[] arr = IntStream.range(0, n)
                             .map(i -> sc.nextInt())
                             .toArray();

        int[] result = Arrays.stream(arr)
                .boxed()
                .reduce(
                        new int[]{0, Integer.MIN_VALUE},
                        (state, x) -> {
                            int current = Math.max(x, state[0] + x);
                            int max = Math.max(state[1], current);
                            return new int[]{current, max};
                        },
                        (a, b) -> a
                );

        System.out.println(result[1]);
    }
}