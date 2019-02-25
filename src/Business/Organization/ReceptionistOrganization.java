/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReceptionistRole;
import Business.Role.Role;
import Business.UserAccount.PotentialDonorAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ReceptionistOrganization extends Organization {
    
    private PotentialDonorAccountDirectory potentialDonorAccountDirectory;
    
    public ReceptionistOrganization() {
        super(Organization.Type.Receptionist.getValue());
        potentialDonorAccountDirectory = new PotentialDonorAccountDirectory();
    }

    public PotentialDonorAccountDirectory getPotentialDonorAccountDirectory() {
        return potentialDonorAccountDirectory;
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceptionistRole());
        return roles;
    } 
}

