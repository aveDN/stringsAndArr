package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int aver = 0;
        for (int i = 0; i < sales.length; i++) {
            aver = aver + sales[i];
        }
        aver = aver / sales.length;
        return aver;
    }

    public int belowAverage(int[] sales) {
        int average = averageSales(sales);
        int below = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                below = below + 1;
            }
        }
        return below;
    }

    public int aboveAverage(int[] sales) {
        int average = averageSales(sales);
        int above = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                above = above + 1;
            }
        }
        return above;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

}