interface OnLogin {
    fun executeLogin(): Boolean
    fun loginSuccess()
    fun loginFail()
}