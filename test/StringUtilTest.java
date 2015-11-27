import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2015/11/27.
 */
public class StringUtilTest {

    private static StringUtil stringUtil = new StringUtil();

    @Test
    public void isEmptyTest(){
        assertEquals(stringUtil.isEmpty("a"),false);
        assertEquals(stringUtil.isEmpty(null),true);
        assertEquals(stringUtil.isEmpty(""),true);
    }

    @Test
    public void isNotEmptyTest() {
        assertEquals(stringUtil.isNotEmpty("a"),true);
        assertEquals(stringUtil.isNotEmpty(""),false);
        assertEquals(stringUtil.isNotEmpty(null),false);
    }


}
