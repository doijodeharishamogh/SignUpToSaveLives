/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author kiranhun
 */
public class PotentialDonorAccountDirectory {
    
    private ArrayList<DonorAccount> potentialDonorList;

    public ArrayList<DonorAccount> getPotentialDonorList() {
        return potentialDonorList;
    }

    public void setPotentialDonorList(ArrayList<DonorAccount> potentialDonorList) {
        this.potentialDonorList = potentialDonorList;
    }
    
    public PotentialDonorAccountDirectory(){
        potentialDonorList = new ArrayList<>();
    }
    
    public DonorAccount addPotentialDonor(){
        DonorAccount potentialDonor = new DonorAccount();
        potentialDonorList.add(potentialDonor);
        return potentialDonor;
    }
    
}
