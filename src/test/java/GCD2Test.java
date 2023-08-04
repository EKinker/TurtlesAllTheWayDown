import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GCD2Test {

    @Test
    void testGCD() {
        int expected = 4;
        int actual = GCD2.gcd2(8,12);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGCD2() {
        int expected = 5;
        int actual = GCD2.gcd2(40,15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGCD3() {
        int expected = 4;
        int actual = GCD2.gcd2(56,4);

        Assert.assertEquals(expected, actual);
    }

}