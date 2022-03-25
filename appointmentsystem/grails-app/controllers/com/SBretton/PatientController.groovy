package com.SBretton

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PatientController {

    PatientService patientService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond patientService.list(params), model:[patientCount: patientService.count()]
    }

    def show(Long id) {
        respond patientService.get(id)
    }

    def create() {
        respond new Patient(params)
    }

    def save(Patient patient) {
        if (patient == null) {
            notFound()
            return
        }

        try {
            patientService.save(patient)
        } catch (ValidationException e) {
            respond patient.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'patient.label', default: 'Patient'), patient.id])
                redirect patient
            }
            '*' { respond patient, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond patientService.get(id)
    }

    def update(Patient patient) {
        if (patient == null) {
            notFound()
            return
        }

        try {
            patientService.save(patient)
        } catch (ValidationException e) {
            respond patient.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'patient.label', default: 'Patient'), patient.id])
                redirect patient
            }
            '*'{ respond patient, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        patientService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'patient.label', default: 'Patient'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }



   def login() {
 }

 def validate() {
def user = Patient.findByUsername(params.username)
if (user && user.password == params.password){
session.user = user
render view:'home'
}

else{
flash.message = "Invalid username and password."
render view:'login'
}
}
def logout = {
 session.user = null
 redirect(uri:'/')
 }
    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'patient.label', default: 'Patient'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
