package contactsManager;

import util.Input;

import static contactsManager.ContactItem.createFromString;

public class ContactApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    public static void main(String[] args) {
        Input input = new Input();
        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while (choice != EXIT_CHOICE) {
            printMenu();
            choice = input.getInt(0, 5, "");
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
        Input userInput = new Input();

        ContactList contactList = new ContactList();
        ContactItem person1 = new ContactItem("Matt","Grey", "1231231234");
        ContactItem person2 = new ContactItem("Nat","Sneed", "1231231235");

        contactList.addContactItem(person1);
        contactList.addContactItem(person2);

        // TODO: call your functions based on whatever the user's choice is
        switch (choice) {
            case 1 -> contactList.printItems();
            case 2 -> {
                System.out.println("Enter the first name of the contact:");
                String firstName = userInput.getString();
                System.out.println("Enter the last name of the contact:");
                String lastName = userInput.getString();
                System.out.println("Enter the phone number of the contact:");
                String phoneNumber = userInput.getString();
                ContactItem newContact = new ContactItem(firstName, lastName, phoneNumber);
                contactList.addContactItem(newContact);
            }
            case 3 -> {
                System.out.println("Enter the first name of the contact:");
                String searchFirstName = userInput.getString();
                System.out.println("Enter the last name of the contact:");
                String searchLastName = userInput.getString();
                contactList.searchContactItem(searchFirstName, searchLastName);
            }
            case 4 -> {
                System.out.println("Enter the first name of the contact:");
                String deleteFirstName = userInput.getString();
                System.out.println("Enter the last name of the contact:");
                String deleteLastName = userInput.getString();
                contactList.removeContactItem(deleteFirstName, deleteLastName);
            }
            case 5 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Try again.");
        }
        switch (choice) {

            case 1:
                // TODO: view all contacts
                contactList.printItems();
                break;
            case 2:
                // TODO: add a new contact
                contactList.addContactItem(createFromString(userInput.getString()));
                break;
            case 3:
                // TODO: Search contact by name
                contactList.getItemByName(userInput.getString());
                break;
            case 4:
                // TODO: Delete contact
                contactList.removeContactItem(userInput.getString());
                break;
            case 5:
                // TODO: Exit
                break;
        }
    }
}

