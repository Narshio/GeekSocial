interface userRepository{
    fun createUser(user:user)
    fun deleteUser(user:user)
    fun editUser(user:user)
    fun readUser(user:user)
    fun readAll()
}