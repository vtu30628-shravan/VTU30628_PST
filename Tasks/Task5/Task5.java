import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

public class Task5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        AtomicInteger balance = new AtomicInteger(0);

        IntStream.range(0, n)
                .mapToObj(i -> sc.nextLine())
                .forEach(line -> {
                    String[] parts = line.split(" ");
                    String operation = parts[0];
                    int amount = Integer.parseInt(parts[1]);

                    if (operation.equalsIgnoreCase("Deposit")) {
                        balance.addAndGet(amount);
                    } else if (operation.equalsIgnoreCase("Withdraw")) {
                        balance.addAndGet(-amount);
                    }
                });

        System.out.println(balance.get());
    }
}
