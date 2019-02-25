/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.DonorAccount;

/**
 *
 * @author HP
 */
public class CampUNOSWorkRequest extends WorkRequest {
    private DonorAccount donor;
    
    public CampUNOSWorkRequest(DonorAccount donor)
    {
        super();
        this.donor=donor;
    }

    public DonorAccount getDonor() {
        return donor;
    }

    public void setDonor(DonorAccount donor) {
        this.donor = donor;
    }
}
