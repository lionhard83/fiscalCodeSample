import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calendar date = new GregorianCalendar(1983, 11, 2);
        User user = new User("Carlo", "Leonardi", date);
        System.out.println(user.getFiscalCode());
    }
}
