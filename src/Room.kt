class Room(
    val roomId: Int,
    val roomType: String,
    val pricePerNight: Double,
    val capacity: Int
) {
    private var isBooked: Boolean = false

    fun bookRoom() {
        isBooked = true
    }

    fun unbookRoom() {
        isBooked = false
    }

    fun isRoomBooked(): Boolean {
        return isBooked
    }

    fun getRoomDetails(): String {
        return "Room ID: $roomId\n"
                "Room Type: $roomType\n"
                "Price Per Night: $pricePerNight\n"
                "Capacity: $capacity\n"
                "Booked: $isBooked\n"
    }
}
