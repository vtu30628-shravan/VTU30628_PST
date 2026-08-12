import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Task1Pst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Function<Integer, Integer> increase = x -> x + x / 10;

        for (int i = 0; i < n; i++) {
            int salary = sc.nextInt();
            System.out.print(increase.apply(salary) + " ");
        }
    }
}