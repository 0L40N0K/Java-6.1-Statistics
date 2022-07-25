import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    long[] allPurchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumAllSales() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.findSum(allPurchases);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalMonth() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.findAverage(allPurchases);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.findMax(allPurchases);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.findMin(allPurchases);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthUnderAverage() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.underAverage(allPurchases);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void monthOverAverage() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.underAverage(allPurchases);

        Assertions.assertEquals(expected, actual);
    }
}