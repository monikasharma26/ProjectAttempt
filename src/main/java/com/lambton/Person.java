package com.lambton;

import java.util.Date;

enum prefix {
    CUS,
    DRI
}


enum Gender {
    Male,
    Female,
    Other
}

abstract class Person {
    int personId;
    String firstName;
    String lastName;
    Date birthDate;
    Gender gender;
    String email;
    String address;
    String contactNumber;


    public void setData(int personId,
                        String firstName,
                        String lastName,
                        Date birthDate,
                        Gender gender,
                        String email,
                        String address,
                        String contactNumber) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;

    }


    public void printData() {


        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);

    }

    public abstract void finalExecution();
}
