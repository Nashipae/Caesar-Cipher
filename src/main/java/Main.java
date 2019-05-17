import java.util.Scanner;

public class Main {

    public void main(String[] args) {

//        Get user input
        Scanner requestText = new Scanner(System.in);
        System.out.println(" What is the text that you would want encrypted : ");
        String userInputtedText = requestText.nextLine();


//        Get user input on shift value
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        int shift = requestText.nextInt();
//
        Encrypter myEncrypter = new Encrypter();
        String cipherText = Encrypter.encrypt(requestText, shift);
        System.out.println("Your encrypted text is : " + cipherText);

        Decrypter mydecrypter = new Decrypter();
        String cipherText = myDecrypter.decrypt(cipherText, shift);

        System.out.println("Your encrypted text is : " + cipherText);

    }


    }
