package contactsManager;

public class ContactItem {
    private String firstName;
    private String lastName;
    private long phoneNumber;

    public  ContactItem(String firstName, String lastName, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public static ContactItem createFromString(String itemString) {
        String [] parts = itemString.split(" ");
        return new ContactItem(parts[0].trim(), parts[1].trim(), Integer.parseInt(parts[2].trim()));
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

    public int getPhoneNumber() {
        return (int) phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
