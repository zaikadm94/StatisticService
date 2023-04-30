package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.totalOfAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);


    }

    @Test
    public void averageValue() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.findAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maximumSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 6;
        int actualMonth = service.findMaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 3};
        int expectedMonth = 12;
        int actualMonth = service.findMinSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void aboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantity = 5;
        int actualQuantity = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void lessAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 10};
        int expectedQuantity = 4;
        int actualQuantity = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }
}
