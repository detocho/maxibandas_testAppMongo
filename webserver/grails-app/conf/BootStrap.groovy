import testappmongo.TestUser
class BootStrap {

    def init = { servletContext ->

        test{



        }

        production{

            if (TestUser.count() == 0) {
                def user01 = new TestUser(
                        name:'User Registrado1',
                        email:'user10@detocho.com.mx'

                )

                user01.save()

            }

        }

        development{

            if (TestUser.count() == 0) {
                def user01 = new TestUser(
                        name:'User Registrado1',
                        email:'user10@detocho.com.mx'

                )

                user01.save()

            }

        }
    }
    def destroy = {
    }
}
