class BookingController(private val printer: Printer) {
    private val bookingList = mutableListOf<Booking>()

    fun createBooking(room: Room, customer: Customer, startDate: String, endDate: String, totalNights: Int) {
        val newBooking = Booking(room, customer, startDate, endDate, totalNights)
        bookingList.add(newBooking)
    }

    fun cancelBooking(index: Int) {
        if (index in bookingList.indices) {
            bookingList[index].cancelBooking()
            printer.printMsg("Booking cancelled successfully.")
        } else {
            printer.printMsg("Invalid booking index.")
        }
    }

    fun updateBookingNights(index: Int, newTotalNights: Int) {
        if (index in bookingList.indices) {
            bookingList[index].updateNights(newTotalNights)
            printer.printMsg("Booking nights updated successfully.")
        } else {
            printer.printMsg("Invalid booking index.")
        }
    }

    fun showBookings() {
        if (bookingList.isEmpty()) {
            printer.printMsg("No bookings found.")
        } else {
            var counter = 1
            for (booking in bookingList) {
                printer.printMsg("$counter " + booking.getBookingData())
                counter++
            }
        }
    }

    fun areNotBookingsRegistered(): Boolean = bookingList.isEmpty()
}