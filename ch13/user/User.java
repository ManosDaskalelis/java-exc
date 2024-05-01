package gr.aueb.cf.ch13.user;

/**
 * This class is a Javabean that includes the {@link #id},
 * {@link #firstname}, {@link #lastname} and a public API {@link #userToString()}
 * of a {@link User}.
 *
 * @author Manos.
 */
public class User {
    private long id;
    private String firstname;
    private String lastname;

    /**
     * This is a <b>default constructor</b>.
     * It creates a default {@link User} instance.
     */
    public User(){

    }

    /**
     * This is an <b>overloaded constructor</b> of
     * the {@link User} instance.
     *
     * @param id            the user's id.
     * @param firstname     the user's first name.
     * @param lastname      the user's last name.
     */
    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets back the {@link #id} of the instance.
     * It is associated with a setter {@link #setId(long)}
     *
     * @see #setId;
     *
     * @return
     *          the id of the related instance.
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets back the {@link #firstname} of the instance.
     * It is associated with a setter {@link #firstname}
     *
     * @see #firstname;
     *
     * @return
     *          the firstname of the related instance.
     */
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets back the {@link #lastname} of the instance.
     * It is associated with a setter {@link #lastname}
     *
     * @see #lastname;
     *
     * @return
     *          the lastname of the related instance.
     */
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Prints the state of the {@link User} class
     * @return
     *          the state of the class.
     */
    public String userToString() {
        return "(" + id + ", " + firstname + ", " + lastname + ")";
    }
}
