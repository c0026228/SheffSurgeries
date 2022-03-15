package com.SBretton

class Patient {
    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    int patientID
    Date dateregistered
    String patientPhone



    static constraints = {
        patientName nullable:false, blank:false
        patientAddress nullable:false, blank:false
        patientResidence nullable:false, blank:false
        patientDob nullable:false, blank:false
        patientID nullable:false, blank:false
        dateregistered nullable:false, blank:false
        patientPhone nullable:false, blank:false
        //thepatient nullable:false, blank:false
    }

}