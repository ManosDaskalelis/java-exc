package gr.aueb.cf.ch11.model;

/**
 * UserCredentials JavaBean.
 * Data class + default constructor/Overloaded Constructor + setters/getters.
 */
public class UserCredentials {
    private long id;
    private String username;
    private String password;

    /**
     * Default constructor.
     */
    public UserCredentials() {

    }

    /**
     * Overloaded Constructor.
     * @param id        users id.
     * @param username      user's account name.
     * @param password      user's password.
     */
    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Setters and Getters.
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
