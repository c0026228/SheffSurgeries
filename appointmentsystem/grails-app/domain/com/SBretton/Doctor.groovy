package com.SBretton

class Doctor {
    int doctorID
    String fullName
    String qualifications
    String position
    String email
    String username 
    String password
    String doctorOffice
    String doctorPhone
    String bio
        String toString(){
        return fullName
    } 




    static constraints = {
        fullName nullable:false, blank:false
        qualifications nullable:false, blank:false
        position nullable:false, blank:false
        email nullable:false, blank:false, email: true, unique: true
        username nullable:false,  unique: true
        password nullable:false
        doctorOffice nullable:false, blank:false
        doctorPhone nullable:false, blank:false, unique: true, size: 0..11
        bio nullable:false, blank:false
        //thedoctor nullable:false, blank:false
       
    }
static hasMany = [prescriptions:Prescription, appointments:Appointment, nurses:Nurse, patients:Patient, surgery:Surgery]
static belongsTo = [Nurse, Surgery, Appointment]
}