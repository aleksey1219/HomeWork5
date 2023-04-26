public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Решение задачи №1");
        int clientOS = 5;
        if (clientOS == 1) {
            System.out.println("установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("нет сообщений");
        }
    }

    public static void task2() {
        System.out.println("Решение задачи №2");
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("нет сообщений");
        }
    }

    public static void task3() {
        System.out.println("Решение задачи номер 3");
        int yaer = 2012;
        if (yaer % 4 == 0 && (yaer % 100 != 0) || (yaer % 400 == 0)) {
            System.out.println(yaer + " год является високосным");
        } else {
            System.out.println(yaer + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Решение задачи №4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Решение задачи №5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц Осень");
                break;
            default:
                System.out.println(monthNumber + " такого месяца нет");
        }
    }
}
