import java.util.*;

public class ProblemSetC {

    /*
    Problem Set C: Botched Up Rock
    Title: Boched Up Rock

    Description: Your’re an employee at Botcher Inc., and your client,
    a local university geology museum launched an investigation of the lack of check-ins.
    It was found that their check-in system was broken not by hardware but by software.
    They want you to fix it. The problem may be the algorithm.
    Your objective is to store every check-in on the database.
    The database is already provided.

    Objective: To work with ADTs and Objects in a development operations setting.
     */

    public static void main(String[] args) {
        CheckIn checkIn = new CheckIn();
        Tester(checkIn);
    }

    static class Employee {
        private String name;
        private int id;
        private int checkinDay;
        private int checkinSeconds;

        public Employee(String name, int id) {
            Random rnd = new Random();
            this.name = name;
            this.id = id;
            this.checkinDay = rnd.nextInt(1000);
            this.checkinSeconds = rnd.nextInt(1000);
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getCheckinDay() {
            return checkinDay;
        }

        public int getCheckinSeconds() {
            return checkinSeconds;
        }
    }

    static class CheckIn {
        private List<Employee> employees;
        private List<Integer> checkInDays;

        public CheckIn() {
            employees = new ArrayList<Employee>();
            checkInDays = new ArrayList<Integer>();
        }

        public boolean addCheckIn(Employee employee) {
            // Fix Here!
            employees.add(new Employee("null", 0));
            checkInDays.add(1000);
            return false;
        }
    }

    static void Tester(CheckIn checkIn) {
        Test(checkIn.addCheckIn(new Employee("Jones", 2918)), "Test Case 1");
        Test(checkIn.addCheckIn(new Employee("Roger", 6331)), "Test Case 2");
        Test(checkIn.addCheckIn(new Employee("William", 2510)), "Test Case 3");
    }

    static void Test(boolean condition, String name) {
        if (!condition) {
            System.out.println("FAILED: " + name);
            return;
        }
        System.out.println("SUCCESS: " + name);
    }
}
