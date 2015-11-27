/**
 * Created by Ce Bu on 2015/11/27.
 * @author Ce Bu
 */

/**
 * 实现对字符串的操作
 */
public final class StringUtil {

    /**
     * 判断字符串是""或null
     * @param cs
     * @return 如果是""或null返回true
     */
    public static boolean isEmpty (CharSequence cs) {
        boolean flag = false;
        if( null == cs || cs.length() == 0 ) flag = true;
        return flag;
    }

    /**
     * 判断字符串不是""或null
     * @param cs
     * @return 如果不是""或null返回true
     */
    public static boolean isNotEmpty(CharSequence cs) {
        boolean flag = false;
        if (cs != null && cs.length() > 0 ) flag = true;
        return flag;
    }

}
