package contactsManager;

public class ContactItem {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public  ContactItem(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public static ContactItem createFromString(String itemString) {
        String [] parts = itemString.split(" ");
        return new ContactItem(parts[0].trim(), parts[1].trim(),parts[2].trim());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
