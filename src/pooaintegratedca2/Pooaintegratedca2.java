/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaintegratedca2;

import java.util.Scanner;

/**
 *
 * @author psavage
 */
public class Pooaintegratedca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PLEASE SELECT AN OPTION");
        System.out.println("1. Add New Patient");
        System.out.println("2. View Existing Patient");
        
        int menu1 = sc.nextInt();
        sc.nextLine();
        
        switch (menu1){
            case 1:
               System.out.println("Add new Patient");
               
               System.out.println("Patient Name: ");
               String pName = sc.nextLine();
               
               System.out.println("Please Enter patient complaint: ");
               System.out.println("1. Heart");
               System.out.println("2. Arthritis");
               System.out.println("3. Head and Neck Issue");
               System.out.println("4. Eye Problem");
               System.out.println("5. Disability");
               System.out.println("6. XRay");
               System.out.println("7. Cancer");
               System.out.println("8. Pregnant");
               System.out.println("9. Emergency");
               String pComp = sc.nextLine();
               
               System.out.println("Does Patient need Medication: ");
               boolean pMed = sc.nextBoolean();
               System.out.println("Does Patient need Surgery: ");
               boolean pSurg = sc.nextBoolean();
               Patient newpatient = new Patient(pName,pMed,pSurg,pComp);
               System.out.println("New patient is: " + newpatient.getPatientName());
               
               break;
               
            case 2: 
               System.out.println("View Existing Patient");
               System.out.println("Please enter Patient Name: ");
               break;
        }
    
        
    }
    
}