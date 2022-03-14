package com.credentials.service;

import com.credentials.model.Employee;

import java.util.Locale;
import java.util.Random;

import static com.credentials.model.Employee.companyName;

public class CredentialService {
    private String email,passowrd;

    private String generateEmailAddess(Employee employee , String department){
        return employee.getFirstname().toLowerCase() + employee.getSecondname().toLowerCase() + "@"+ department+ "." + companyName + ".com";
    }

    private  String generatePassword(){
        Random random = new Random();

        String password= "";
        for(int i=0;i<7;i++)
        {
            password += (char) random.nextInt(33,122);
        }
        return password;

    }

    public void showCredentials(Employee employee,String department){
        System.out.println("Dear "+employee.getFirstname()+" your generated credentials");
        System.out.println("Email "+this.generateEmailAddess(employee,department));
        System.out.println("password "+this.generatePassword());
    }
}
