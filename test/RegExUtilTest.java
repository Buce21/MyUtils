import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by ZhaoTao on 2015/11/30.
 */
public class RegExUtilTest {
    private RegExUtil regExUtil;
    @Before
    public void setUp() throws Exception {
        regExUtil = new RegExUtil();
    }

    @Test
    public void testIsCellPhoneNumber() throws Exception {
        assertEquals(regExUtil.isCellPhoneNumber("+8613820720115"),true);
    }

    @Test
    public void testPhoneNumber() throws Exception {
        assertEquals(regExUtil.isPhoneNumber("0318-4690209"),true);
    }

    @Test
    public void testIsIdNumber() throws Exception {
        assertEquals(regExUtil.isIdNumber("13112819921022061X"),true);
    }

    @Test
    public void testIsPostNumber() throws Exception {
        assertEquals(regExUtil.isPostNumber("123456"),true);
    }

    @Test
    public void testIsWord() throws Exception {
        assertEquals(regExUtil.isWord("Hello"),true);
        assertEquals(regExUtil.isWord("Hello1"),false);
    }

    @Test
    public void testIsAllCapital() throws Exception {
        assertEquals(regExUtil.isAllCapital("Hello"),false);
        assertEquals(regExUtil.isAllCapital("HELLO"),true);
    }

    @Test
    public void testIsAllLowercase() throws Exception {
        assertEquals(regExUtil.isAllLowercase("Hello"),false);
        assertEquals(regExUtil.isAllLowercase("hello"),true);
    }

    @Test
    public void testIsChinese() throws Exception {
        assertEquals(regExUtil.isChinese("Hello"),false);
        assertEquals(regExUtil.isChinese("繁體字"),true);
    }

    @Test
    public void testIsURL() throws Exception {
        assertEquals(regExUtil.isURL("Hello"),false);
        assertEquals(regExUtil.isURL("http://www.baidu.com"),true);
        assertEquals(regExUtil.isURL("210.22.22.22"),true);
    }

    @Test
    public void testIsEmailAddres() throws Exception {
        assertEquals(regExUtil.isEmailAddres("zt511sf@qq.com"),true);
    }
}