/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaintegratedca2;

/**
 *
 * @author psavage
 */
public class Doctor {
    private String DoctorName;
    private String speciality;
    private boolean surgeon;
    private boolean onDuty;
    private String doctorDepartment;

    //Constructors for the Doctor Class
    public Doctor(String DoctorName, String speciality, boolean surgeon, boolean onDuty, String doctorDepartment) {
        this.DoctorName = DoctorName;
        this.speciality = speciality;
        this.surgeon = surgeon;
        this.onDuty = onDuty;
        this.doctorDepartment = doctorDepartment;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean isSurgeon() {
        return surgeon;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public String getDoctorDepartment() {
        return doctorDepartment;
    }
   
    
}

