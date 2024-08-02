import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        ServiceImpl service = new ServiceImpl();

        try {
            service.check("java_skypro_goЫ", "D_1hWi_9Ы", "D_1hWi_9");
            System.out.println("Успешно(но это не точно)!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Работа метода service закончена");
        }
    }
}
