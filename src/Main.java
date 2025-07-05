/*
Write a program that takes a  String as input and checks if it is a palindrome.
A palindrome is a word, number, or other sequence of characters that reads the same
forward and backward.

- Use StringBuilder to create a new string that is a reverse of the input string
- Use the equals() method to check if the input string and the reversed string are the same
- If the strings are the same, print "The input string is a palindrome".
- If the strings are not the same, print "The input string is not a palindrome"
*/
import java.util.Scanner;
public class Main {
     void PalindromeChecker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the first string: ");
        StringBuilder stringbuilder1 = new StringBuilder(scanner.nextLine());
        System.out.println("Please input the second string: ");
        StringBuilder stringbuilder2 = new StringBuilder(scanner.nextLine());

        if (stringbuilder1.reverse().toString().contentEquals(stringbuilder2)){
            System.out.println("The input string is a palindrome");
        }
        else {
            System.out.println("The input string is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.PalindromeChecker();
    }
}
