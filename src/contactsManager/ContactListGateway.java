package contactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ContactListGateway {
    public static Path folder = Paths.get("data");
    public static Path file = Paths.get("data", "contacts.txt");

        public static void writeToFile(ContactList contactList) {
            // 1. make a path object
//            Path filePath = getFilePath();
            Path filePath = file;
            if(filePath == null) {
                System.out.println("Filepath could not be created. Cannot save.");
                return;
            }

            // 2. make a temporary list of strings that are the contact items and write those to the file
            List<String> itemStrings = contactList.toStringList();

            // 3. use Files.write to send the data to the file
            writeItemStringsToFilePath(filePath, itemStrings);
        }

        private static void writeItemStringsToFilePath(Path filePath, List<String> itemStrings) {
            try {
                Files.write(filePath, itemStrings);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static ContactList readFromFile() {
            ContactList list = new ContactList();

            // 1. make a path object
//            Path filePath = getFilePath();
            Path filePath = file;
            if(filePath == null) {
                System.out.println("Filepath could not be created. Cannot load.");
                return list;
            }

            // 2. read item strings from file
            List<String> itemStrings = readItemStringsFromFilePath(filePath);

            // 3. make items from the items strings and put them in the contactsList
            for(String itemString : itemStrings) {
                ContactItem item = ContactItem.createFromString(itemString);
                list.addContactItem(item);
            }
            return list;
        }

        public static List<String> readItemStringsFromFilePath(Path filePath) {
            try {
                return Files.readAllLines(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
