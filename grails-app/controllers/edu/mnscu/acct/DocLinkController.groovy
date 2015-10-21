package edu.mnscu.acct



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DocLinkController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DocLink.list(params), model:[docLinkInstanceCount: DocLink.count()]
    }

    def show(DocLink docLinkInstance) {
        respond docLinkInstance
    }

    def create() {
        respond new DocLink(params)
    }

    @Transactional
    def save(DocLink docLinkInstance) {
        if (docLinkInstance == null) {
            notFound()
            return
        }

        if (docLinkInstance.hasErrors()) {
            respond docLinkInstance.errors, view:'create'
            return
        }

        docLinkInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'docLink.label', default: 'DocLink'), docLinkInstance.id])
                redirect docLinkInstance
            }
            '*' { respond docLinkInstance, [status: CREATED] }
        }
    }

    def edit(DocLink docLinkInstance) {
        respond docLinkInstance
    }

    @Transactional
    def update(DocLink docLinkInstance) {
        if (docLinkInstance == null) {
            notFound()
            return
        }

        if (docLinkInstance.hasErrors()) {
            respond docLinkInstance.errors, view:'edit'
            return
        }

        docLinkInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DocLink.label', default: 'DocLink'), docLinkInstance.id])
                redirect docLinkInstance
            }
            '*'{ respond docLinkInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DocLink docLinkInstance) {

        if (docLinkInstance == null) {
            notFound()
            return
        }

        docLinkInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DocLink.label', default: 'DocLink'), docLinkInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'docLink.label', default: 'DocLink'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
