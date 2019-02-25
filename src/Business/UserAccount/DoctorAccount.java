/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DoctorAccount {
    public ArrayList<PatientAccount> patientList;

    public ArrayList<PatientAccount> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<PatientAccount> patientList) {
        this.patientList = patientList;
    }
}
