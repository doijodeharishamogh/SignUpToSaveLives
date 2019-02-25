/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Assignment;

import Business.Organ.Organ;
import Business.UserAccount.DonorAccount;
import Business.UserAccount.PatientAccount;

/**
 *
 * @author HP
 */
public class Assignment {
    
    private PatientAccount patient;
    private DonorAccount donor;
    private Organ organ;
    public Assignment(PatientAccount patient,DonorAccount donor,Organ organ){
        this.organ=organ;
        this.patient=patient;
        this.donor=donor;
    }

    public PatientAccount getPatient() {
        return patient;
    }

    public void setPatient(PatientAccount patient) {
        this.patient = patient;
    }

    public DonorAccount getDonor() {
        return donor;
    }

    public void setDonor(DonorAccount donor) {
        this.donor = donor;
    }

    public Organ getOrgan() {
        return organ;
    }

    public void setOrgan(Organ organ) {
        this.organ = organ;
    }
}
