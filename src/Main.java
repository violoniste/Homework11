import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println();
        System.out.println("task1:");

        int year = 2001;
        if (isLeapYear(year))
            System.out.println(year + " год — високосный год");
        else
            System.out.println(year + " год — невисокосный год");
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2:");

        detectOS(1, 2022);
    }

    public static void detectOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviceYear < currentYear)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Неизвестная операционна система");
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3:");

        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);

        if (days < 0)
            System.out.println("Доставки нет");
        else
            System.out.println("Потребуется дней: " + days);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20)
            return 1;

        if (deliveryDistance <= 60)
            return 2;

        if (deliveryDistance <= 100)
            return 3;

        return -1;
    }
}