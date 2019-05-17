import java.util.*;
public class Decrypter {
    private String cipherText = Encoder.main();

    public Decrypter(String cipherText) {
        this.cipherText = cipherText;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    //
//        get text to decrypt

}