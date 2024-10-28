

import java.util.Scanner;

class Bank3 {
    static void Intialize() {
        ATM a = new ATM();

            try {
                a.accessInput();
                a.validate();
                return; // Exit if successful
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());


            }
        }

}

class InvalidInputException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid Input";
    }
}

class ATM {
    private static final int CORRECT_PIN = 1234; // Correct PIN
    private int inputPin;
    private Scanner scan = new Scanner(System.in);

    public void accessInput() {
        System.out.println("Enter the pin:");
        inputPin = scan.nextInt();
    }


    public void accessInput(int pin) {
        inputPin = pin;
    }

    public void validate() throws InvalidInputException {
        if (inputPin == CORRECT_PIN) {
            System.out.println("Collect your Money");
        } else {
            throw new InvalidInputException();
        }
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Bank3.Intialize();
    }
}
