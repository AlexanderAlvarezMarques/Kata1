package main;

import java.util.Date;

/**
 * @author Alexander Alvarez Marques
 */
public class Main {
   
    
    public static void main(String[] args) {
        Person person = new Person("Alexander", new Date(95,10,26));
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
