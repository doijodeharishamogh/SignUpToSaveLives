/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.PatientAccount;

/**
 *
 * @author HP
 */
public class HosUNOSWorkRequest extends WorkRequest {
    private PatientAccount Patient;
    private boolean assigned;
    
    public HosUNOSWorkRequest(PatientAccount Patient){
        super();
        this.Patient=Patient;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public PatientAccount getPatient() {
        return Patient;
    }

    public void setPatient(PatientAccount Patient) {
        this.Patient = Patient;
    }
}
