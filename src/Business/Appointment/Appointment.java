/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import java.util.Date;

/**
 *
 * @author kiranhun
 */
public class Appointment {
    private String docName;
    private int docID;
    private int patientID;
    private String donorFirstName;
    private String donorLastName;
    private int donorID;
    private Date date;
    private boolean slot10to11;
    private boolean slot11to12;
    private boolean slot12to01;

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public String getDonorFirstName() {
        return donorFirstName;
    }

    public void setDonorFirstName(String donorFirstName) {
        this.donorFirstName = donorFirstName;
    }

    public String getDonorLastName() {
        return donorLastName;
    }

    public void setDonorLastName(String donorLastName) {
        this.donorLastName = donorLastName;
    }



    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSlot10to11() {
        return slot10to11;
    }

    public void setSlot10to11(boolean slot10to11) {
        this.slot10to11 = slot10to11;
    }

    public boolean isSlot11to12() {
        return slot11to12;
    }

    public void setSlot11to12(boolean slot11to12) {
        this.slot11to12 = slot11to12;
    }

    public boolean isSlot12to01() {
        return slot12to01;
    }

    public void setSlot12to01(boolean slot12to01) {
        this.slot12to01 = slot12to01;
    }
    
    @Override
    public String toString(){
        return String.valueOf(donorID);
    }
    
    
}
