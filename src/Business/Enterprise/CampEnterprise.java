/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Appointment.AppointmentDirectory;
import Business.Role.Role;
import Business.UserAccount.PotentialDonorAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CampEnterprise extends Enterprise {
    
    private PotentialDonorAccountDirectory potentialDonorAccountDirectory;
    private AppointmentDirectory appointmentDirectory;
    public CampEnterprise(String name){
        super(name,EnterpriseType.Camp);
        potentialDonorAccountDirectory = new PotentialDonorAccountDirectory();
        appointmentDirectory = new AppointmentDirectory();
    }
    public PotentialDonorAccountDirectory getPotentialDonorAccountDirectory() {
        return potentialDonorAccountDirectory;
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
