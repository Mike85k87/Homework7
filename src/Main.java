public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int salary = 15_000;// размер ежемесячного накопления
        int sum = 0; // инициализация суммы, которую собираемся накопить
        int month = 0; //инициализация месяца
        while (sum <= 2_459_000) {
            sum = sum + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        // Задача 2
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }

        // Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;// население в стране
        int year = 0; //инициализация года
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            int populationBorn = population * 17 / 1000;// количество родившихся
            int populationDead = population * 8 / 1000;// количество умерших
            population = population + populationBorn - populationDead;
            year++;
        }

        // Задача 4
        System.out.println("Задача 4");
        int summa = 15_000; // инициализация суммы, которую собираемся накопить
        int months = 0; //инициализация месяца
        double percent = 0.07 / 12;// ежемесячный процент по накоплению
        while (summa <= 12_000_000) {
            summa = (int) (summa + (summa * percent));
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + summa + " рублей");
        }

        // Задача 5
        System.out.println("Задача 5");
        int summa1 = 15_000; // инициализация суммы, которую собираемся накопить
        int months1 = 1; //инициализация месяца
        for (; summa1 <= 12_000_000; months1++) {
            summa1 = (int) (summa1 + (summa1 * percent));
            if (months1 % 6 == 0) {
                System.out.println("Месяц " + months1 + " Итого " + summa1);
            }
        }
        System.out.println(summa1);

        // Задача 6
        System.out.println("Задача 6");
        int summa6 = 15_000; // инициализация суммы, которую собираемся накопить
        int year6 = 12 * 9;// количество месяцев за 9 лет
        int months6 = 0; //инициализация месяца
        while (months6 <= year6) {
            summa6 = (int) (summa6 + (summa6 * percent));
            months6++;
            if (months6 % 6 == 0) {
                System.out.println("Месяц " + months6 + ", сумма накоплений равна " + summa6 + " рублей");
            }
        }

        // Задача 7
        System.out.println("Задача 7");
        int friday = 2; // инициализировали дату первой пятницы
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        } while (friday <= 31);

        // Задача 8
        System.out.println("Задача 8");
        int yearComet = 0; // года начал пролета кометы
        int currentYear = 2023; //текущий год
        int year200 = currentYear - 200; // задаем предел на 200 лет назад
        int year100 = currentYear + 100; // задаем предел на 100 лет вперед
        while (yearComet <= year100) {
            yearComet = yearComet + 79;
            if (yearComet >= year200 && yearComet <= year100) {
                System.out.println(yearComet);
            }
        }

    }
}