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
        
               System.out.println("Add new Patient");
               
               System.out.println("Patient Name: ");
               String pName = sc.nextLine();
               
               System.out.println("Please Enter patient complaint: ");
               System.out.println("1. Cardiology");
               System.out.println("2. Rheumatology");
               System.out.println("3. ENT");
               System.out.println("4. Ophthalmology");
               System.out.println("5. Occupational Therapy");
               System.out.println("6. Radiology");
               System.out.println("7. Oncology");
               System.out.println("8. OB/GYN");
               System.out.println("9. Emergency");
               String pComp = sc.nextLine();
               
               Patient newpatient = new Patient(pName,pComp);
               
               System.out.println("Patient Details " );
               System.out.println("New patient is: " + newpatient.getPatientName());
               System.out.println("PatientID: " + newpatient.getPatientId());
               System.out.println("Needs Medication: " + newpatient.isNeedsMedication());
               
               
               
            
        }
        
       
    }
    
