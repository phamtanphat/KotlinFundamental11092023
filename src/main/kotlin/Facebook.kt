class Facebook: OnLogin {
    override fun executeLogin(): Boolean {
        print("Execute login")
        return true
    }

    override fun loginSuccess() {
        print("Login success")
    }

    override fun loginFail() {
        print("Login success")
    }

}