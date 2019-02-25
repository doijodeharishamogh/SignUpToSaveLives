/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organ;

import java.util.ArrayList;

/**
 *
 * @author kiranhun
 */
public class OrganDirectory {
    private ArrayList<Organ> organList;
    
    public OrganDirectory(){
        organList = new ArrayList<>();
    }

    public ArrayList<Organ> getOrganList() {
        return organList;
    }

    public void setOrganList(ArrayList<Organ> organList) {
        this.organList = organList;
    }
    
    public void addOrgan(String organName){
        Organ organ = new Organ(organName);
        organList.add(organ);
        //return organ;
    }
    
}
