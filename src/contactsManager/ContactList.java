package contactsManager;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private ArrayList<ContactItem> contactItems;
//    private GroceryItem [] groceryItems;

    public ContactList() {
        contactItems = new ArrayList<>();
//        contactItems = new ContactItem[10];
    }

    public void addContactItem(ContactItem item) {
        contactItems.add(item);
    }

    public void printItems() {
        System.out.println("My Contact List");
        for(ContactItem item : contactItems) {
            System.out.println("\t" + item);
        }
    }

<<<<<<< HEAD

=======
>>>>>>> f46a0795146a8f957b0dc3a955d8f12a7dfc1919
    private int getIndexOfItemByName(String itemName) {
        int index = -1;
        for (int i = 0; i < contactItems.size(); i++) {
            ContactItem item = contactItems.get(i);
            // Revisit in case entire contact doesnt delete
            String itemNameInList = item.getFirstName();
            if(itemNameInList.equalsIgnoreCase(itemName)) {
                // we found it in the list so save its index
                return i;
            }
        }
        return index;
    }

    public void removeContactItem(String itemName, String deleteLastName) {
        // 1. find the index of the contact item with itemName
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the contact list at that index
        if(index > -1) {
            contactItems.remove(index);
        }
    }

    public ContactItem getItemByName(String itemName) {
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            return contactItems.get(index);
        }
        System.out.println("Could not find item: " + itemName);
        return null;
    }

    public List<String> toStringList() {
        // Intellj created a new interface (might need to undo)
        List<String> itemStrings = new ArrayList<>();
        for(ContactItem item : contactItems) {
            itemStrings.add(item.toString());
        }
        return itemStrings;
    }

}
