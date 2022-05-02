package Package;

/**
 *
 * Represents a bank account with its representative features
 *
 * @author Carlos Munoz
 */
public class BankAccount {
    /**
     * Represents the account number
     */
    private final int accountNumber;

    /**
     * Represents if the bank account is activated or not
     */
    protected boolean actived;

    /**
     * Creates an instance of the class banck account
     * @param accountNumber
     * @param activated
     */
    public BankAccount(int accountNumber, boolean activated){
        this.accountNumber = accountNumber;
        this.actived = activated;
    }

    /**
     * Changes the state of the account, is activated or not
     * @param actived
     */
    public void setActived(boolean actived){
        this.actived = actived;
    }

    /**
     * Returns if the bank account is activated or not
     * @return If the account is activated or not
     */
    public boolean isActived() {
        return actived;
    }

    /**
     * Returns the number of the account
     * @return The account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
}
