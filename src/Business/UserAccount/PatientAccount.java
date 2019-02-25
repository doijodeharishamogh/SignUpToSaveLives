/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class PatientAccount {
    private int patientID;
    private String firstName;
    private String lastName;    
    private int age;
    private int severity;
    private double weight;
    private String gender;
    private String bloodType;
    private boolean diabetic;
    private boolean hypertension;
    private int numberOfPrivSurgery;
    private ArrayList<String> illness;
    private boolean doesSmoke;
    private boolean doesDrink;
    private boolean hasAsthama;
    private boolean epilepsy;
    private boolean heartdisease;
    private boolean stroke;
    private boolean std;
    private boolean hepatitis;
    private boolean HIV;
    private boolean organNeeded;
    private Date admittedDate;
    private Date operatedDate;
    private String operatedBy;
    private int receivedDonorID;
    private professionType ProfessionType;
    private organType OrganType;
    
    private static int count = 100;

    public PatientAccount() {
        this.patientID = count;
        count++;
        admittedDate = new Date();
        illness = new ArrayList<>();
    }
    
    public enum organType{
        Heart("Heart"), Kidney("Kidney"), Eye("Eyes"), Liver("Liver");
        
        private String value;
        
        private organType(String value){
            this.value=value;
        }
        
        public String getValue(){
            return value;
        }
        @Override
        public String toString(){
        return value;
    }           
    }
  
    public enum professionType{
        IT("Information Technology"), Government("Government"), Military("Military Service"), Agriculture("Agriculture");
        
        private String value;
        
        private professionType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }        
    }

    public Date getOperatedDate() {
        return operatedDate;
    }

    public void setOperatedDate(Date operatedDate) {
        this.operatedDate = operatedDate;
    }

    public String getOperatedBy() {
        return operatedBy;
    }

    public void setOperatedBy(String operatedBy) {
        this.operatedBy = operatedBy;
    }

    public int getReceivedDonorID() {
        return receivedDonorID;
    }

    public void setReceivedDonorID(int receivedDonorID) {
        this.receivedDonorID = receivedDonorID;
    }
    
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Date getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(Date admittedDate) {
        this.admittedDate = admittedDate;
    }
    
    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
    
    public organType getOrganType() {
        return OrganType;
    }

    public void setOrganType(organType OrganType) {
        this.OrganType = OrganType;
    }
    
    public professionType getProfessionType() {
        return ProfessionType;
    }

    public void setProfessionType(professionType ProfessionType) {
        this.ProfessionType = ProfessionType;
    }
    
    public boolean isOrganNeeded() {
        return organNeeded;
    }

    public void setOrganNeeded(boolean organNeeded) {
        this.organNeeded = organNeeded;
    }
    
    public boolean isStd() {
        return std;
    }

    public void setStd(boolean std) {
        this.std = std;
    }

    public boolean isHepatitis() {
        return hepatitis;
    }

    public void setHepatitis(boolean hepatitis) {
        this.hepatitis = hepatitis;
    }

    public boolean isHIV() {
        return HIV;
    }

    public void setHIV(boolean HIV) {
        this.HIV = HIV;
    }
    

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isDiabetic() {
        return diabetic;
    }

    public void setDiabetic(boolean diabetic) {
        this.diabetic = diabetic;
    }

    public boolean isHypertension() {
        return hypertension;
    }

    public void setHypertension(boolean hypertension) {
        this.hypertension = hypertension;
    }

    public int getNumberOfPrivSurgery() {
        return numberOfPrivSurgery;
    }

    public void setNumberOfPrivSurgery(int numberOfPrivSurgery) {
        this.numberOfPrivSurgery = numberOfPrivSurgery;
    }

    public ArrayList<String> getIllness() {
        return illness;
    }

    public void setIllness(ArrayList<String> illness) {
        this.illness = illness;
    }

    public boolean isDoesSmoke() {
        return doesSmoke;
    }

    public void setDoesSmoke(boolean doesSmoke) {
        this.doesSmoke = doesSmoke;
    }

    public boolean isDoesDrink() {
        return doesDrink;
    }

    public void setDoesDrink(boolean doesDrink) {
        this.doesDrink = doesDrink;
    }

    public boolean isHasAsthama() {
        return hasAsthama;
    }

    public void setHasAsthama(boolean hasAsthama) {
        this.hasAsthama = hasAsthama;
    }

    public boolean isEpilepsy() {
        return epilepsy;
    }

    public void setEpilepsy(boolean epilepsy) {
        this.epilepsy = epilepsy;
    }

    public boolean isHeartdisease() {
        return heartdisease;
    }

    public void setHeartdisease(boolean heartdisease) {
        this.heartdisease = heartdisease;
    }

    public boolean isStroke() {
        return stroke;
    }

    public void setStroke(boolean stroke) {
        this.stroke = stroke;
    }
    
    @Override
    public String toString(){
        return String.valueOf(patientID);
    }
}
