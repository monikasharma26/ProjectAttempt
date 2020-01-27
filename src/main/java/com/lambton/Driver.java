package com.lambton;

import java.util.Date;

public class Driver extends Person {
    String licenseNumber;
    String licenseExpiry;

    public String prefixPlacing() {
        String str = new String(String.valueOf(prefix.DRI));
        str = str.concat(String.valueOf(personId));

        return str;
    }

    //    @Override
    public void setData(int personId, String licenseNumber, String licenseExpiry, String firstName, String lastName, Date birthDate, Gender gender, String email, String address, String contactNumber) {
        super.setData(personId, firstName, lastName, birthDate, gender, email, address, contactNumber);
        this.licenseNumber = licenseNumber;
        this.licenseExpiry = licenseExpiry;

    }

    @Override
    public void finalExecution() {
        System.out.println("Person's ID: " + prefixPlacing());
        System.out.println("License Number: " + licenseNumber);
        System.out.println("License Expiry: " + licenseExpiry);
        printData();
        System.out.println();

    }
}
