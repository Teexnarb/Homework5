public class userRegistered {
    private static String login;
    private static String password;
    private static String confirmPassword;

    public userRegistered(String login, String password, String confirmPassword) {
        userRegistered.login = login;
        userRegistered.password = password;
        userRegistered.confirmPassword = confirmPassword;
    }

    public static String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        userRegistered.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        userRegistered.password = password;
    }
    public static String getConfirmPassword() {
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        userRegistered.confirmPassword = confirmPassword;
    }
}
