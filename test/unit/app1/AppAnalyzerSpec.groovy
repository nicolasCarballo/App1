package app1

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.*
import App1.AppAnalyzer
import app1.appDomain
/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class AppAnalyzerSpec extends Specification {
	@Shared quotes = [
		new appDomain(author: "Peter Ledbrook",	content: "Time waits for no man"),
		new appDomain(author: "Glen Smith",	content: "Groovy solves all problems")
		]
	def "Total number of quotes"(){
		given: "An analyzer initialized with know quotes"
		def analyzer = new AppAnalyzer(quotes)
		
		when: "I ask for the quote count"
		def quoteCount = analyzer.quoteCount
		
		then: "The number of quotes in the test list is returned"
		quoteCount == 2
		}
	}
