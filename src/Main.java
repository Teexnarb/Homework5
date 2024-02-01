public class Main {
    public static void main(String[] args) {
        data();

    }
    public static void data () {
        try {
            UserRegistrationImpl.validateLoginPassword("Sky_pro", "any_password", "any_password");
        } catch (WrongLoginException | WrongPasswordException | WrongConfirmPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}