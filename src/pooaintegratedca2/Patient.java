/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaintegratedca2;

/**
 *
 * @author psavage
 */
 class Patient PatientInterface {
    private String patientName;
    private int patientId;
    private boolean isInpatient;
    private boolean needsMedication;
    private boolean needsSurgery;
    private static int nextPatientId = 1;
    private String department;
    private String complaints;

   
    //Create a constructor for new Patient. Inpatient status is set to False, Patient ID is set to the next partient ID number and we iterate the nextPatientId
   
    public Patient(String patientName, String complaints) {
        this.patientName = patientName;
        this.needsMedication = false;
        this.needsSurgery = false;
        this.complaints = complaints;
        this.patientId = nextPatientId;
        this.isInpatient = false;
        nextPatientId++;
        
    }

    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

  

    
    
    
    
 

}


