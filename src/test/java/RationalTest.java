import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }

    @Test
    public void testSubtract(){
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = 3;

        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 3;

        x.subtract(y);
        Assert.assertEquals(4, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }


    @Test
    public void testMultiply(){
        Rational x = new Rational();
        x.numerator = 7;
        x.denominator = 5;

        Rational y = new Rational();
        y.numerator = 10;
        y.denominator = 3;

        x.multiply(y);
        Assert.assertEquals(14, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    @Test
    public void testDivision(){
        Rational x = new Rational();
        x.numerator = 9;
        x.denominator = 4;

        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;

        x.divide(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    @Test
    public void testEquals() throws Rational.Illegal {
        Rational x = new Rational(6, 9);
        Rational y = new Rational(4, 6);
        Assert.assertEquals(x, y);

        x = new Rational(8, 10);
        y = new Rational(3, 7);
        Assert.assertNotEquals(x, y);
    }

    @Test
    public void testCompare() throws Rational.Illegal {
        Rational x = new Rational(5, 8);
        Rational y = new Rational(10, 16);
        Assert.assertEquals(0, x.compareTo(y));

        x = new Rational(9, 10);
        y = new Rational(2, 5);
        Assert.assertEquals(1, x.compareTo(y));

        x = new Rational(4, 7);
        y = new Rational(5, 7);
        Assert.assertEquals(-1, x.compareTo(y));
    }

    @Test
    public void testToString() throws Rational.Illegal {
        Rational x = new Rational(8, 16);
        String val = x.toString();
        Assert.assertEquals("1/2", val);
    }

}

