package hotel;

public class Hotel {
	private Room[] rooms;
	public Hotel( {
		this.rooms=rooms;
	}
		public Hotel(String,Room[]) {
		// TODO Auto-generated constructor stub
	}
		public void displayAvailableRooms() {
			System.out.println("Available Rooms:");
			for(Room room :rooms) {
				if(is!room,isOccupied()) {
					System.out.println(room);
				}
		}
}

		public void checkIn() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter room number:");
			int roomNumber=scanner.nextInt();
			Room room = findRoom(roomNumber);
			if(room != null) {
				if (room.isOccupied()) {
					System.out.println("Room" + roomNumber + "is already occupied.");
				}   else {
					System.out.println("Room" + roomNumber + "does not exists." );
				}
			}
		}
		
		
		public void checkOut()  {
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter Room Number:");
			int roomNumber = scanner.nextInt();
			Room room =findRoom(roomNumber);
			if(room != null)  {
				if(room isOccupied()) {
					String guestName =room.getGuestName();
					room.setGuestName("");
					room.setOccupied(false);
					System.out.println("Guest" + guestName +"checked out of room" + roomNumber +".");
				}   else {
					System.out.println("Room" + roomNumber +"is not occupied.");
				}  else {
					System.out.println("Room" + roomNumber + "does not exist.");
				}
			}
			private Room findRoom(int roomNumber) {
				for (Room room = room)  {
					if(room.getRoomNumber() == RoomNumber) {
						return room;
					}
				}
				return null;
			}
				
		}