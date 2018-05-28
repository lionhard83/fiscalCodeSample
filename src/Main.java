import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calendar date = new GregorianCalendar(1983, 11, 2);

        User user = new User("Carlo", "Leonardi", date);
        System.out.println(user.getFiscalCode());

        Calendar date2 = new GregorianCalendar(1983, 3, 22);
        User user2 = new User("Igor", "Map", date2);
        System.out.println(user2.getFiscalCode());

        User user3 = new User("John", "Doe", date);
        System.out.println(user3.getFiscalCode());

        //Parte 0
        // contemplare +40 in day se Donna

        // Parte1
        // IGOR GRI
        // EDER DRE
        // ALDO DLA
        // MARIO MRA
        // ALFIO LFA
        // JO  JOX
        // OT  TOX

        //parte2
        // c1 c3 c4 <- c1 c2 c3
        // if (!c4) c1 c3 c2




    }
}
