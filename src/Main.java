public class Main {

    public static void main(String[] args) {
    }
    public static void data (String validateLoginPassword) throws WrongConfirmPasswordException, WrongLoginException, WrongPasswordException {
        try {
            UserRegistrationImpl.validateLoginPassword("any_login", "any_password", "any_password");
        } catch (WrongLoginException e) {
            System.out.println("Логин не верен, регистрация не возможна");
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Пароль не верен, регистрация не возможна");
            System.out.println(e.getMessage());
        } catch (WrongConfirmPasswordException e) {
            System.out.println("Пароль не подтверждён, регистрация не возможна");
            System.out.println(e.getMessage());
        }
    }
}