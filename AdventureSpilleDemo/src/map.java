public class map {
    private Room currentRoom;

    map() {
        buildMap();
    }
    public void buildMap() {
        Room room1 = new Room("room1 " , "is room is empty,but there are two big doors  ");
        Room room2 = new Room("room2 " , "This is a quiet library. ");
        Room room3 = new Room("room3 " , "You are in a bright room with large windows. ");
        Room room4 = new Room("room4 " , "A damp cave with dripping water. ");
        Room room5 = new Room("room5 " , "A mystical room with strange symbols. ");
        Room room6 = new Room("room6 ", "An empty room with an old chair. ");
        Room room7 = new Room("room7 " , "A dark room with no visible exits. ");
        Room room8 = new Room("room8 " , "A dimly lit room with a flickering lantern. ");
        Room room9 = new Room("room9 " , "A cold, quiet room with stone walls. ");

        room1.setNeighBourEast(room2);
        room1.setNeighBourSouth(room4);

        room2.setNeighBourEast(room3);
        room2.setNeighBourWest(room1);

        room3.setNeighBourSouth(room6);
        room3.setNeighBourWest(room2);

        room4.setNeighBourSouth(room7);
        room4.setNeighbourNorth(room1);

        room5.setNeighBourSouth(room8);

        room6.setNeighbourNorth(room3);
        room6.setNeighBourSouth(room9);

        room7.setNeighbourNorth(room4);
        room7.setNeighBourEast(room8);

        room8.setNeighbourNorth(room5);
        room8.setNeighBourWest(room7);
        room8.setNeighBourEast(room9);

        room9.setNeighbourNorth(room6);
        room9.setNeighBourWest(room8);

        currentRoom = room1;
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
}
