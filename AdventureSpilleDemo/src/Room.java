public class Room {
    private String name;
    private String roomDescription;

    private Room neighbourNorth,neighBourSouth,neighBourWest,neighBourEast;
    public Room(String name , String roomDescription) {
        this.name = name;
        this.roomDescription = roomDescription;
    }

    public String getName() {
        return name;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Room getNeighbourNorth() {
        return neighbourNorth;
    }

    public void setNeighbourNorth(Room neighbourNorth) {
        this.neighbourNorth = neighbourNorth;
    }

    public Room getNeighBourSouth() {
        return neighBourSouth;
    }

    public void setNeighBourSouth(Room neighBourSouth) {
        this.neighBourSouth = neighBourSouth;
    }

    public Room getNeighBourWest() {
        return neighBourWest;
    }

    public void setNeighBourWest(Room neighBourWest) {
        this.neighBourWest = neighBourWest;
    }

    public Room getNeighBourEast() {
        return neighBourEast;
    }

    public void setNeighBourEast(Room neighBourEast) {
        this.neighBourEast = neighBourEast;
    }
}
