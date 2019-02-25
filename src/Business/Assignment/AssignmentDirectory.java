/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Assignment;

import Business.Organ.Organ;
import Business.UserAccount.DonorAccount;
import Business.UserAccount.PatientAccount;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AssignmentDirectory {
    private ArrayList<Assignment> assignmentList;
    
    public AssignmentDirectory(){
        assignmentList=new ArrayList();
    }
    public Assignment createAssignment(PatientAccount patient,DonorAccount donor,Organ organ){
        
        Assignment assignment= new Assignment(patient,donor,organ);
        assignmentList.add(assignment);
        return assignment;
    }

    public ArrayList<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(ArrayList<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }
    
}
