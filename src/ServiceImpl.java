import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class ServiceImpl implements ServiceInterface {

    public void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int lengthLogin = login.length();
        boolean check2 = (lengthLogin <= 20);

        if (!check2) {
            throw new WrongLoginException("Логин содержит " + lengthLogin + " знаков");
        }

        if (!login.matches(RegExps.LOGIN_REGEXP)) {
            throw new WrongLoginException("Недопустимые знаки в логине, проверьте");
        }

        int lengthPassword = password.length();
        boolean check3 = (lengthPassword <= 20);

        if (!check3) {
            throw new WrongPasswordException("Пароль содержит " + lengthPassword + " знаков");
        }

        if (!password.matches(RegExps.PASSWORD_REGEXP)) {
            throw new WrongPasswordException("Недопустимые знаки в пароле, проверьте");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают, проверьте");
        }
    }
}