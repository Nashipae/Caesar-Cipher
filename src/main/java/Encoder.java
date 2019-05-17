import java.util.*;
public class Encoder {

    public static void main(String args[]) {

//        Get user input
        Scanner requestedText = new Scanner(System.in);
        System.out.println(" What is the text that you would want encrypted : ");
        String userInputtedText = requestedText.nextLine();

//        Get user input on shift value
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        int shift = requestedText.nextInt();
        String cipher = "";

        for(int i=0; i < userInputtedText.length();i++)
        {

//             Traverse each character in the plaintext one at a time
            char alphabet = userInputtedText.charAt(i);
            // if alphabet lies between a and z
            if((alphabet >= 'a' && alphabet <= 'z') ||
                    (alphabet >= 'A' && alphabet <= 'Z'))
            {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
            }
            // if shift alphabet greater than 'z'
            if(alphabet > 'z') {
                // reshift to starting position
                alphabet = (char) (alphabet+'a'-'z'-1);
            }
            // if shift alphabet greater than 'Z'
            else if(alphabet > 'Z' && alphabet < 'a') {
                //reshift to starting position
                alphabet = (char) (alphabet+'A'-'Z'-1);
            }
            cipher = cipher + alphabet;
        }
        System.out.println(" Your encrypted text is : " + cipher);
    }


}