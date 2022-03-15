package com.SBretton

class Receptionist {
    int receptionistID
    String recepName
    String recepEmail
    String recepUsername
    String receppassword
    String recepPhone



    static constraints = {
        recepname nullable:false, blank:false
        recepEmail nullable:false, blank:false, email:true
        recepUsername nullable:false, blank:false
        receppassword nullable:false, blank:false
        recepPhone nullable:false, blank:false
        //thereceptionist nullable:false, blank:false
       
    }
 
}