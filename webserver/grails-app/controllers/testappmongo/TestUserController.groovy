package testappmongo

import grails.converters.JSON

class TestUserController {

    def testUserService

    def index() {

        def result
        try{
            result = testUserService.getUser(params)
            render result as JSON

        }catch(Exception e){

            def mapExcepction = [
                    message: e.getMessage()
            ]

            render mapExcepction as JSON
        }
    }
}
