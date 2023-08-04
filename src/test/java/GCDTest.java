import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void testGCD() {
        int expected = 4;
        int actual = GCD.gcd(8,12);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGCD2() {
        int expected = 5;
        int actual = GCD.gcd(40,15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGCD3() {
        int expected = 4;
        int actual = GCD.gcd(56,4);

        Assert.assertEquals(expected, actual);
    }

}