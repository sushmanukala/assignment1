package com.credentials.model;

public class Employee {
    private String firstname, secondname;

    public static final String companyName = "amazon";

    public Employee(String firstname, String secondname) {

        this.firstname=firstname;
        this.secondname=secondname;

    }

    public String getFirstname(){
        return firstname;

    }

    public void setFirstname(String firstname)
    {
        this.firstname=firstname;
    }
    public String getSecondname(){
        return secondname;
    }
}
