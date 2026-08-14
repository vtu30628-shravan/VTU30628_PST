import java.util.*;
import java.util.stream.*;

class Reading {
    String sensorId;
    double temperature;

    Reading(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getTemperature() {
        return temperature;
    }
}

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Reading> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            double temp = sc.nextDouble();
            readings.add(new Reading(id, temp));
        }

        Map<String, Double> avgTemp = readings.stream()
                .filter(r -> r.getTemperature() > 50)
                .collect(Collectors.groupingBy(
                        r->r.getSensorId(),
                        Collectors.averagingDouble(r->r.getTemperature())
                ));

        avgTemp.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
