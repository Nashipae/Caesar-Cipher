//import java.util.*;
//
//public class Decrypter {
//    private String cipherText = Encoder.main();
//
//    public Decrypter(String cipherText) {
//        this.cipherText = cipherText;
//
//        int shift = cipherText();
////        String cipherText = "";
//
//        for(int i=0; i < cipherText.length();i++)
//        {
////             Traverse each character in the plaintext one at a time
//            char alphabet = cipherText.charAt(i);
//            // if alphabet lies between a and z
//            if((alphabet >= 'a' && alphabet <= 'z') ||
//                    (alphabet >= 'A' && alphabet <= 'Z'))
//            {
//                // shift alphabet
//                alphabet = (char) (alphabet + shift);
//            }
//            // if shift alphabet greater than 'z'
//            if(alphabet > 'z') {
//                // reshift to starting position
//                alphabet = (char) (alphabet+'a'-'z'-1);
//            }
//            // if shift alphabet greater than 'Z'
//            else if(alphabet > 'Z' && alphabet < 'a') {
//                //reshift to starting position
//                alphabet = (char) (alphabet+'A'-'Z'-1);
//            }
//            cipherText = cipherText + alphabet;
//        }
//        System.out.println(" Your decrypted text is : " + cipherText);
//    }
//
//}