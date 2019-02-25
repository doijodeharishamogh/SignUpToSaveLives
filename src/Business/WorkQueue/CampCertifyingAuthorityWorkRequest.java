/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Veena Iyer
 */
public class CampCertifyingAuthorityWorkRequest extends WorkRequest{
    
    private String campName;
    private String picture;
    private boolean certified;

    public String getCampName() {
        return campName;
    }

    public void setCampName(String campName) {
        this.campName = campName;
    }

    public CampCertifyingAuthorityWorkRequest(String picture){
        this.picture = picture;
    }
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }
    
    @Override
    public String toString(){
     return campName;  
    }
    
}
