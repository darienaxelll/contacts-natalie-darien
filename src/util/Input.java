package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        // get a string from user input
        String userInput = getString();

        // if user typed y or yes then return true
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        }
        // else return false
        return false;
    }

    public int getInt() {
        while (true) {
            try {
                String userInput = getString();
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Uh oh, something went wrong: " + e.getMessage());
                System.out.println("Here are more details: ");
                e.printStackTrace();
            }
        }
    }

    public int getInt(int min, int max, String prompt) {
        // print prompt everytime this method is called!
        System.out.print(prompt);

        // get int from user
        int userInt = getInt();

        // if int is not between min and max, ask user for another int
        if(userInt < min || userInt > max) {
            System.out.println("What are you, stoopid?");
            userInt = getInt(min, max, prompt);
        }

        // else return the int
        return userInt;
    }

    public double getDouble() {
        while (true) {
            try {
                String userInput = getString();
                return Double.parseDouble(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Uh oh, something went wrong: " + e.getMessage());
                System.out.println("Here are more details: ");
                e.printStackTrace();
            }
        }
    }

    public double getDouble(double min, double max) {
        // get double from user
        double userDouble = getDouble();

        // if double is not between min and max, ask user for another double
        if(userDouble < min || userDouble > max) {
            System.out.println("Double is not between " + min + " and " + max + ". Enter another double: ");
            userDouble = getDouble(min, max);
        }

        // else return the double
        return userDouble;
    }

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.print("Enter a string: ");
//        System.out.println(input.getString());
//
//        System.out.print("Continue (y/n)? ");
//        System.out.println(input.yesNo());
//
//        System.out.print("Enter an int: ");
//        System.out.println(input.getInt());

//        System.out.println(input.getInt(10, 20, "Enter an int between 10 and 20: "));

//        System.out.print("Enter a double between 10 and 20: ");
//        System.out.println(input.getDouble(10, 20));

        input.getInt();
    }
}
