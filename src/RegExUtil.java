/**
 * Created by ZhaoTao on 2015/11/30.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式工具类
 */
public class RegExUtil {
    /**
     * 校验一个字符串是不是手机号码
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isCellPhoneNumber(String string){
        Pattern pattern = Pattern.compile("^((\\+86)|(86))?1[3|4|5|7|8][0-9]{9}$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    /**
     * 校验一个字符串是不是电话号码
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isPhoneNumber(String string){
        Pattern pattern = Pattern.compile("^0[0-9]{2,3}-?[0-9]{7,8}$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    /**
     * 校验一个字符串是不是身份证号码
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isIdNumber(String string){
        Pattern pattern = Pattern.compile("^(\\d{15})|(\\d{17}[\\d|x|X])$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    /**
     * 检验一个字符串是不是邮政编码
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isPostNumber(String string){
        Pattern pattern = Pattern.compile("^[1-9][0-9]{5}$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    /**
     * 判断字符串是否全部由大小写字母组成
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isWord(String string){
        Pattern pattern = Pattern.compile("^([a-z]|[A-Z])+$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    /**
     * 判断字符串是否全部由大写字母组成
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isAllCapital(String string){
        Pattern pattern = Pattern.compile("^([A-Z])+$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    /**
     * 判断字符串是否全部由小写字母组成
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isAllLowercase(String string){
        Pattern pattern = Pattern.compile("^([a-z])+$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    /**
     * 判断一个字符串是不是汉字
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isChinese(String string){
        Pattern pattern = Pattern.compile("^[\\u4e00-\\u9fa5]+$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    /**
     * 判断一个字符串是不是简单的网址
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isURL(String string){
        Pattern pattern = Pattern.compile("^(((file|gopher|news|nntp|telnet|http|ftp|https|ftps|sftp)://)|(www\\.)?)+(([a-zA-Z0-9\\._-]+\\.[a-zA-Z]{2,6})|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(/[a-zA-Z0-9\\&%_\\./-~-]*)?$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    /**
     * 判断一个字符串是不是EmailAddres
     * @param string
     * @return 如果是返回true如果不是返回false
     */
    public boolean isEmailAddres(String string){
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }


}
