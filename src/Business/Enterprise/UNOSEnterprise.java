/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class UNOSEnterprise extends Enterprise{
    private WorkQueue HosUNOSworkQueue;
    private WorkQueue CampUNOSworkQueue;
    private WorkQueue campCertifyingWorkQueue;
    
    public UNOSEnterprise(String name){
        super(name,EnterpriseType.UNOS);
        HosUNOSworkQueue=new WorkQueue();
        CampUNOSworkQueue=new WorkQueue();
        campCertifyingWorkQueue = new WorkQueue();
    }

    public WorkQueue getCampCertifyingWorkQueue() {
        return campCertifyingWorkQueue;
    }

    public void setCampCertifyingWorkQueue(WorkQueue campCertifyingWorkQueue) {
        this.campCertifyingWorkQueue = campCertifyingWorkQueue;
    }

    public WorkQueue getHosUNOSworkQueue() {
        return HosUNOSworkQueue;
    }

    public void setHosUNOSworkQueue(WorkQueue HosUNOSworkQueue) {
        this.HosUNOSworkQueue = HosUNOSworkQueue;
    }

    public WorkQueue getCampUNOSworkQueue() {
        return CampUNOSworkQueue;
    }

    public void setCampUNOSworkQueue(WorkQueue CampUNOSworkQueue) {
        this.CampUNOSworkQueue = CampUNOSworkQueue;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
