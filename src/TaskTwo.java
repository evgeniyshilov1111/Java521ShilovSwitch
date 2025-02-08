import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        // todo Задача 2*: Выбор действия в зависимости от числа
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Введите номер действия (1-12): ");
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("Выбранное действие: получение всех данных");
                break;
            case 2:
                System.out.println("Выбранное действие: удаление всех данных");
                break;
            case 3:
                System.out.println("Выбранное действие: сохранение данных");
                break;
            case 4:
                System.out.println("Выбранное действие: сортировка данных");
                break;
            case 5:
                System.out.println("Выбранное действие: фильтрация данных");
                break;
            case 6:
                System.out.println("Выбранное действие: получение данных по номеру");
                break;
            case 7:
                System.out.println("Выбранное действие: удаление данных по номеру");
                break;
            case 8:
                System.out.println("Выбранное действие: бронирование номера");
                break;
            case 9:
                System.out.println("Выбранное действие: снятие номера по брони");
                break;
            case 10:
                System.out.println("Выбранное действие: оплата номера");
                break;
            case 11:
                System.out.println("Выбранное действие: возврат по номеру");
                break;
            case 12:
                System.out.println("Выбранное действие: написать в техподдержку");
                break;
            default:
                System.out.println("неверный номер");
        }
    }
}
