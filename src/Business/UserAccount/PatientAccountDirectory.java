/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author Veena Iyer
 */
public class PatientAccountDirectory {
  
    private ArrayList<PatientAccount> patientList;
    
    public PatientAccountDirectory(){
        patientList = new ArrayList<>();
    }

    public ArrayList<PatientAccount> getPatientList() {
        return patientList;
    }
    
    public PatientAccount createPatientAccount(String firstName, String lastName, 
            int age,String bloodType,double weight,String gender,boolean diabetic,
            boolean hypertension,int prevSurgeries,boolean doesSmoke,boolean doesDrink,
            boolean hasAsthama,boolean epilepsy,boolean heartdisease,boolean stroke,
            boolean std,boolean hepatitis,boolean HIV,PatientAccount.professionType type){
        
        PatientAccount patientAccount = new PatientAccount();
        patientAccount.setFirstName(firstName);
        patientAccount.setLastName(lastName);
        patientAccount.setFirstName(firstName);
        patientAccount.setAge(age);
        patientAccount.setBloodType(bloodType);
        patientAccount.setWeight(weight);
        patientAccount.setGender(gender);
        patientAccount.setDiabetic(diabetic);
        patientAccount.setHypertension(hypertension);
        patientAccount.setNumberOfPrivSurgery(prevSurgeries);
        patientAccount.setDoesSmoke(doesSmoke);
        patientAccount.setDoesDrink(doesDrink);
        patientAccount.setHasAsthama(hasAsthama);
        patientAccount.setEpilepsy(epilepsy);
        patientAccount.setHeartdisease(heartdisease);
        patientAccount.setStroke(stroke);
        patientAccount.setStd(std);
        patientAccount.setHepatitis(hepatitis);
        patientAccount.setHIV(HIV);
        patientAccount.setProfessionType(type);
        
        patientList.add(patientAccount);
        
        return patientAccount;
    }
}
