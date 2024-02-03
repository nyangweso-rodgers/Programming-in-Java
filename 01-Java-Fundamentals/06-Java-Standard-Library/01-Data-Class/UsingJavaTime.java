// using java.time
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class UsingJavaTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("java.time.localDateTime: " + localDateTime); // Output: java.time.localDateTime: 2024-02-03T14:39:50.684603900
        System.out.println("java.time.LocalDate: " + localDate); // Output: java.time.localDate: 2024-02-03
        System.out.println("java.time.LocalTime: " + localTime); // Output: java.time.LocalTime: 14:43:44.543585200
    }
}
