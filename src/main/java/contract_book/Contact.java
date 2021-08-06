package contract_book;

public class Contact {
    private String contactName;
    private String phone;

    public Contact() {
    }

    public Contact(String contactName, String phone) {
        this.contactName = contactName;
        this.phone = phone;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
}
