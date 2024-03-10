class MenuController {
    private val printer = Printer()
    private val roomsController = RoomsController(printer)
    private val bookingController = BookingController(printer)
    private val customerController = CustomersController(printer)

    fun showMainMenu() {
        var option: Int
        do {
            printer.printMsg("Main Menu:")
            printer.printMsg("1. Rooms Management")
            printer.printMsg("2. Booking Management")
            printer.printMsg("3. Customer Management")
            printer.printMsg("4. Exit")
            option = readOption()
            when (option) {
                1 -> showRoomsMenu()
                2 -> showBookingMenu()
                3 -> showCustomerMenu()
                4 -> printer.printMsg("Exiting...")
                else -> printer.printMsg("Invalid option. Please try again.")
            }
        } while (option != 4)
    }

    private fun showRoomsMenu() {
        var option: Int
        do {
            printer.printMsg("Rooms Management:")
            printer.printMsg("1. Register Room")
            printer.printMsg("2. Modify Room")
            printer.printMsg("3. Show Rooms")
            printer.printMsg("4. Back to Main Menu")
            option = readOption()
            when (option) {
                1 -> roomsController.registerRoom()
                2 -> roomsController.modifyRoom()
                3 -> roomsController.showRooms()
                4 -> printer.printMsg("Returning to main menu...")
                else -> printer.printMsg("Invalid option. Please try again.")
            }
        } while (option != 4)
    }

    private fun showBookingMenu() {
        var option: Int
        do {
            printer.printMsg("Booking Management:")
            printer.printMsg("1. Create Booking")
            printer.printMsg("2. Cancel Booking")
            printer.printMsg("3. Update Booking Nights")
            printer.printMsg("4. Show Bookings")
            printer.printMsg("5. Back to Main Menu")
            option = readOption()
            when (option) {
                1 -> bookingController.createBooking()
                2 -> bookingController.cancelBooking()
                3 -> bookingController.updateBookingNights()
                4 -> bookingController.showBookings()
                5 -> printer.printMsg("Returning to main menu...")
                else -> printer.printMsg("Invalid option. Please try again.")
            }
        } while (option != 5)
    }

    private fun showCustomerMenu() {
        var option: Int
        do {
            printer.printMsg("Customer Management:")
            printer.printMsg("1. Register Customer")
            printer.printMsg("2. Modify Customer")
            printer.printMsg("3. Show Customers")
            printer.printMsg("4. Back to Main Menu")
            option = readOption()
            when (option) {
                1 -> customerController.registerCustomer()
                2 -> customerController.modifyCustomer()
                3 -> customerController.showCustomers()
                4 -> printer.printMsg("Returning to main menu...")
                else -> printer.printMsg("Invalid option. Please try again.")
            }
        } while (option != 4)
    }

    private fun readOption(): Int {
        return try {
            printer.printMsg("Enter your option:")
            readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            0
        }
    }
}