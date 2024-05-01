package gr.aueb.cf.ch11.model;

public class Main {

    public static void main(String[] args) {
        User manos = new User(12332313, "Manos", "Daskalelis");
        UserCredentials userManos = new UserCredentials(21223221, "manolis", "dask12");

        System.out.println("{" + manos.getId() + ", " + manos.getFirstname() + ", " + manos.getLastname() + "}" );
        System.out.println("{" + userManos.getId() + ", " + userManos.getUsername() + ", " + userManos.getPassword() + "}" );
    }
}
