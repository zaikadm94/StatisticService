package ru.netology.stats;

public class StatsService {

    public int totalOfAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int findAverage(int[] sales) {


        return totalOfAllSales(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int minMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int aboveAverageSales(int[] sales) {
        int average = findAverage(sales);
        int countMax = 0;
        for (int sale : sales) {
            if (sale < average) {
                countMax = countMax + 1;
            }
        }
        return countMax;
    }


    public int lessAverageSales(int[] sales) {
        int average = findAverage(sales);
        int countMin = 0;
        for (int sale : sales) {
            if (sale > average) {
                countMin = countMin + 1;
            }
        }
        return countMin;
    }
}