package com.example.powelrecyclerview;

public class person {
    String firstname, lastname, age, imageView;

    public person(String firstname, String lastname, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    person(){}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
