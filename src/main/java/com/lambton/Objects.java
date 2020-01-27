package com.lambton;

import java.time.LocalDateTime;
import java.util.Date;

public class Objects {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setData(777, "Anmol", "Singh",
                new Date(1997, 11, 15, 12, 00, 00),
                Gender.Male, "me@me.com", "This is my Place",
                "9988421530");
        c1.finalExecution();
        Customer c2 = new Customer();
        c2.setData(789, "Ankesh", "Sharma",
                new Date(2000, 11, 11, 15, 11, 12),
                Gender.Female, "a.sharma@sharmaji.com", "Australia",
                "98457451");
        c2.finalExecution();

        Driver d1 = new Driver();
        d1.setData(125, "GHTY125", "2022", "Ishan", "Tageja",
                new Date(1997, 02, 12, 21, 22, 05),
                Gender.Male, "Ishan@tagejasahib.com", "Brampton",
                "9854528454");
        d1.finalExecution();
    }
}
