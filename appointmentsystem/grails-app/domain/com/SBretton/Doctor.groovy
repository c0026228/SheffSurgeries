package com.SBretton

class Doctor {
    int doctorID
    String fullName
    String qualifications
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio




    static constraints = {
        fullName nullable:false, blank:false
        qualifications nullable:false, blank:false
        position nullable:false, blank:false
        doctorEmail nullable:false, blank:false, email: true
        password nullable:false, blank:false
        doctorOffice nullable:false, blank:false
        doctorPhone nullable:false, blank:false
        bio nullable:false, blank:false
        //thedoctor nullable:false, blank:false
       
    }

}