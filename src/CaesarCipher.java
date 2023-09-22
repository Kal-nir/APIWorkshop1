public class CaesarCipher {
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
        char ch = '\0';
        for (int i = 0; i < plaintext.length(); i++) {
            ch = plaintext.charAt(i);
            if (Character.isAlphabetic(ch)) { // By Jonas Gabriel L. Rusiana
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
            if (Character.isAlphabetic(ch)) { // By Jonas Gabriel L. Rusiana
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
