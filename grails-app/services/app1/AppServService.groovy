package app1

import grails.transaction.Transactional
import app1.appDomain
@Transactional
class AppServService {

	def getStaticApp() {
		println "Estoy en el metodo"
		return new appDomain(author: "Anonymous", content: "Real Programmers Don't eat much quicheQuiche")
	}
	def getRandomApp() {
		def allAppDomain = appDomain.list()
		def randomAppDomain
		
		if (allAppDomain.size() > 0) {
			def randomIdx = new Random().nextInt(allAppDomain.size())
			randomAppDomain = allAppDomain[randomIdx]
		} else {
			randomAppDomain = getStaticApp()
		}
		return randomAppDomain
	}
    //def serviceMethod() {    }
}