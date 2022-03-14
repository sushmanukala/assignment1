package com.credentials.main;
import com.credentials.model.Employee;
import com.credentials.service.CredentialService;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employeedb = new ArrayList<>();
    static int arrayIndex =-1;

    public static void main(String[] args){
        System.out.print("enter firstname");
        String firstname = sc.nextLine();

        System.out.print("enter secondname");
        String secondname = sc.nextLine();
        employeedb.add(new Employee(firstname,secondname));
        arrayIndex++;

        showMenu();

    }

    static void showMenu() {
        System.out.print("Choose one department 1.technical , 2.admin , 3.human resource, 4.legal");
        int n = sc.nextInt();

        CredentialService cs = new CredentialService();
        switch(n)
        {
            case 1: cs.showCredentials(employeedb.get(arrayIndex),"tech");
                break;
            case 2: cs.showCredentials(employeedb.get(arrayIndex),"admin");
                break;
            case 3: cs.showCredentials(employeedb.get(arrayIndex),"hr");
                break;
            case 4: cs.showCredentials(employeedb.get(arrayIndex),"legal");
                break;
            default:
                System.out.print("invalid choice");

        }

        sc.close();


    }
}

