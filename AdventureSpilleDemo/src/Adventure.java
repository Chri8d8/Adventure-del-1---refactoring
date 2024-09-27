public class Adventure {

    Player player;
    map map;

    public Adventure() {
        map = new map();
        player = new Player(map.getCurrentRoom());
    }

    public String move(String direction) {
        Room room = player.move(direction);
        if (room != null) {
            return "you move to " + player.placement.getName() + " " +
             player.placement.getRoomDescription();
        } else {
            return "connot go this way";
        }
    }
}
