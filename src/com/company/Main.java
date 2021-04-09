package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, Month.APRIL,12);
        System.out.println(date.getDayOfWeek());
        LocalDate today =LocalDate.now();
        System.out.println(today.plusDays(1000).getDayOfWeek());
        LocalDate dayPro = LocalDate.of(2021, Month.JANUARY,1);
        System.out.println(dayPro.plusDays(255));
        System.out.println(dayPro.plusDays(255).getDayOfWeek());

        Person denys = new Person();
        denys.setFirstName("Denys");
        denys.setMidName("Balan");
        denys.setLastName("Yurievich");
        denys.setCity("Chernivtsi");
        denys.setStreet("st. Ukranian");
        denys.setHouseNumber("23");
        denys.setPhoneNumber("08800355535");
        denys.setDateOfBirth(LocalDate.of(2006, Month.JANUARY, 7));
        System.out.println(denys.toString());
        System.out.println();
        System.out.println(denys.toJSON());
        System.out.println();
        System.out.println(denys.toXML());
    }
}
