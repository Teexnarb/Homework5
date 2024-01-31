public class Main {
    public static void main(String[] args) {
        data();
    }
    public static void data ()  {
        try {
            UserRegistrationImpl.validateLoginPassword("Sky_pro", "any_password", "any_password");
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