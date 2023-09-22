import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Authentication authentication = new Authentication();

        authentication.AddAccount(
                new Account("hello", "world")
        );

        authentication.AddAccount(
                new Account("biker", "man")
        );

        authentication.AddAccount(
                new Account("jeff", "1234567890")
        );

        Login(authentication);
    }

    static void Login(Authentication authentication) {
        // Implement here...
    }

    static class Authentication {
        private List<Account> accounts;

        public Authentication() {
            accounts = new ArrayList<>();
        }

        public void AddAccount(Account account) {
            accounts.add(account);
        }

        public Account SearchAccount(String username) {
            // Implement here...
            return null;
        }

        public boolean Authenticate(String username, String password) {
            // Implement here...
            return false;
        }
    }

    static class Account {
        private String username;
        private String password;

        public Account(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

//    static void Login(Authentication authentication) {
//        Scanner scanner = new Scanner(System.in);
//        String username, password;
//        boolean result;
//
//        System.out.print("Enter your username: ");
//        username = scanner.nextLine();
//        System.out.print("Enter your password: ");
//        password = scanner.nextLine();
//
//        result = authentication.Authenticate(username, password);
//        if (result) {
//            System.out.println("Welcome " + username + "! You have successfully logged in.");
//        } else {
//            System.out.println("Wrong password, username, or the account does not exist!");
//        }
//    }

//    static class Authentication {
//        private List<Account> accounts;
//
//        public Authentication() {
//            accounts = new ArrayList<>();
//        }
//
//        public void AddAccount(Account account) {
//            accounts.add(account);
//        }
//
//        public Account SearchAccount(String username) {
//            for (Account i : accounts) {
//                if (i.username.equals(username)) {
//                    return i;
//                }
//            }
//            System.err.println("Account not found!");
//            return null;
//        }
//
//        public boolean Authenticate(String username, String password) {
//            Account account = SearchAccount(username);
//            if (account != null) {
//                if (account.password.equals(password)) return true;
//            }
//            return false;
//        }
//    }
}
