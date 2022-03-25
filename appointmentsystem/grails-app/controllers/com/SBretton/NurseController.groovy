package com.SBretton

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class NurseController {

    NurseService nurseService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond nurseService.list(params), model:[nurseCount: nurseService.count()]
    }

    def show(Long id) {
        respond nurseService.get(id)
    }

    def create() {
        respond new Nurse(params)
    }

    def save(Nurse nurse) {
        if (nurse == null) {
            notFound()
            return
        }

        try {
            nurseService.save(nurse)
        } catch (ValidationException e) {
            respond nurse.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nurse.label', default: 'Nurse'), nurse.id])
                redirect nurse
            }
            '*' { respond nurse, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond nurseService.get(id)
    }

    def update(Nurse nurse) {
        if (nurse == null) {
            notFound()
            return
        }

        try {
            nurseService.save(nurse)
        } catch (ValidationException e) {
            respond nurse.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'nurse.label', default: 'Nurse'), nurse.id])
                redirect nurse
            }
            '*'{ respond nurse, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        nurseService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'nurse.label', default: 'Nurse'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

   def login() {
 }

 def validate() {
def user = Nurse.findByUsername(params.username)
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
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nurse.label', default: 'Nurse'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
