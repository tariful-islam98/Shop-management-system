package TableClasses;

public class Customer {

    private String customerName;
    private int contact;
    private String address;

    public Customer() {
    }

    public Customer(String customerName, int contact, String address) {
        this.customerName = customerName;
        this.contact = contact;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerName=" + customerName + ", contact=" + contact + ", address=" + address + '}';
    }

}
