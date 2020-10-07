import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderlimit() {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount,registered);


        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateNotRegisteredAndUnderlimit() {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount,registered);


        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndOverlimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount,registered);


        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNotRegisteredAndOverlimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount,registered);


        assertEquals(expected, actual);
    }
}