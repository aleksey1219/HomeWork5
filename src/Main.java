public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        int yaer = 2018;
        if (yaer % 4 == 0) {
            if ((yaer % 100 != 0) || (yaer % 400 == 0)) {
                System.out.println(yaer + " год является високосным");
            }
        } else {
            System.out.println(yaer + " год не является високосным");
        }
    }
}