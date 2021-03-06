package com.SBretton

class Nurse {
    int nurseID
    String fullName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone
    String bio
        String toString(){
        return fullName
    } 




    static constraints = {
        fullName nullable:false, blank:false
        qualifications nullable:false, blank:false
        nurseEmail nullable:false, blank:false, email: true
        nurseOffice nullable:false, blank:false
        nursePhone nullable:false, blank:false
        bio nullable:false, blank:false
        //thenurse nullable:false, blank:false
    }
static hasMany = [doctor:Doctor, surgery:Surgery]
static belongsTo = [doctor:Doctor]
}