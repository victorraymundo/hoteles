class Customer(
    val customerId: Int,
    val name: String,
    val email: String,
    val phoneNumber: String
    val address: String,
) {
    fun getCustomerData(): String {
        return "ID Cliente: $customerId\n"
                "Nombre: $name\n"+
                "Nombre: $name\n"+
                "Correo electrónico: $email\n"+
                "Número de teléfono: $phoneNumber\n"+
    }
}
