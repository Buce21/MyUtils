import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by ZhaoTao on 2015/12/1.
 */
public class DateTimeUtilTest {
    DateTimeUtil dateTimeUtil;
    @Before
    public void setUp() throws Exception {
        dateTimeUtil = new DateTimeUtil();
    }

    @Test
    public void testNextDay() throws Exception {
        String dateStr = "2010-06-30 12:34:23";
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = df.parse(dateStr);
        date = dateTimeUtil.nextDay(date);
        System.out.println(df.format(date));
    }

    @Test
    public void testYesterday() throws Exception {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = dateTimeUtil.yesterday();
        System.out.println(df.format(date));
    }

    @Test
    public void testIsAfterNow() throws Exception {
        String dateStr = "2015-012-30 12:34:23";
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = df.parse(dateStr);
        System.out.println(dateTimeUtil.isAfterNow(date));
    }

    @Test
    public void testTomorrow() throws Exception {
        System.out.println(dateTimeUtil.tomorrow());
    }
}