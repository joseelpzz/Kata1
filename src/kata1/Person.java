package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public String getName() {
        return name;
    }
    
    public Calendar getBirthdate() {
        return birthdate;
    }

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (millisecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }

    private long millisecondsToYear(long milles) {
        return milles / MILISECONDS_PER_YEAR;
    }
}