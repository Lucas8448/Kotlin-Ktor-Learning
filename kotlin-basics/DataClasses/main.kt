data class User(val id: Int, val name: String, val email: String)

fun main() {
    val user1 = User(1, "Lucas", "lucas@gmail.com")
    val user2 = User(2, "Jan Filip", "janfilip@example.com")

    println(user1)
    println(user2)
    
    val modifiedUser = user1.copy(name = "Not Lucas")
    println(modifiedUser)
}