package com.youtap.test.type;

@lombok.Data
public class UserInterface {
    private Long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}



@lombok.Data
 class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}



@lombok.Data
 class Geo {
    private String lat;
    private String lng;
}



@lombok.Data
   class Company {
    private String name;
    private String catchPhrase;
    private String bs;
}

