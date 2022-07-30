package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTests {

        // 1. Сумма всех продаж
    @Test
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumAllSales = 180;
        int actualSumAllSales = service.allAmount(sales);

        Assertions.assertEquals(expectedSumAllSales, actualSumAllSales);
    }

        // 2. Средняя сумма продаж в месяц
    @Test
    public void shouldFindAverageAmountPerMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageAmountPerMount = 15;
        double actualAverageAmountPerMount = service.averageAmountPerMonth(sales);

        Assertions.assertEquals(expectedAverageAmountPerMount, actualAverageAmountPerMount);
    }

        // 3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }


    // 4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldFindMonthBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthBelowAverage = 5;
        int actualMonthBelowAverage = service.belowAverage(sales);

        Assertions.assertEquals(expectedMonthBelowAverage, actualMonthBelowAverage);
    }


    // 6. Кол-во месяцев, в которых продажи были выше среднего
    @Test
    public void shouldFindMonthAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthAboveAverage = 5;
        int actualMonthAboveAverage = service.belowAverage(sales);

        Assertions.assertEquals(expectedMonthAboveAverage, actualMonthAboveAverage);
    }

}
