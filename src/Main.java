// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        // INSTANCE OF ID and Passwords class
        IDandPasswords idandPasswords   = new IDandPasswords();

        // get login info
        idandPasswords.getLoginInfo();

        // INSTANCE OF WelcomePage class
        LoginSystem loginSystem         = new LoginSystem(idandPasswords.getLoginInfo());

    }
}