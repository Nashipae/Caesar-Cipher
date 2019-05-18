//import java.util.Scanner;

import java.util.Scanner;

public class Encrypter {
    private String  plainText;
    private int shift;

    public String getPlainText() {
    return plainText;
    }

    public int getShift() {
        return shift;
    }

    public String encrypt(String plaintext, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        String cipher = "";
        int length = plaintext.length();
        for (int i = 0; i < length; i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        cipher += (char) (ch - (26 - shift));
                    } else {
                        cipher += c;
                    }

                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'Z') {
                        cipher += (char) (ch - (26 - shift));
                    } else {
                        cipher += c;
                    }
                }

            } else {
                cipher += ch;
            }
        }
        return cipher;

    }
}