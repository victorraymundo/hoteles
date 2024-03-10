class CustomersController {
    private val customerList = mutableListOf<customer >()

    fun registreCustomer() {
        println("ingrese los nombres ")
        val names = readln()
        println("ingrese el primer apellido")
        val firstLasName = readln()
        println("ingrese el segundo apellido ")
        val secondLasname = readln()
        println("ingrese el rfc")
        val rfc = readln()
        println("ingrese el numero de telefono ")
        val phoneNumber = readln().toLong()

        val customer = customer (
            names,
            firstLasName,
            secondLasname,
            rfc,
            phoneNumber,
        )

    }
}