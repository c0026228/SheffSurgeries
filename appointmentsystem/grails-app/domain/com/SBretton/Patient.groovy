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
        address nullable:false, blank:false, unique: true
        residence nullable:false, blank:false
        patientDob nullable:false, blank:false
        patientID nullable:false, blank:false, unique: true
        dateregistered nullable:false, blank:false
        patientPhone nullable:false, blank:false, unique: true, size: 0..11
        //thepatient nullable:false, blank:false
    }
static hasMany = [doctors:Doctor, appointments:Appointment, prescriptions:Prescription, surgerys:Surgery]
static belongsTo = [Doctor, Surgery, Appointment, Prescription]
}