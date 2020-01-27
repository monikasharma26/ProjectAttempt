package com.lambton;

import java.time.LocalDateTime;
import java.util.Date;


public class Customer extends Person {

    LocalDateTime registrationDate;

    public String prefixPlacing() {
        String str = new String(String.valueOf(prefix.CUS));
        str = str.concat(String.valueOf(personId));

        return str;
    }

    @Override
    public void finalExecution() {
        System.out.println("Person's ID: " + prefixPlacing());
        printData();
        System.out.println("Registration Date: " + registrationDate.now());
        System.out.println();
    }
}
