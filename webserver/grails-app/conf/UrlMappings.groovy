class UrlMappings {

	static mappings = {

        "/$userId?"{
            controller = "TestUser"
            action = [GET:'index']
        }

        /*
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }*/

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
