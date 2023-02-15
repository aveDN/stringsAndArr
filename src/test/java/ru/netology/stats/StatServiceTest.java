package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatServiceTest {
    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum,actualSum);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage,actualAverage);
    }

    @Test
    public void shouldFindBelowAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelow = 5;
        int actualBelow = service.belowAverage(sales);

        Assertions.assertEquals(expectedBelow,actualBelow);
    }
    @Test
    public void shouldFindAboveAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAbove = 5;
        int actualAbove = service.aboveAverage(sales);

        Assertions.assertEquals(expectedAbove,actualAbove);
    }
    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax,actualMax);
    }
    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 9;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin,actualMin);
    }
}
