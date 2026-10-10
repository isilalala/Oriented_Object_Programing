public class BankCust {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public BankCust(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(BankAccount acct) {
        account = acct;
    }

    public BankAccount getAccount() {
        return account;
    }
}
