import org.junit.Test;

import static org.junit.Assert.*;

public class EncrypterTest {

    @Test
    public void encryptTest() {
        Encrypter text = new Encrypter();
        String result = "bc";
        assertEquals(result, text.encrypt("ab", 1));

    }
}