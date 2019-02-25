/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private int severity;
    private int PatientID;
    private int DonorID;

    public int getDonorID() {
        return DonorID;
    }

    public void setDonorID(int DonorID) {
        this.DonorID = DonorID;
    }
    
    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }
    public int getSeverity(){
        return severity;
    }
    
    public void setSeverity(int severity){
        this.severity = severity;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
