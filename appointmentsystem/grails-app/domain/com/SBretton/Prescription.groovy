package com.SBretton

class Prescription {
    int perscriptionID
    String pharmacyName
    String prescriptionNumber
    String medicine
    String totalCost
    Date dateIssued
    Boolean patientPaying


    

    static constraints = {
        pharmacyName nullable:false, blank:false
        prescriptionNumber nullable:false, blank:false
        medicine nullable:false, blank:false
        totalCost nullable:false, blank:false
        dateIssued nullable:false, blank:false
        patientPaying nullable:false, blank:false

        //theprescription nullable:false, blank:false
       
    }
 
}