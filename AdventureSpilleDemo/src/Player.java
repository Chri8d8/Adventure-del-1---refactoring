public class Player {
    Room placement;

    public Player(Room placement) {
        this.placement = placement;
    }

    public Room move(String movement) {
        if (movement.equalsIgnoreCase("go north")&&
                placement.getNeighbourNorth()!= null) {
            placement = placement.getNeighbourNorth();
        } else if (movement.equalsIgnoreCase("go south") &&
        placement.getNeighBourSouth() != null) {
          placement = placement.getNeighBourSouth();
        } else if (movement.equalsIgnoreCase("go west") &&
        placement.getNeighBourWest() != null) {
            placement = placement.getNeighBourWest();
        } else if (movement.equalsIgnoreCase("go east") &&
        placement.getNeighBourEast() != null) {
            placement = placement.getNeighBourEast();
        } else {
            return null;
        }
        return placement;
    }
}
