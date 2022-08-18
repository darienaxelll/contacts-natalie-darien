package contactsManager;

import util.Input;

public class ContactApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    public static void main(String[] args) {
        Input input = new Input();
        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while (choice != EXIT_CHOICE) {
            printMenu();
            choice = input.getInt(0, 6, "");
            doChoice(choice);
        }
    }

    private static void printMenu() {
        System.out.print("""
                    
                1 - View contacts.
                2 - Add a new contact.
                3 - Search a contact by name.
                4 - Delete an existing contact.
                5 - Exit.
                            
                Enter an option:\040""");
    }

    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch (choice) {
            case 1:
                // TODO: view all contacts
                break;
            case 2:
                // TODO: add a new contact
                break;
            case 3:
                // Search contact by name
                break;
            case 4:
                // TODO: Delete contact
                break;
            case 5:
                // TODO: Exit
                break;


        }
    }
}

