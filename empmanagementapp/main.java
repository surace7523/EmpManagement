package com.ss.empmanagementapp;

import java.util.Scanner;

public class main {


     static boolean ordering = true;

     public static void menu(){

         System.out.println("******WELCOME TO THE EMPLOYEE MANAGEMENT APPLICATION **************:"
                 +"\n1. Add Employee"+"\n2. View Employee" +"\n3. Update  Employee List"+"\n4. Delete Employee" +"\n5. View all  Employee"+"\n6. EXIT");
     }

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);
         do{

             System.out.println("Pick and option");
             menu();
             int choice = sc.nextInt();
             switch (choice){


                 case 1:
                     System.out.println("add employee");
                     service.addEmployee();
                     break;
                 case 2:
                     System.out.println("View Employee");
                     service.viewEmployee();

                     break;

                 case 3:
                     System.out.println("Update  Employee List");
                     service.updateEmployee();
                     break;

                 case 4:
                     System.out.println("Delete Employee");
                     service.deleteEmployee();
                     break;

                 case 5:
                     System.out.println("View all  Employee");
                     service.viewAllEmployee();
                     break;

                 case 6:
                     System.out.println(" EXITING...");
                     System.exit(0);
                     break;

                 default:
                     System.out.println("Please enter valid option");


             }


         }while(ordering);

    }

}
