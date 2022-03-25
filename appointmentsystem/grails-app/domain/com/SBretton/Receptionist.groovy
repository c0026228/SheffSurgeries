package com.SBretton

class Receptionist {
    int receptionistID
    String recepName
    String recepEmail
    String username 
    String password 
    String recepPhone
        String toString(){
        return recepName
    } 



    static constraints = {
        recepName nullable:false, blank:false
        recepEmail nullable:false, blank:false, email:true, unique: true
        username nullable:false, blank:false, unique: true
        password nullable:false, blank:false
        recepPhone nullable:false, blank:false, unique: true, size: 0..11
        //thereceptionist nullable:false, blank:false
       
    }
static belongsTo = [surgery:Surgery]
}