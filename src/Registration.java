import java.util.*;

public class Registration {
    public static void main(String[] args) {
        AccountDatabase db = new AccountDatabase();
        db.CreateAccount(
                new Account("", 18, "", "", "test", "123456789")
        );
        db.CreateAccount(
                new Account("", 18, "", "", "2test", "1234567890")
        );
        db.CreateAccount(
                new Account("", 18, "", "", "test3", "1313131313")
        );

        Register(db);
    }

    static void Register(AccountDatabase db) {
        // Username must be unique.
        // Password must be more than 8 characters long.
        // Age must not exceed 99 and must be greater than 17.
        // Gender and job must be freeform text.

        // Implement here...
    }

    static class AccountDatabase {
        private List<Account> accounts;

        public AccountDatabase() {
            this.accounts = new ArrayList<>();
        }

        public void CreateAccount(Account account) {
            accounts.add(account);
        }

        public boolean SearchAccount(String username) {
            // Implement here...
            return false;
        }
    }

    static class Account {
        private String name;
        private int age;
        private String gender;
        private String job;
        private String username;
        private String password;

        public Account(String name, int age, String gender, String job, String username, String password) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.job = job;
            this.username = username;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public String getJob() {
            return job;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

//    static void Register(AccountDatabase db) {
//        // Username must be unique.
//        // Password must be more than 8 characters long.
//        // Age must not exceed 99 and must be greater than 17.
//        // Gender and job must be freeform text.
//        Scanner scanner = new Scanner(System.in);
//        String username, password, name, gender, job;
//        int age;
//
//        System.out.print("Enter your username (it must be unique): ");
//        username = scanner.nextLine();
//
//        System.out.print("Enter your password (must be more than 8 characters): ");
//        password = scanner.nextLine();
//
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        age = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Enter your gender: ");
//        gender = scanner.nextLine();
//
//        System.out.print("Enter your job: ");
//        job = scanner.nextLine();
//
//        if (db.SearchAccount(username)) {
//            System.out.println("Username must be unique!");
//            return;
//        }
//
//        if (password.length() < 8) {
//            System.out.println("Password must have greater than 8 of length!");
//            return;
//        }
//
//        if (age > 99 || age < 18) {
//            System.out.println("Age must be between 99 and 18.");
//            return;
//        }
//
//        Account newAccount = new Account(
//                name, age, gender, job,
//                username, password
//        );
//
//        db.CreateAccount(newAccount);
//    }

//    static class AccountDatabase {
//        private List<Account> accounts;
//
//        public AccountDatabase() {
//            this.accounts = new ArrayList<>();
//        }
//
//        public void CreateAccount(Account account) {
//            accounts.add(account);
//        }
//
//        public boolean SearchAccount(String username) {
//            for (Account i : accounts) {
//                if (i.username.equals(username)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
}
