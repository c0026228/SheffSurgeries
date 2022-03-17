package com.SBretton

class Prescription {
    int perscriptionID
    String pharmacyName
    String prescriptionNumber
    String medicine
    String totalCost
    Date dateIssued
    Boolean patientPaying
    String toString(){
        return perscriptionID
    } 

    

    static constraints = {
        pharmacyName nullable:false, blank:false
        prescriptionNumber nullable:false, blank:false, unique: true
        medicine nullable:false, blank:false
        totalCost nullable:false, blank:false
        dateIssued nullable:false, blank:false
        patientPaying nullable:false, blank:false

        //theprescription nullable:false, blank:false
       
    }
 static hasMany = [doctors:Doctor, patients:Patient]
static belongsTo = [Doctor, Patient]
}