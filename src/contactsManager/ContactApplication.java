package contactsManager;

import util.Input;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static contactsManager.ContactItem.createFromString;

public class ContactApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 5;

    public static void main(String[] args) {
        Input input = new Input();
//         loop until the user says he/she does not wish to continue
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

    public static void showContacts() {
        List<String> contactsList = null;
        try {
            contactsList = Files.readAllLines(ContactListGateway.file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String contact : contactsList) {
            System.out.println(contact);
        }
    }
    private static void doChoice(int choice) {
        Input userInput = new Input();
        ContactList contactList = new ContactList();

        // TODO: call your functions based on whatever the user's choice is
        switch (choice) {
            case 1 -> showContacts();
            case 2 -> {
                System.out.println("Enter the first name of the contact:");
                String firstName = userInput.getString();
                System.out.println("Enter the last name of the contact:");
                String lastName = userInput.getString();
                System.out.println("Enter the phone number of the contact:");
                String phoneNumber = userInput.getString();
                ContactItem newContact = new ContactItem(firstName, lastName, phoneNumber);
                contactList.addContactItem(newContact);
                System.out.println(contactList.toString());
                contactList.printItems();
                ContactListGateway.writeToFile(contactList);
            }
            case 3 -> {
//                System.out.println("Enter the first name of the contact:");
//                String searchFirstName = userInput.getString();
//                System.out.println("Enter the last name of the contact:");
//                String searchLastName = userInput.getString();
//                contactList.searchContactItem(searchFirstName, searchLastName);
            }
            case 4 -> {
//                System.out.println("Enter the first name of the contact:");
//                String deleteFirstName = userInput.getString();
//                System.out.println("Enter the last name of the contact:");
//                String deleteLastName = userInput.getString();
//                contactList.removeContactItem(deleteFirstName, deleteLastName);
            }
        }
    }
}

