package gr.aueb.cf.ch12.bankapp.model;

/**
 * This class is a Javabean that includes {@link #id},
 * {@link #firstname}, {@link #lastname}, {@link #ssn} and a public API
 * {@link #jointAccountToString()}
 *
 * @author Manos
 */
public class JointAccount {
    private int id;
    private String firstname;
    private String lastname;
    private String ssn;

    /**
     * This is the <b>default constructor</b>.
     * It creates a default {@link JointAccount} instance.
     */
    public JointAccount(){

    }

    /**
     * This is the <b>overloaded constructor</b>.
     * It creates a {@link JointAccount} instance.
     *
     * @param id                a user's id.
     * @param firstname         a user's firstname.
     * @param lastname          a user's lastname.
     * @param ssn               a user's ssn.
     */
    public JointAccount(int id, String firstname, String lastname, String ssn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String jointAccountToString() {
        return "(" + id + ", " + firstname + ", " + lastname + ", " + ssn +  ")";
    }
}
