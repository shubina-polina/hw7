public class Main {
    public static void main(String[] args) {

// задания 1
                int salary = 15000;
                int total = 0;
                int mount = 0;
                for (; total < 2_459_000; mount += 1) {
                    total = salary + total + (total / 100);


                    System.out.println("Месяц " + mount + ", сумма накоплений равна " + total + " рублей");
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
                int birthRate = (12_000_000 / 1000) * 17;
                int mortality = (12_000_000 / 1000) * 8;
                int population1 = birthRate - mortality;
                int year = 2024;
                while (year < 2034) {
                    population1 = population + population1;
                    year = year + 1;

                    System.out.println("Год " + year + ", численность населения составляет " + population1);
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
                for (int fr = 1; fr < 31; fr += 7) {
                    System.out.println("Сегодня пятница, " + fr + " число. Необходимо подготовить отчет.");
                }

                // задача 8
                int year1 = 2024 - 200;
                int year2 = 2024 + 100;

                for (int year3 = year1; year3 < year2; year3++) {
                    if (year3 % 79 == 0) {
                        System.out.println(year3);
                    }
                }
            }
        }


