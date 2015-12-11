package app1

import grails.test.mixin.TestFor
import spock.lang.Specification
//import app1.appDomain
/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(AppServService)
class AppServServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "static quote service always return quinche quote"() {
		when:
		println "estoy en el when"
		def staticApp = service.getStaticApp()
		//app staticApp = service.getStaticApp()
		//AppServService staticApp = service.getStaticApp()
		then:
		staticApp.author == "Anonymous"
		staticApp.content == "Real Programmers Don't eat much quicheQuiche"
    }
}
