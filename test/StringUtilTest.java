import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ce Bu on 2015/11/27.
 */
public class StringUtilTest {



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

    @Test
    public void testTrim() throws Exception {
        assertEquals(StringUtil.trim(""),"");
        assertEquals(StringUtil.trim(null),null);
        assertEquals(StringUtil.trim("co me"),"come");
    }

    @Test
    public void testTrimToEmpty() throws Exception {
        assertEquals(StringUtil.trimToEmpty(null),"");
        assertEquals(StringUtil.trimToEmpty("co me"),"come");
    }

    @Test
    public void testEqualsValueLength() throws Exception {
        assertEquals(StringUtil.equalsValueLength("abc","bcd"),true);
    }

    @Test
    public void testIndexOf() throws Exception {
        assertEquals(StringUtil.indexOf("abc",'c'),2);
        assertEquals(StringUtil.indexOf("abc",'d'),-1);
    }

    @Test
    public void testIndexOf1() throws Exception {
        assertEquals(StringUtil.indexOf("banana",'a',5),0);
        assertEquals(StringUtil.indexOf("banana",'a',6),-1);
    }

    @Test
    public void testJoin() throws Exception {
        CharSequence[] charSequences = {null, "", "a"};
        assertEquals(StringUtil.join(charSequences,","),",,a");
    }

    @Test
    public void testJoin1() throws Exception {
        CharSequence[] charSequences = {null, "", "a"};
        assertEquals(StringUtil.join(charSequences,","),",,a");
    }

    @Test
    public void testJoin2() throws Exception {
        String[] strings = {"ab","cd","",null};
        assertEquals(StringUtil.join(strings),"abcd");
    }

    @Test
    public void testLeft() throws Exception {
        assertEquals(StringUtil.left("abcde",2),"ab");
    }

    @Test
    public void testRight() throws Exception {
        assertEquals(StringUtil.right("abcde",2),"cde");
    }
}
