import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ce Bu on 2015/11/27.
 */
public class StringUtilTest {

    StringUtil stringUtil ;
    @Before
    public void initStringUtil(){
        stringUtil = new StringUtil();
    }
    @Test
    public void isEmptyTest(){
        assertEquals(StringUtil.isEmpty("a"),false);
        assertEquals(StringUtil.isEmpty(null),true);
        assertEquals(StringUtil.isEmpty(""),true);
    }

    @Test
    public void isNotEmptyTest() {
        assertEquals(StringUtil.isNotEmpty("a"),true);
        assertEquals(StringUtil.isNotEmpty(""),false);
        assertEquals(StringUtil.isNotEmpty(null),false);
    }

    @Test
    public void isAnyEmptyTest() {
        assertEquals(StringUtil.isAnyEmpty("rt","aw"),false);
        assertEquals(StringUtil.isAnyEmpty("","rt"),true);
        assertEquals(StringUtil.isAnyEmpty("rt",null),true);
    }

    @Test
    public void isNoneEmptyTest() {
        assertEquals(StringUtil.isNoneEmpty("rt","aw"),true);
        assertEquals(StringUtil.isNoneEmpty("","rt"),false);
        assertEquals(StringUtil.isNoneEmpty("rt",null),false);
    }

    @Test
    public void isBlankTest() {
        assertEquals(StringUtil.isBlank(" he "),false);
        assertEquals(StringUtil.isBlank(null),true);
        assertEquals(StringUtil.isBlank(""),true);
        assertEquals(StringUtil.isBlank(" "),true);
        assertEquals(StringUtil.isBlank("  "),true);
    }

    @Test
    public void isNotBlankTest() {
        assertEquals(StringUtil.isNotBlank(" "),false);
        assertEquals(StringUtil.isNotBlank(null),false);
        assertEquals(StringUtil.isNotBlank(""),false);
        assertEquals(StringUtil.isNotBlank("a"),true);
        assertEquals(StringUtil.isNotBlank(" a"),true);
        assertEquals(StringUtil.isNotBlank("a "),true);
    }

    @Test
    public void isAnyBlankTest() {
        assertEquals(StringUtil.isAnyBlank(" "," we"),true);
    }

    @Test
    public void isNoneBlankTest() {
        assertEquals(StringUtil.isNoneBlank(" "," we"),false);
    }

    @Test
    public void trimToNullTest() {
        assertEquals(StringUtil.trimToNull(""),null);
        assertEquals(StringUtil.trimToNull(null),null);
        assertEquals(StringUtil.trimToNull(" "),null);
        assertEquals(StringUtil.trimToNull("co me"),"come");
    }
    @After
    public void closeStringUtil() {
        stringUtil = null;
    }
}
