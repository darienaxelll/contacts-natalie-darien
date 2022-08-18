package contactsManager;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private ArrayList<ContactItem> contactItems;
//    private GroceryItem [] groceryItems;

    public ContactList() {
        contactItems = new ArrayList<>();
//        groceryItems = new GroceryItem[10];
    }

    public void addContactItem(ContactItem item) {
        // array specific
//        groceryItems[0] = item;
        contactItems.add(item);
    }

    public void printItems() {
        System.out.println("My Contact List");
        for(ContactItem item : contactItems) {
            System.out.println("\t" + item);
        }
    }

    public void removeContactItem(String itemName) {
        // 1. find the index of the grocery item with itemName
        int index = getIndexOfItemByName(itemName);

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            contactItems.remove(index);
        }
    }

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

    public void setPhoneNumber(String phoneNumber) {
        int index = getIndexOfItemByName(String.valueOf(phoneNumber));

        // 2. remove the item in the grocery list at that index
        if(index > -1) {
            ContactItem item = contactItems.get(index);
            item.setPhoneNumber(phoneNumber);
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
