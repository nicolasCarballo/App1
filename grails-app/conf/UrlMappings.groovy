class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		"/test"(controller:"app1", parseRequest: true){
			action = [GET:"home", POST:"notSupported", PUT:"notSupported", DELETE:"notSupported"]
		}
		"/autor"(controller:"app1", parseRequest: true){
			action = [GET:"random", POST:"notSupported", PUT:"notSupported", DELETE:"notSupported"]
		}
		"/ajaxRandom"(controller:"app1", parseRequest: true){
			action = [GET:"ajaxRandom", POST:"notSupported", PUT:"notSupported", DELETE:"notSupported"]
		}
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
