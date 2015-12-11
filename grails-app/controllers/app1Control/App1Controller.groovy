package app1Control

//import app1.appDomain
class App1Controller {
	//static defaultAction = "home"
	
	def home () {
		render "<h1>Real Programmers do not eat Quiche</h1>"
	}
	/*def random() {
		def App1 = new appDomain (author: "Anonymous", content: "Real Programmers don't eat much Quiche")
			[ app1 : App1]
	}*/
	/*def random() {
		def allApp1 = appDomain.list()
		def randomApp1
		if (allApp1.size() > 0) {
			def randomIdx = new Random().nextInt(allApp1.size())
			randomApp1 = allApp1[randomIdx]
		} else {
		randomApp1 = new appDomain(author: "por defecto",
			content: "la lista esta vacia y entra al else")
		}
		[ app1 : randomApp1]
	}*/
		//static scaffold = true
		def appServService
		// other code omitted
		
		def random = {
			def randomApp = appServService.getRandomApp()
			[ app1 : randomApp ]
		}
		def ajaxRandom() {
			def randomApp = appServService.getRandomApp()
			render {
				q(randomApp.content)
				p(randomApp.author)
			}
		}
	
		
}
