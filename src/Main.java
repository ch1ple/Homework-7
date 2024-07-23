public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int savings = 15000;
        int totalSavings = 0;
        int monthNumber = 0;
        while (totalSavings <= 2459000) {
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + totalSavings + " рублей");
            monthNumber = monthNumber + 1;
            totalSavings = totalSavings + savings;
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int numbers = 1;
        while (numbers <= 10) {
            System.out.print(numbers + " ");
            numbers = numbers + 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        int countryY = 12_000_000;
        float birthRate = (float) 17 / 1000;
        float deathRate = (float) 8 / 1000;
        for (int i = 1; i <= 10; i++) {
            countryY = (int) (countryY + countryY * birthRate - countryY * deathRate);
            System.out.println("Год " + i + ", численность населения составляет " + countryY);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int amountOfSavings = 15_000;
        int monthNumber = 1;
        while (amountOfSavings <= 12_000_000) {
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + amountOfSavings + " рублей");
            amountOfSavings = amountOfSavings + amountOfSavings * 7 / 100;
            monthNumber = monthNumber + 1;
        }
        System.out.println("Для накопения 12-ти миллионов рублей потребуется " + monthNumber + " месяцев");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int amountOfSavings = 15_000;
        int monthNumber = 1;
        while (amountOfSavings <= 12_000_000) {
            amountOfSavings = amountOfSavings + amountOfSavings * 7 / 100;
            monthNumber = monthNumber + 1;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + amountOfSavings + " рублей");
            }
        }
        System.out.println("Для накопения 12-ти миллионов рублей потребуется " + monthNumber + " месяцев");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int amountOfSavings = 15_000;
        int monthNumber = 1;
        int totalMonthNumber = 9 * 12;
        for (; totalMonthNumber > 1; totalMonthNumber = totalMonthNumber - 1) {
            amountOfSavings = amountOfSavings + amountOfSavings * 7 / 100;
            monthNumber = monthNumber + 1;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + amountOfSavings + " рублей");
            }
        }
        System.out.println("За 9 лет сумма накоплений при вкладе 15000 рублей под 7% месячных составит " + amountOfSavings + " рублей");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 5;
        for (; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int currentYear200 = currentYear - 201;
        int currentYear100 = currentYear + 101;
        for (int i = 0; i < currentYear100; i++) {
            if (i % 79 == 0 && i > currentYear200 && i < currentYear100) {
                System.out.println(i);
            }
        }
    }
}