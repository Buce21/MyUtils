import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZhaoTao on 2015/11/30.
 */
public class NumberUtilTest {
private NumberUtil numberUtil;
    @Before
    public void setUp() throws Exception {
        numberUtil = new NumberUtil();
    }

    @Test
    public void testIsNumber() throws Exception {

    }

    @Test
    public void testIsIntegerNumber() throws Exception {

    }

    @Test
    public void testToInt() throws Exception {

    }

    @Test
    public void testToShort() throws Exception {

    }

    @Test
    public void testToFloat() throws Exception {

    }

    @Test
    public void testSum() throws Exception {
        System.out.println(numberUtil.sum(new int[]{99999999,999999999,999999999}));
        System.out.println(numberUtil.sum(1,33));
    }

    @Test
    public void testAvg() throws Exception {
        System.out.println(numberUtil.avg(new int[]{1,2,3}));
        System.out.println(numberUtil.avg(1,3,4));
    }

    @Test
    public void testMax() throws Exception {
        System.out.println(numberUtil.max(1,2,3,5,2.0));
    }

    @Test
    public void testMin() throws Exception {
        System.out.println(numberUtil.min(1,2,3,5,2.0));
    }
}