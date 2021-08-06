package hw7;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            System.out.println("Введите \"1\" для получения погоды на сегодня;" +
                    "Введите \"5\" для прогноза на 5 дней; Для выхода введите \"0\":");
            String command = scanner.nextLine();
//            if (command.equals("1") || command.equals("5") || command.equals("0")) {
//                command = scanner.nextLine();
//            } else {
//                System.out.println("Введите число: \"1\", или  \"5\", или \"0\". Другие данные не допустимы!");
//            }

            //TODO* Сделать метод валидации пользовательского ввода

            if (command.equals("0")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
