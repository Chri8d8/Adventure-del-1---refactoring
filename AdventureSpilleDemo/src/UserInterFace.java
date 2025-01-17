import java.util.Scanner;

public class UserInterFace {

    public void game() {
        Adventure adventure = new Adventure();
        System.out.println("Welcome traveller");
        System.out.println("your can move in following directions");
        System.out.println("North, east, south or west." +
                " You do by typing ''go'' followed by the 4 directions");
        String userChoice = "";
        while (!userChoice.equalsIgnoreCase("exit")) {
            Scanner input = new Scanner(System.in);
            userChoice = input.nextLine();

            switch (userChoice) {
                case "go north", "go east", "go west", "go south":
                    System.out.println(adventure.move(userChoice));
                    break;
                case  "look","i":
                    System.out.println("Having a look around!" + "\n You are in " +
                            adventure.player.placement.getName()
                            + " " + adventure.player.placement.getRoomDescription());
                    break;
                case "help","h":
                    System.out.println("you are in: " + adventure.player.placement.
                            getName() + "\nYou can type following: ''go'' followed by  on of the 4 compass directions\" +\n" +
                            "or their starting letter!!" +
                            "Type look to have a look at your surroundings" +
                            " Type exit to exit game  ");
                    break;

                case "exit":
                    System.out.println("Game over");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}
