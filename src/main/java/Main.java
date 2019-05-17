import java.util.Scanner;

public class Main {

    public void main(String[] args) {

//        Get user input
        Scanner requestText = new Scanner(System.in);
        System.out.println(" What is the text that you would want encrypted : ");
        String userInputtedText = requestText.nextLine();


//        Get user input on shift value
        System.out.println(" Enter a value between 1 -25 by which each character in the plaintext message gets shifted : ");
        int shift = requestText.nextInt();
//
        Encrypter myEncrypter = new Encrypter();
        String cipherText = myEncrypter.encrypt(requestText, shift);
        System.out.println("Your encrypted text is : " + cipherText);

        Decrypter myDecrypter = new Decrypter();
        String decryptedText = myDecrypter.decrypt(cipherText, shift);

        System.out.println("Your encrypted text is : " + cipherText);

    }


    }
