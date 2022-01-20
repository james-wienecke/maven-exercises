import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringutilsExercises {
/* Create a new class with a main method that prompts the user for input and does the following
(using the Stringutils class)

Tells whether or not what the user entered is a number
Flips the case of the string
Reverses the string

 */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter something: ");
        String input = sc.nextLine();
        stringIsANumber(input);
        stringFlipCase(input);
        stringReverse(input);
    }

    private static void stringReverse(String str) {
        System.out.println("Reversed:");
        System.out.println(StringUtils.reverse(str));
    }

    private static void stringFlipCase(String str) {
        System.out.println("Flipped case:");
        System.out.println(StringUtils.swapCase(str));
    }

    private static void stringIsANumber(String str) {
        System.out.println("Numeric:");
        System.out.println(str + " is " + (StringUtils.isNumeric(str) ? "" : "not ") + "a number");
    }


}
