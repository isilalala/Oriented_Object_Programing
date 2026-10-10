public class Bank {
    private BankCust[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new BankCust[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = new BankCust(f, l);
            numberOfCustomers++;
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public BankCust getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}