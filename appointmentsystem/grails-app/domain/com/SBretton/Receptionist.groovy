package com.SBretton

class Receptionist {
    int receptionistID
    String recepName
    String recepEmail
    String recepUsername
    String receppassword
    String recepPhone
        String toString(){
        return recepName
    } 



    static constraints = {
        recepName nullable:false, blank:false
        recepEmail nullable:false, blank:false, email:true, unique: true
        recepUsername nullable:false, blank:false, unique: true
        receppassword nullable:false, blank:false
        recepPhone nullable:false, blank:false, unique: true, size 0...11
        //thereceptionist nullable:false, blank:false
       
    }
static belongsTo = [surgery:Surgery]
}