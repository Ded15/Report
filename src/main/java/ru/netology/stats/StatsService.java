package ru.netology.stats;


public class StatsService {
    int[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    public int Sum(int[] sales) {
        int month = sales.length;
        int sum = 0;
        for (int j = 0; j < sales.length; j++) {
            sum = sum + sales[j];

        }
        return sum;

    }

    public double AveregeSum(int[] sales) {
        double average = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int MinAveregeSum(long[] sales) {
        double average = 0;
        int sum = 0;
        int minAverege = 0;
        for (int j = 0; j < sales.length; j++) {
            sum += sales[j];
        }
        average = sum / sales.length;
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] < average) {
                minAverege++;
            }
        }
        return minAverege;
    }

    public int MaxAveregeSum(long[] sales) {
        double average = 0;
        int sum = 0;
        int minAverege = 0;
        for (int j = 0; j < sales.length; j++) {
            sum += sales[j];
        }
        average = sum / sales.length;
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] > average) {
                minAverege++;
            }
        }
        return minAverege;
    }
}







