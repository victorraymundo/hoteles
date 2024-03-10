class RoomsController(private val printer: Printer) {
    private val roomList = mutableListOf<Room>()

    fun registerRoom(pricePerNight: Double, capacity: Int, roomId: Int, roomType: String) {
        val addedRoom = Room(roomId, roomType, pricePerNight, capacity)
        roomList.add(addedRoom)
    }

    fun modifyRoom(modifiedRoom: Room, index: Int) {
        roomList[index] = modifiedRoom
    }

    fun getRoomByIndex(index: Int): Room {
        return roomList[index]
    }

    fun showRooms() {
        if (roomList.isEmpty()) {
            printer.printMsg("No se encuentran habitaciones registradas")
        } else {
            var counter = 1
            for (room in roomList) {
                printer.printMsg("$counter "  +room.getRoomDetails())
                counter++
            }
        }
    }

    fun areNotRoomsRegistered(): Boolean = roomList.isEmpty()
}