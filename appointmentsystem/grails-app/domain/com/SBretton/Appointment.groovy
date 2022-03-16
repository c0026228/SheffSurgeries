package com.SBretton

class Appointment {
    int appointmentID
    Date appDate
    String appTime
    String duration
    String roomNumber
    String toString(){
        return appDate
    } 



    static constraints = {
        appDate nullable:false, blank:false
        appTime nullable:false, blank:false
        duration nullable:false, blank:false
        roomNumber nullable:false, blank:false
        //theappointment nullable:false, blank:false
    }

static hasMany = [doctor:Doctor, patient:Patient, surgery:Surgery]
}