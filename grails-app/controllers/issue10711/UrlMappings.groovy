package issue10711

class UrlMappings {

    static mappings = {

        '/tickets'(resources: 'ticket') {
            collection {
                "/history/${id}"(controller: 'ticket', action:'history', method: 'GET')
            }
        }

//        "/$controller/$action?/$id?(.$format)?"{
//            constraints {
//                // apply constraints here
//            }
//        }
//
//        "/"(view:"/index")
//        "500"(view:'/error')
//        "404"(view:'/notFound')
    }
}
