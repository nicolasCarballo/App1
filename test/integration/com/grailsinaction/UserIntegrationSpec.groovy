package com.grailsinaction



import spock.lang.*

/**
 *
 */
class UserIntegrationSpec extends Specification {
	def "Saving our first user to the database"(){
		given: "A brand new user"
		def joe = new User (loginId: 'joe', password: 'secret', homepage: 'www.mipagina.com')
		when: "the user is saved"
		joe.save()
		then: "it saved succesfully and can be found in the database"
		joe.errors.errorCount == 0
		joe.id != null
		User.get(joe.id).loginId == joe.loginId		
	}
	
	def "Updating a saved user changes its properties"() {
	
		given: "An existing user"
		def existingUser = new User(loginId: 'joe', password: 'secret', homepage: 'www.mipagina.com')
		existingUser.save(failOnError: true)
		
		when: "A property is changed"
		def foundUser = User.get(existingUser.id)
		foundUser.password = 'sesame'
		foundUser.save(failOnError: true)
		
		then: "The change is reflected in the database"
		User.get(existingUser.id).password == 'sesame'
	}
    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
}
