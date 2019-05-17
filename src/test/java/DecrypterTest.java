import org.junit.Test;

import static org.junit.Assert.*;

public class DecrypterTest {

//    Test on decrypter.
    @Test
    public void decryptTest() {
        Decrypter text = new Decrypter();
        String result = "ab";
        assertEquals(result, text.decrypt("bc", 1));

    }
}