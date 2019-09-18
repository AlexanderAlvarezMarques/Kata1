package main;

import java.util.Date;

/**
 * @author Alexander Alvarez Marques
 * @version 18-sep-2019
 */
public class Person {
    
    private final String name;
    private final Date birthday;
    private static final double DAYS_PER_YEAR = 365.25;
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTS_PER_HOUR = 60;
    private static final int SECONDS_PER_MINUT = 60;
    private static final int MS_PER_SECOND = 1000;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return toYear(new Date().getTime() - birthday.getTime());
    }

    private int toYear(long ms) {
        return (int) (ms / milisecondsPerYear());
    }

    private double milisecondsPerYear() {
        return MS_PER_SECOND
                * SECONDS_PER_MINUT
                * MINUTS_PER_HOUR
                * HOURS_PER_DAY
                * DAYS_PER_YEAR;
    }
    
}
