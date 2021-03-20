package com.company;/*
@USER: dench
@DATE: 20.03.21
@NAME: Person
@TIME: 13:10
*/

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String midtName;
    private String lastName;
    private String city;
    private String street;
    private String house;
    private String houseNumber;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String firstName, String midtName, String lastName,
                  String city, String street, String house,
                  String houseNumber, String phoneNumber,
                  LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.midtName = midtName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.house = house;
        this.houseNumber = houseNumber;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidtName() {
        return midtName;
    }

    public void setMidtName(String midtName) {
        this.midtName = midtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", midtName='" + midtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
