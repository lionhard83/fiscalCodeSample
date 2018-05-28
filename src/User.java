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
        String firstPart = this.convert(this.name);
        String secondPart = this.convert(this.surname);

        int year = this.dateOfBirth.get(Calendar.YEAR);
        String yearString = String.valueOf(year);

        int monthValue = this.dateOfBirth.get(Calendar.MONTH);
        char month = this.convertMonth(monthValue);

        int dayValue = this.dateOfBirth.get(Calendar.DAY_OF_MONTH);
        String day = this.convertDay(dayValue);

        return firstPart + secondPart + yearString.substring(2,4) + month + day;
    }

    private String convert(String str) {
        String result = "";
        //step 1 uppercase
        str = str.toUpperCase();
        //step 2 transform str to Char[]
        char[] charArray = str.toCharArray();
        // step3 ciclo for
        for(int i=0; i < charArray.length; i++) {
            char letter = charArray[i];
            //char letter = str.charAt(i);
            if (!(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')) {
                result += letter;
            }
            if (result.length() == 3) {
                break;
            }
        }
        // step4
        switch (result.length()){
            case 2: result += 'X';break;
            case 1: result += "XX";break;
            case 0: result += "XXX";break;
        }
        return result;
    }

    private char convertMonth(int month) {
        return "ABCDEHLMPRST".charAt(month);
    }

    private String convertDay(int value){
        String valueInString = String.valueOf(value);
        if(valueInString.length() == 1){
            return "0"+valueInString;
        }
        return valueInString;
    }
}
