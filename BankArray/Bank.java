
public class Bank {
    private Customer[] customers;
    private int numberOfCustomers = 0;
    public Bank() {
        customers = new Customer[10];
    }
    public void addCustomer(String firstName, String lastName) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = new Customer(firstName, lastName);
            numberOfCustomers++;
        }
    }
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }
    public Customer getCustomer(int index) {
        return customers[index];
    }
}