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
        return !isEmpty(cs);
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
        return !isAnyEmpty(array);
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
        return !isBlank(cs);
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
        return !isAnyBlank(array);
    }

    /**
     * 清除字符串中的空格字符,为null的返回null
     * @param str
     * @return null返回null," "返回""
     */
    public static String trim(String str) {
        if (null == str) {
            return null;
        } else {
            String str2 = str.replaceAll(" ","");
            if (str2.length() > 0) {
                return str2;
            } else {
                return "";
            }
        }
    }
    /**
     * 清除字符串中的空格字符，为null或者由空格字符组成的字符串返回null
     * @param str
     * @return 为null或者由空格字符组成的字符串返回null
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
     * 清除字符串中的null和空格字符,为null的返回""
     * @param str
     * @return 为null的返回""
     */
    public static String trimToEmpty(String str) {
        if (null == str || str.length() == 0) {
            return "";
        } else {
            String str2 = str.replaceAll(" ","");
            if (str2.length() > 0) {
                return str2;
            } else {
                return "";
            }
        }
    }

    /**
     * 判断两个字符串的值是否相等或者字符串长度是否相等
     * @param cs1
     * @param cs2
     * @return 输入"abc","abc"返回true
     */
    public static boolean equalsValueLength(CharSequence cs1,CharSequence cs2) {
        boolean flag = false;
        if (cs1.length() == cs2.length()) {
            flag = true;
        }
        return flag;
    }

    /**
     * 搜索一个字符第一次出现在字符串中的位置
     * @param cs
     * @param c
     * @return 字符为空返回-1
     */
    public static int indexOf(CharSequence cs, char c) {
        return indexOf(cs,c,0);
    }

    /**
     * 搜索字符串中第stratPos位置后searchChar字符第一次出现的位置
     * 输入的参数不在字符串长度的范围返回-1
     * @param cs
     * @param c
     * @param startPos
     * @return
     */
    public static int indexOf(CharSequence cs, char c, int startPos) {
        int flag = -1;
        if (cs.length() < startPos) {
            return flag;
        }
        for (int i = startPos; i < cs.length(); i ++) {
            if (cs.charAt(i) == c) {
                flag = i - startPos;
                break;
            }
        }
        return flag;
    }

    /**
     * 将字符串数组中连续的几个数组元素 转换成含有指定分割符的字符串
     * @param array
     * @param separator
     * @param startIndex
     * @param endIndex
     * @return 输入[null, "", "a"], ",", 0, 3输出,,a
     */
    public static String join(CharSequence[] array, String separator,int startIndex,int endIndex) {
        String str = "";
        for (int i = startIndex; i< endIndex && i < array.length; i ++) {
            if (null == array[i]) {
                array[i] = "";
            }
            str = str + array[i] + separator;
        }
        String newStr =  str.substring(0,str.length()-separator.length());
        return newStr;
    }

    /**
     * 将字符数组转换成含有指定分隔符的字符串
     * @param array
     * @param separator
     * @return
     */
    public static String join(CharSequence [] array, String separator) {
        return join(array, separator, 0, array.length);
    }

    /**
     * 连接所提供的数组的元素为一个字符串,不添加字符串分隔符。Null对象或数组为空字符串返回("")
     * @param array
     * @return
     */
    public static String join(String [] array) {
        if (null == array) {
            return null;
        }
        return join(array,"");
    }

    /**
     * 获取0到len位置之间的字符串,null字符串返回null
     * @param str
     * @param len
     * @return
     */
    public static String left(String str, int len) {
        if (null == str) {
            return null;
        }
        String newStr = str.substring(0, len);
        return newStr;
    }

    /**
     * 获取字符串后len个字符组成的字符串
     * @param str
     * @param len
     * @return
     */
    public static String right(String str, int len) {
        if (null == str) {
            return null;
        }
        String newStr = str.substring(len, str.length());
        return newStr;
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
