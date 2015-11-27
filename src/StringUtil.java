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
        if( null == cs || cs.length() == 0 ) flag = true;
        return !flag;
    }

    /**
     * 判断字符数组中含有""字符串或者是null
     * @param array
     * @return 如果字符数组中含有""字符串或者是null返回true
     */
    public static boolean isAnyEmpty(CharSequence ... array) {
        boolean flag = false;
        for (CharSequence cs : array){
            if ( null == cs || cs.length() == 0 ) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * 判断字符数组中不含有""字符串和null
     * @param array
     * @return 如果字符数组中不含有""字符串或者是null返回true
     */
    public static boolean isNoneEmpty(CharSequence ... array) {
        boolean flag = false;
        for (CharSequence cs : array){
            if ( null == cs || cs.length() == 0 ) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    /**
     *判断内容是null或""的字符换或者空格字符串
     * @param cs
     * @return 如果内容是null或""的字符换或者空格字符串，返回false
     */
    public static boolean isBlank(CharSequence cs) {
        boolean flag = false;
        if (null == cs || cs.length() == 0 || isContainsKey(cs,' ')) {
            flag = true;
        }
        return flag;
    }

    /**
     * 判断字符串内容不是null或""或空格
     * @param cs
     * @return
     */
    public static boolean isNotBlank(CharSequence cs) {
        boolean flag = false;
        if (null == cs || cs.length() == 0 || isContainsKey(cs,' ')) {
            flag = true;
        }
        return !flag;
    }

    /**
     * 判断字符串数组中的元素是否为null或""或含有空格字符
     * @param array
     * @return
     */
    public static boolean isAnyBlank(CharSequence... array) {
        boolean flag = false;
        for (CharSequence cs : array) {
            if (null == cs || cs.length() == 0 || isContainsKey(cs,' ')) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * 判断字符串数组中的所有元素都不含有null或者""
     * @param array
     * @return
     */
    public static boolean isNoneBlank(CharSequence... array) {
        boolean flag = false;
        for (CharSequence cs : array) {
            if (null == cs || cs.length() == 0 || isContainsKey(cs,' ')) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    /**
     * 清除字符串中的空格字符，为null或者由空格字符组成的字符串返回null
     * @param str
     * @return
     */
    public static String trimToNull(String str) {
        if (null == str || str.length() == 0) {
            return null;
        } else {
            String str2 = str.replaceAll(" ","");
            if (str2.length() > 0) {
                return str2;
            } else {
                return null;
            }
        }
    }
    /**
     * 判断cs中是都是key
     * @param cs
     * @param key
     * @return 如果cs中是否都是key返回true
     */
    public static boolean isContainsKey(CharSequence cs,char key){
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < cs.length(); i ++) {
            if (cs.charAt(i) == key) {
                count ++;
            }
        }
        if (count == cs.length()){
            flag = true;
        }
        return flag;
    }


}
