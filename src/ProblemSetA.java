public class ProblemSetA {

    /*
    Problem Set A
    Title: A Time in the Delta World

    Description: You’re an employee at FedUp Games, you are involved in a project about a platformer game.
    Your task is to create the movement algorithm of the player. The Vector Object is responsible with the movement of the player.
    All you need to do is to return the movement based on the speed times the vector. As for the jumping aspect,
    check if the character is on the floor, and if true, the character will be able to jump.
    Every product must be multiplied by the delta time.

    Objective: To work with ADTs and Objects in a game setting.
     */

    public static void main(String[] args) {
        final float DELTA = 0.60122f;
        Vector2D position = new Vector2D(0, 0);
        Tester(position, DELTA);
    }

    static void moveLeft(float delta, Vector2D vec, float speed) {

    }

    static void moveRight(float delta, Vector2D vec, float speed) {

    }

    static void moveUp(float delta, Vector2D vec, float speed) {

    }

    static void moveDown(float delta, Vector2D vec, float speed) {

    }

    static class Vector2D {
        private float x;
        private float y;

        public Vector2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }

        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return x + ", " + y;
        }
    }

    static void Tester(Vector2D position, float DELTA) {
        moveLeft(DELTA, position, 10);
        Test(position.getX() == -6.0122004f, "Test Case 1");
        moveLeft(DELTA, position, 14);
        Test(position.getX() == -8.41708f, "Test Case 2");
        moveRight(DELTA, position, 111);
        Test(position.getX() == 66.73542f, "Test Case 3");
        moveUp(DELTA, position, 302);
        Test(position.getY() == -181.56845f, "Test Case 4");
        moveDown(DELTA, position, -209);
        Test(position.getY() == -125.65498f, "Test Case 5");
    }

    static void Test(boolean condition, String name) {
        if (!condition) {
            System.out.println("FAILED: " + name);
            return;
        }
        System.out.println("SUCCESS: " + name);
    }
}
