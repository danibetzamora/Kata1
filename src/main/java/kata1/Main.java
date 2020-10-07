package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
            Person person = new Person("Daniel Santana", LocalDate.of(2000, Month.MARCH, 2));
            System.out.println(person);
    }
}