package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
            Person person = new Person("Luis Hernández", LocalDate.of(1970, Month.MARCH, 2));
            System.out.println(person);
    }
}