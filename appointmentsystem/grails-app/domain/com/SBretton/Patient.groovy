package com.SBretton

class Patient {
    String name
    String address
    String residence
    Date patientDob
    int patientID
    Date dateregistered
    String patientPhone
        String toString(){
        return name
    } 



    static constraints = {
        name nullable:false, blank:false
        address nullable:false, blank:false
        residence nullable:false, blank:false
        patientDob nullable:false, blank:false
        patientID nullable:false, blank:false
        dateregistered nullable:false, blank:false
        patientPhone nullable:false, blank:false
        //thepatient nullable:false, blank:false
    }
static hasMany = [doctor:Doctor, surgery:Surgery, prescription:Prescription, appointment:Appointment]
static belongsTo = [doctor:Doctor,surgery:Surgery, appointment:Appointment]
}