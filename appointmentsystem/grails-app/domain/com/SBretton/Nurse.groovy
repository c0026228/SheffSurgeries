package com.SBretton

class Nurse {
    int nurseID
    String fullName
    String qualifications
    String nurseEmail
    String username 
    String password
    String nurseOffice
    String nursePhone
    String bio
        String toString(){
        return fullName
    } 




    static constraints = {
        fullName nullable:false, blank:false
        qualifications nullable:false, blank:false
        nurseEmail nullable:false, blank:false, email: true, unique: true
        username nullable:false, unique: true
        password nullable:false
        nurseOffice nullable:false, blank:false
        nursePhone nullable:false, blank:false, unique: true, size: 0..11
        bio nullable:false, blank:false
        //thenurse nullable:false, blank:false
    }
static hasMany = [doctors:Doctor, surgery:Surgery]
static belongsTo = [Doctor, Surgery]

}