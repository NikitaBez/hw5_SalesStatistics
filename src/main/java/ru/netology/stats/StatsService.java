package ru.netology.stats;

public class StatsService {

    // 1. Сумма всех продаж
    public int allAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }


    // 2. Средняя сумма продаж в месяц
    public double averageAmountPerMonth(int[] sales) {
        double count = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[0]);
                count ++;
        }
        return allAmount(sales) / count;
    }


    // 3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
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


    // 4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
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


    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    // int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int belowAverage(int[] sales) {
        int count = 0;
        double calculatedAverage = averageAmountPerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < calculatedAverage)
                count ++;
        }
        return count;
    }


    // 6. Кол-во месяцев, в которых продажи были выше среднего
    // int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int aboveAverage(int[] sales) {
        int count = 0;
        double calculatedAverage = averageAmountPerMonth(sales);
        for (int i = 0; i > sales.length; i++) {
            if (sales[i] < calculatedAverage)
                count ++;
        }
        return count;
    }
}
