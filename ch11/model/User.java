package gr.aueb.cf.ch11.model;

/**
 * User JavaBean.
 * Data class + default constructor/Overloaded Constructor + setters/getters.
 */
public class User {
    private long id;
    private String firstname;
    private String lastname;

    /**
     * Default constructor.
     */
    public User() {

    }

    /**
     * Overloaded Constructor.
     * @param id                user's id.
     * @param firstname         user's name.
     * @param lastname          user's lastname.
     */
    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Setters and Getters
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
