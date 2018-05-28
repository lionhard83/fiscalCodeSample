import java.util.Calendar;

public class User {
    private String name;
    private String surname;
    private Calendar dateOfBirth;

    public User(String param1, String param2, Calendar date) {
        this.name = param1;
        this.surname = param2;
        this.dateOfBirth = date;
    }

    public String getFiscalCode() {
        String firstPart = this.name.substring(0,3);
        String secondPart = this.surname.substring(0,3);
        int year = this.dateOfBirth.get(Calendar.YEAR);
        String yearString = String.valueOf(year);
        return firstPart + secondPart + yearString.substring(2,4);
    }


}
