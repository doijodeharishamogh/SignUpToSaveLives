/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organ;

/**
 *
 * @author kiranhun
 */
public class Organ {
    private static int count = 1000;
    private int organID;
    private String organName;
    
    public Organ(String organName){
        organID = count;
        this.organName = organName;
        count++;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public int getOrganID() {
        return organID;
    }
    
    @Override
    public String toString(){
        return String.valueOf(organID);
    }
    
}
