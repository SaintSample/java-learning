package app.kzolotarev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");

        String login = scanner.nextLine();

        switch (login) {
            case "qwerty":
                System.out.println("Недопустимая комбинация символов");
                break;
            case "admin":
                System.out.print("Введите пароль администратора: ");

                if (scanner.nextLine().equals("admin")) {
                    System.out.println("Вы вошли как администратор");
                } else {
                    System.out.println("Неверный пароль администратора!");
                }

                break;
            default:
                System.out.print("Неизветный логин пользователя");
        }
    }
}
