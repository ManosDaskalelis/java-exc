package gr.aueb.cf.ch12.bankapp.model;

import gr.aueb.cf.ch12.bankapp.model.JointAccount;

/**
 * This is a  class that includes the {@link JointAccount} instance,
 * {@link #balance}, {@link #iban}, {@link #ssn} and a public API
 * {@link #withdraw(double, String)}
 *
 * @author Manos
 */
public class OverdraftAccount {
    private JointAccount users;
    private double balance;
    private String iban;
    private String ssn;

    /**
     * Default constructor.
     */
    public OverdraftAccount() {
        users = new JointAccount();
    }

    /**
     * Overloaded constructor.
     * @param users         a JointAccount instance.
     * @param balance       the account balance.
     * @param iban          the account's iban.
     * @param ssn           the account's stored ssn.
     */
    public  OverdraftAccount(JointAccount users, double balance, String iban, String ssn) {
        this.users = new JointAccount(users.getId(), users.getFirstname(), users.getLastname(), users.getSsn());
        this.balance = balance;
        this.iban = iban;
        this.ssn = ssn;
    }


    public JointAccount getUsers() {
        return new JointAccount(users.getId(), users.getFirstname(), users.getLastname(), users.getSsn());
    }

    public void setUsers(JointAccount users) {
        this.users = users;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    // Public API.

    /**
     * Withdraws an amount greater than the account's balance
     * if the user's ssn is valid.
     *
     * @param amount        the amount to withdraw.
     * @param ssn           user's ssn.
     * @throws Exception    if user's ssn is not valid.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(users.getSsn())) {
                throw new Exception("Bad ssn");
            }
            balance -= amount;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Returns the balance of the account.
     *
      * @return         the account's balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the account's state in string format.
     *
     * @return
     *          the string-representation of the account's state.
     */
    public String accountToString() {
        return "(" + users.getId() + ", " + balance + ", " + iban + ", " + ssn +")";
    }
}
