package com.SBretton

class Surgery {
    int surgeryID
    String name
    String address
    String postcode
    String telephone
    String numberOfPatients
    String description
    String openingTime
    String registeringnewpatients
        String toString(){
        return name
    } 




    static constraints = {
        name nullable:false, blank:false
        address nullable:false, blank:false
        postcode nullable:false, blank:false
        telephone nullable:false, blank:false, unique: true, size: 0..11
        numberOfPatients nullable:false, blank:false
        description nullable:false, blank:false
        openingTime nullable:false, blank:false
        registeringnewpatients nullable:false, blank:false
        //thesurgery nullable:false, blank:false
       
    }
static hasMany = [doctors:Doctor, receptionists:Receptionist, patients:Patient, appointments:Appointment, nurses:Nurse]

}