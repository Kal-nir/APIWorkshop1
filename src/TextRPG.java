import java.util.Scanner;

public class TextRPG {
    public static void main(String[] args) {

        Location room1 = new Location(
                "Dungeon Room 1",
                "It's really dirty in here."
        );
        Location room2 = new Location(
                "Dungeon Room 2",
                "It's somewhat clean here... I don't know why."
        );
        Location room3 = new Location(
                "Dungeon Room 3",
                "This dungeon has an exit in it."
        );
        Enemy enemy = new Enemy(
                "Dragon X",
                100
        );

        room1.setFront(room2);
        room2.setFront(room3);
        room2.setBack(room1);
        room3.setBack(room2);
        room3.setEnemy(enemy);

        StartGame(room1);
    }

    static void StartGame(Location init) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        Location location = init;
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            choice = scanner.nextLine();
            switch (choice.toLowerCase()) {
                case "describe":
                    System.out.println(location.getDescription());
                    break;
                case "attack":
                    // Implement Feature Here...
                case "gofront":
                    // Implement Feature Here...
                case "goback":
                    // Implement Feature Here...
                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Command not found!");
                    break;
            }
        } while (true);
    }

    static class Location {
        private String name;
        private String description;
        private  Location front;
        private Location back;
        private Enemy enemy;

        public Location(String name, String description) {
            this.name = name;
            this.description = description;
            this.front = null;
            this.back = null;
            this.enemy = null;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            String hold = getName() + ":\n" + description;
            if (enemy != null) {
                hold += "\nAn enemy by the name of " + enemy.getName() + " lurks here...";
            }
            return hold;
        }

        public void setFront(Location front) {
            this.front = front;
        }

        public void setBack(Location back) {
            this.back = back;
        }

        public void setEnemy(Enemy enemy) {
            this.enemy = enemy;
        }

        public Location getFront() {
            return front;
        }

        public Location getBack() {
            return back;
        }

        public Enemy getEnemy() {
            return enemy;
        }

        void Describe() {
            System.out.println(description);
        }
    }

    static class Enemy {
        String name;
        int health;

        public Enemy(String name, int health) {
            this.name = name;
            this.health = health;
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public boolean isDead() {
            return health <= 0;
        }

        void Attack(int damage) {
            if (isDead()) {
                System.out.println("The enemy is already dead!");
                return;
            }
            System.out.println("The enemy is damaged by " + damage);
            health -= damage;
            if (isDead()) {
                System.out.println("The enemy died.");
            }
        }
    }

//    static void StartGame(Location init) {
//        Scanner scanner = new Scanner(System.in);
//        String choice = "";
//        Location location = init;
//        do {
//            System.out.println();
//            System.out.println("What would you like to do?");
//            choice = scanner.nextLine();
//            switch (choice.toLowerCase()) {
//                case "describe":
//                    System.out.println(location.getDescription());
//                    break;
//                case "attack":
//                    if (location.getEnemy() == null) {
//                        System.out.println("There's no enemy in this room!");
//                        break;
//                    }
//                    if (!location.getEnemy().isDead()) {
//                        location.getEnemy().Attack(25);
//                        break;
//                    }
//                    System.out.println("The enemy is already dead.");
//                    break;
//                case "gofront":
//                    if (location.getEnemy() == null) {
//                        System.out.println("You've gone to " + location.getFront().name);
//                        location = location.getFront();
//                        break;
//                    }
//                    if (location.getEnemy().isDead()) {
//                        System.out.println("You've gone to " + location.getFront().name);
//                        location = location.getFront();
//                        break;
//                    }
//                    System.out.println("The enemy is still alive! You can't go to that location yet.");
//                    break;
//                case "goback":
//                    if (location.getEnemy() == null) {
//                        System.out.println("You've gone to " + location.getBack().name);
//                        location = location.getBack();
//                        break;
//                    }
//                    if (location.getEnemy().isDead()) {
//                        System.out.println("You've gone to " + location.getBack().name);
//                        location = location.getBack();
//                        break;
//                    }
//                    System.out.println("The enemy is still alive! You can't go to that location yet.");
//                    break;
//                case "exit":
//                    scanner.close();
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Command not found!");
//                    break;
//            }
//        } while (true);
//    }
}
