package com.company;/*
@USER: dench
@DATE: 20.03.21
@NAME: Person
@TIME: 13:10
*/

import java.time.LocalDate;

public class Person implements IPerson {
    private String firstName;
    private String midName;
    private String lastName;
    private String city;
    private String street;
    private String house;
    private String houseNumber;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String firstName, String midName, String lastName,
                  String city, String street, String house,
                  String houseNumber, String phoneNumber,
                  LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.midName = midName;
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

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
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
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public String toXML() {
        String xml ="<Person>" +"\n+" +
                "<firstName>" + this.getFirstName() + "</firstName>" +"\n"+
                "<midName>" + this.getMidName() + "</midName>" + "\n"+
                "<lastName>" + this.getLastName() + "</lastName>" + "\n" +
                "<city>" + this.getCity() + "</city>" + "\n" +
                "<street>" + this.getStreet() + "</street>" + "\n" +
                "<house>"  + this.getHouse() + "</house>" + "\n" +
                "<houseNumber>" + this.getHouseNumber() + "</houseNumber>" + "\n"+
                "<phoneNumber>" + this.getPhoneNumber() + "</phoneNumber>" + "\n" +
                "<dateOfBirth>" + this.getDateOfBirth() + "</dateOfBirth>"+ "\n"+
                "</Person>";
        return xml;
    }

    @Override
    public String toJSON() {
        String json = "Person{" +
                "\"firstName\":" + this.getFirstName() + ","+
                "\"midName\":" + this.getMidName() + "," +
                "\"lastName\"" + this.getLastName() + "," +
                "\"city\"" + this.getCity() + "," +
                "\"street\"" + this.getStreet() + "," +
                "\"house\"" + this.getHouse() + "," +
                "\"houseNumber\"" + this.getHouseNumber() + "," +
                "\"phoneNumber\"" + this.getPhoneNumber() + "," +
                "\"dateOfBirth\"" + this.getDateOfBirth() + "}";
        return json;
    }
}
