package core.basesyntax;

public class UserService {

    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            UserService userService = new UserService();
            userService.saveUser(user);
        } catch (Exception e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
