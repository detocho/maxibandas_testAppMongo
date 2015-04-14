environments {
    development {
        grails {
            mongo {
                host = "localhost"
                databaseName = "mb_test"
            }
        }
    }
    test {
        grails {
            mongo {
                host = "localhost"
                databaseName = "mb_test"
            }
        }
    }
    production {
        grails {
            mongo {

                // replicaSet = []
                host = "localhost"
                username = ""
                password = ""
                databaseName = "mb_test"
            }
        }
    }
}