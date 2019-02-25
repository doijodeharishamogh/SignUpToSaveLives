/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Appointment.AppointmentDirectory;
import Business.Role.Role;
import Business.UserAccount.PatientAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class HospitalEnterprise extends Enterprise {

    private PatientAccountDirectory patientAccountDirectory;
    private AppointmentDirectory appointmentDirectory;
    
    public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
        patientAccountDirectory = new PatientAccountDirectory();
        appointmentDirectory = new AppointmentDirectory();
    }
    
    public PatientAccountDirectory getPatientAccountDirectory() {
        return patientAccountDirectory;
    }
    
    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         return null;
    }
    
    
}

