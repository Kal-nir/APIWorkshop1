import java.util.*;

public class ProblemSetB {

    /*
    Problem Set B
    Title: Jazzed Up Words

    Description: You’re an employee at Word Jazz Piers Inc., you are involved in a project that encrypts data for a database system.
    This project is part of the server of where the database is stored. The objective is to encrypt incoming data,
    and to do authentication of user login system with the decryption algorithm.
    The encryption and decryption algorithms are already provided.

    Objective: To work with ADTs and Objects in an app development setting.
     */

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(5);
        Authentication authentication = new Authentication();

        authentication.AddAccount(
                new Account("hello", "world"), cipher
        );

        authentication.AddAccount(
                new Account("biker", "man"), cipher
        );

        authentication.AddAccount(
                new Account("jeff", "1234567890"), cipher
        );

        Tester(authentication, cipher);
    }

    static boolean Login(Authentication authentication, CaesarCipher cipher, String username, String password) {
        // WORK HERE

        return false;
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

    static class Authentication {
        private List<Account> accounts;

        public Authentication() {
            accounts = new ArrayList<>();
        }

        public void AddAccount(Account account, CaesarCipher cipher) {
            account.setPassword(cipher.encrypt(account.getPassword()));
            accounts.add(account);
        }

        public Account SearchAccount(String username) {
            for (Account i : accounts) {
                if (i.username.equals(username)) {
                    return i;
                }
            }
            System.err.println("Account not found!");
            return null;
        }

        public boolean Authenticate(String username, String password, CaesarCipher cipher) {
            // Work Here
            return false;
        }
    }

    static class CaesarCipher {
        private String plaintext = "", ciphertext = "";
        private int key, letter;

        public CaesarCipher(int key) {
            setKey(key);
        }

        public void setPlaintext(String plaintext) {
            this.plaintext = plaintext.toLowerCase();
        }

        public void setKey(int key) {
            this.key = key;
        }

        public void setCaesarCipher(String plaintext, int key) {
            setPlaintext(plaintext);
            setKey(key);
        }

        public String getCiphertext() {
            return ciphertext;
        }

        public int getKey() {
            return key;
        }

        public String getPlaintext() {
            return plaintext;
        }

        public String encrypt(String plaintext) {
            ciphertext = "";
            char ch = '\0';
            for (int i = 0; i < plaintext.length(); i++) {
                ch = plaintext.charAt(i);
                if (Character.isAlphabetic(ch)) {
                    letter = plaintext.charAt(i) + (key % 26);
                    if (letter > 'z')
                        letter -= 26;
                    ciphertext += (char)(letter);
                } else {
                    ciphertext += (char) ch;
                }
            }
            return ciphertext;
        }

        public String decrypt(String ciphertext) {
            String hold = "";
            char ch = '\0';
            for (int i = 0; i < ciphertext.length(); i++) {
                ch = ciphertext.charAt(i);
                if (Character.isAlphabetic(ch)) {
                    letter = ciphertext.charAt(i) - (key % 26);
                    if (letter < 'a')
                        letter += 26;
                    hold += (char)(letter);
                } else {
                    hold += (char) ch;
                }
            }
            return hold;
        }
    }

    static void Tester(Authentication authentication, CaesarCipher cipher) {
        Test(Login(authentication, cipher, "hello", "world"), "Test Case 1");
        Test(Login(authentication, cipher, "biker", "man"), "Test Case 2");
        Test(Login(authentication, cipher, "jeff", "1234567890"), "Test Case 3");
    }

    static void Test(boolean condition, String name) {
        if (!condition) {
            System.out.println("FAILED: " + name);
            return;
        }
        System.out.println("SUCCESS: " + name);
    }
}
