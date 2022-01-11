/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

import java.util.Scanner;

/**
* Main.
*/
final class Main {

    /**
    * Constant.
    */
    public static final int ELEVEN = 11;

    /**
    * Constant.
    */
    public static final int SEVEN = 7;

    /**
    * Constant.
    */
    public static final String ADD = "Adding ";

    /**
    * Constant.
    */
    public static final String BAD = "Can't add to stack.";

    /**
    * Constant.
    */
    public static final String SPACE = "\n";

    /**
    * Constant.
    */
    public static final String DOT = ".";

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        final MrCoxallStack stack = new MrCoxallStack();

        System.out.println("The initial stack is empty.\n");
        stack.showStack();

        try {

            final int firstNumber;
            final Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            firstNumber = scanner1.nextInt();
            System.out.println(SPACE + ADD + firstNumber + DOT);
            stack.push(firstNumber);
            stack.showStack();
        }
        catch (java.util.InputMismatchException ex) {
            System.out.println(BAD + SPACE);
        }

        try {

            final int secondNumber;
            final Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter the second number: ");
            secondNumber = scanner2.nextInt();
            System.out.println(SPACE + ADD + secondNumber + DOT);
            stack.push(secondNumber);
            stack.showStack();
        }
        catch (java.util.InputMismatchException ex) {
            System.out.println(BAD + SPACE);
        }

        final int peekNumber = stack.peek();
        if (peekNumber != -1) {
            System.out.println("Peeked " + peekNumber + SPACE);
        }

        if (stack.pop() != -1) {
            System.out.println("Popping top number.");
            stack.showStack();
            stack.pop();
        }
        System.out.println("Clearing stack.");
        stack.clear();
        stack.showStack();
        System.out.println("\nDone.");
    }
}
