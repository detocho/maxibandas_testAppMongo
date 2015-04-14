package testappmongo

import grails.transaction.Transactional


@Transactional
class TestUserService {

    def getUser(def params){

        def userResult = TestUser.findById(params.userId)
        userResult

    }
}
