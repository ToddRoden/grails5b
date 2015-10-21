package edu.mnscu.acct



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DocLinkEntityController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DocLinkEntity.list(params), model:[docLinkEntityInstanceCount: DocLinkEntity.count()]
    }

    def show(DocLinkEntity docLinkEntityInstance) {
        respond docLinkEntityInstance
    }

    def create() {
        respond new DocLinkEntity(params)
    }

    @Transactional
    def save(DocLinkEntity docLinkEntityInstance) {
        if (docLinkEntityInstance == null) {
            notFound()
            return
        }

        if (docLinkEntityInstance.hasErrors()) {
            respond docLinkEntityInstance.errors, view:'create'
            return
        }

        docLinkEntityInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'docLinkEntity.label', default: 'DocLinkEntity'), docLinkEntityInstance.id])
                redirect docLinkEntityInstance
            }
            '*' { respond docLinkEntityInstance, [status: CREATED] }
        }
    }

    def edit(DocLinkEntity docLinkEntityInstance) {
        respond docLinkEntityInstance
    }

    @Transactional
    def update(DocLinkEntity docLinkEntityInstance) {
        if (docLinkEntityInstance == null) {
            notFound()
            return
        }

        if (docLinkEntityInstance.hasErrors()) {
            respond docLinkEntityInstance.errors, view:'edit'
            return
        }

        docLinkEntityInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DocLinkEntity.label', default: 'DocLinkEntity'), docLinkEntityInstance.id])
                redirect docLinkEntityInstance
            }
            '*'{ respond docLinkEntityInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DocLinkEntity docLinkEntityInstance) {

        if (docLinkEntityInstance == null) {
            notFound()
            return
        }

        docLinkEntityInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DocLinkEntity.label', default: 'DocLinkEntity'), docLinkEntityInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'docLinkEntity.label', default: 'DocLinkEntity'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
