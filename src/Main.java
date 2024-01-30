public class Main {
    public static void main(String[] args) {
        try {
            boolean validateLoginPassword = UserRegistrationImpl.validateLoginPassword(userRegistered.getLogin(), userRegistered.getPassword(), userRegistered.getConfirmPassword());
            if (validateLoginPassword) {
                System.out.println("Регистрация прошла успешно");
            }
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