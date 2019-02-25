/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Organ.OrganDirectory;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DonorAccount {
    private int id;
    private static int count = 500;
    private String firstName;
    private String lastName;    
    private int age;
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
    private boolean eligible;
    private boolean scheduled;
    private boolean checked;
    private boolean sentToUNOS = false;
    private boolean remoteDonor = false;
    private boolean deceased = false;
    private professionType ProfessionType;
    private organType OrganType;
    private OrganDirectory organList;

    public boolean isDeceased() {
        return deceased;
    }

    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }

    public boolean isRemoteDonor() {
        return remoteDonor;
    }

    public void setRemoteDonor(boolean remoteDonor) {
        this.remoteDonor = remoteDonor;
    }

    public boolean isSentToUNOS() {
        return sentToUNOS;
    }

    public void setSentToUNOS(boolean sentToUNOS) {
        this.sentToUNOS = sentToUNOS;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean Checked) {
        this.checked = Checked;
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public void setScheduled(boolean scheduled) {
        this.scheduled = scheduled;
    }
    
    public OrganDirectory getOrganList() {
        return organList;
    }

    public void setOrganList(OrganDirectory organList) {
        this.organList = organList;
    }
    
    
    public DonorAccount() {
        organList = new OrganDirectory();
        id = count;
        count++;
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
        IT("Information Technology"), Government("Government Job"), Military("Military Service"), Banking("banking Job"), Teaching("Teaching Job"), Marketing("Sales Job");
        
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

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }
    
    
    public boolean isStd() {
        return std;
    }

    public void setStd(boolean std) {
        this.std = std;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return String.valueOf(id);
    }
}
