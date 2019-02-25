/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import java.util.ArrayList;

/**
 *
 * @author kiranhun
 */
public class AppointmentDirectory {
    
    private ArrayList<Appointment> appointmentList;
    
    public AppointmentDirectory(){
        appointmentList = new ArrayList<>();
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
    
    public Appointment addAppointment(){
        Appointment appointment = new Appointment();
        appointmentList.add(appointment);
        return appointment;
    }
    
}
