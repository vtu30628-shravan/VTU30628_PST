import java.util.*;
import java.util.stream.*;

class Task3{

    static class State {
        int currentSum;
        int maxSum;

        State(int currentSum, int maxSum) {
            this.currentSum = currentSum;
            this.maxSum = maxSum;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = IntStream.range(0, n)
                             .map(i -> sc.nextInt())
                             .toArray();

        State result = Arrays.stream(arr)
                .boxed()
                .reduce(
                        new State(0, Integer.MIN_VALUE),
                        (state, x) -> {
                            int current = Math.max(x, state.currentSum + x);
                            int max = Math.max(state.maxSum, current);
                            return new State(current, max);
                        },
                        (a, b) -> a
                );

        System.out.println(result.maxSum);
    }
}