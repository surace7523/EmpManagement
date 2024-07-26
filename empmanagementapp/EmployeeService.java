package com.ss.empmanagementapp;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    Scanner sc = new Scanner(System.in);

    int id;
    boolean found = false;
    String name;
    double salary;
    int age;
    String designation;
    String department;



    HashSet<Employee> empset = new HashSet<Employee>();
    Employee emp1 = new Employee(101, "sam", 25, "IT", "Developer", 25000);
    Employee emp2 = new Employee(102, "Ram", 25, "IT", "Developer", 20000);
    Employee emp3 = new Employee(103, "Jam", 27, "IT", "Developer", 28000);
    Employee emp4 = new Employee(104, "Kam", 28, "IT", "Developer", 70000);
    Employee emp5 = new Employee(104, "Dham", 29, "IT", "Developer", 905000);


    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);


    }


    //View all employee
    public void viewAllEmployee() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }

    //view employee based on their id

    public void viewEmployee() {
        boolean found = false;
        System.out.println("Enter the employee id: ");
        id = sc.nextInt();
        for (Employee emp : empset) {

            if (id == emp.getId()) {
                System.out.println(emp);
                found = true;
            }

        }

        if (!found) {
            System.out.println("employee with this id is not present");
        }
    }


    //update employee

    public void updateEmployee() {

        System.out.println("Enter the employee id: ");
        id = sc.nextInt();
        boolean found = false;
        for (Employee emp : empset) {

            if (id == emp.getId()) {
                System.out.println("Enter Name : ");
                name = sc.next();
                System.out.println("Enter Salary : ");
                salary = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("upadted details of employee are");
                System.out.println(emp);
                found = true;
            }

        }

        if (!found) {
            System.out.println("employee is not present");
        } else {
            System.out.println("Employee details updated successfully!!!!!!!!!!!");
        }
    }

    //delete from the list

    public void deleteEmployee() {

        boolean found = false;
        System.out.println("Enter the employee id to delete: ");
        id = sc.nextInt();
        Employee empTodel=null;
        for (Employee emp : empset) {

            if (id == emp.getId()) {

                empTodel = emp;
                System.out.println(empTodel+" will be deleted as requested");

                found = true;
            }

        }

        if (!found) {
            System.out.println("employee with this id is not present");
        }
        else{
            empset.remove(empTodel);
            System.out.println(empTodel+" successfully deleted as requested");
        }

    }


    //adding employees

    public void addEmployee(){
        System.out.println("Enter id: ");
         id= sc.nextInt();
        System.out.println("Enter Name: ");
         name= sc.next();
        System.out.println("Enter Age: ");
        age= sc.nextInt();
        System.out.println("Enter Salary: ");
         salary = sc.nextDouble();
        System.out.println("Enter designation: ");
        designation= sc.next();
        System.out.println("Enter department: ");
        department= sc.next();

        Employee emp = new Employee(id, name,age,designation,department,salary);
        empset.add(emp);

        System.out.println("Employee added successfully");
        System.out.println(emp);

    }

}
