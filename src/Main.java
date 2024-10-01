public class Main {
    public static void main(String[] args) {

// задания 1
        int savings = 2_459_000;
        int sum = 0;
        int deposit = 15_000;
        double pro = 1D / 100;
        int mount1 = 0;
        while (sum < savings) {
            sum += deposit;
            sum = (int) (sum * (1 + pro));
            mount1++;

            System.out.println("Месяц " + mount1 + ", сумма накоплений равна " + sum + " рублей");
        }
        // задача 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i);

        }
        System.out.println();
        // задача 3
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int referenceYear = 2024;
        for (int year = referenceYear; year < referenceYear + 10; year++) {

            population += population * +birthRate / 1000 - population * mortality / 1000;

            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        // задача 4
        double money = 15000;
        int i1 = 0;
        double percent = 0.07;
        int all = 12_000_000;
        while (money < all) {
            i1 = i1 + 1;
            money = money + money * percent;
            System.out.println("Сумма " + money + " ,количество месяцев " + i1);

        }
        // задача 5
        double money1 = 15000;
        double percent1 = 0.07;
        int al1l = 12_000_000;
        int month1 = 6;
        for (int i2 = 0; money1 <= al1l; i2++) {
            money1 = money1 + money1 * percent1;
            if (i2 % month1 == 0) {
                System.out.println("Сумма " + money1 + " ,количество месяцев " + i2);
            }
        }
        // задача 6
        double money2 = 15000;
        int month3 = 6;
        int years = 9;
        int allMonth = years * 12;
        double percent2 = 0.07;
        for (int i3 = 0; i3 <= allMonth; i3++) {
            money2 = money2 + money2 * percent2;
            if (i3 % month3 == 0) {
                System.out.println("Сумма " + money2 + " ,количество месяцев " + i3);
            }
        }
        //задача 7
        int firstFriday = 2;
        for (int day = firstFriday; day < 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        // задача 8
        int period = 79;
        int observation = 0;
        int start = referenceYear - 200;
        int end = referenceYear + 100;

        for (int year1 = observation; year1 < end; year1 += period) {
            if (year1 > start) {
                System.out.println(year1);
            }
        }
    }
}


