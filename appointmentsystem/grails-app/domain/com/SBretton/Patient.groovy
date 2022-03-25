package com.SBretton

class Patient {
    String patientName
    String patientAddress
    String patientResidence
    String username 
    String password
    Date patientDob
    int patientID
    Date dateregistered
    String patientPhone
        String toString(){
        return patientName
    } 



    static constraints = {
        patientName nullable:false, blank:false
        patientAddress nullable:false, blank:false, unique: true
        patientResidence nullable:false, blank:false
        username nullable:false, unique: true
        password nullable:false
        patientDob nullable:false, blank:false
        patientID nullable:false, blank:false, unique: true
        dateregistered nullable:false, blank:false
        patientPhone nullable:false, blank:false, unique: true, size: 0..11
        //thepatient nullable:false, blank:false
    }
static hasMany = [doctors:Doctor, appointments:Appointment, prescriptions:Prescription, surgerys:Surgery]
static belongsTo = [Doctor, Surgery, Appointment, Prescription]
}