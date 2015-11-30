/**
 * Created by ZhaoTao on 2015/11/27.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 数字工具类
 */
public class NumberUtil {
    /**
     *校验一个字符串能否转成数字
     * @param string
     * @return 是数字返回true
     */
    public boolean isNumber(String string){
        Pattern pattern = Pattern.compile("^[+-]?([0-9]*\\.?[0-9]+|[0-9]+\\.?[0-9]*)([eE][+-]?[0-9]+)?%?$");
        Matcher isNum = pattern.matcher(string);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    /**
     * 校验一个字符串能否转成整数
     * 认为是整数的有：正负整数，待l,L的long型数据
     * @param string
     * @return 是整数返回true
     */
    public boolean isIntegerNumber(String string){
        Pattern pattern = Pattern.compile("^[+-]?([1-9][0-9]*)([lL])?$");
        Matcher isInteger = pattern.matcher(string);
        if( !isInteger.matches() ){
            return false;
        }
        return true;
    }

    /**
     * 字符串转int类型
     * @param string
     * @return 转换失败则返回 0
     */
    public Integer toInt(String  string){
        try{
            return Integer.parseInt(string);
        }catch (Exception e){
            return 0;
        }
    }

    /**
     * 字符串转long类型
     * @param string
     * @return 转换失败则返回0l
     */
    public Long toLong(String string){
        try{
            return Long.parseLong(string);
        }catch (Exception e){
            return 0l;
        }
    }

    /**
     * 字符串转Short类型
     * @param string
     * @return 转换失败则返回 short("0")
     */
    public Short toShort(String string){
        try{
            return Short.parseShort(string);
        }catch (Exception e){
            return Short.parseShort("0");
        }
    }

    /**
     * 字符串转Float类型
     * @param string
     * @return 转换失败则返回0.0f
     */
    public Float toFloat(String string){
        try{
            return Float.parseFloat(string);
        }catch (Exception e){
            return 0.0f;
        }
    }

    /**
     * 字符串转double类型
     * @param string
     * @return 转换失败则返回0.0d
     */
    public Double toDouble(String string){
        try{
            return Double.parseDouble(string);
        }catch (Exception e){
            return 0.0d;
        }
    }

    /**
     * 字符串转byte类型
     * @param string
     * @return 转换失败则返回0
     */
    public Byte toByte(String string){
        try{
            return Byte.parseByte(string);
        }catch (Exception e){
            return 0;
        }
    }

    /**
     * 求和
     * @param intArray
     * @return
     */
    public int sum(int[] intArray){
        int sumNum = 0;
        for(int i:intArray){
            sumNum+=i;
        }
        return  sumNum;
    }

    /**
     * 求和
     * @param shortArray
     * @return
     */
    public short sum(short[] shortArray){
        short sumNum = 0;
        for(short i:shortArray){
            sumNum+=i;
        }
        return sumNum;
    }

    /**
     * 求和
     * @param longArray
     * @return
     */
    public long sum(long[] longArray) {
        long sumNum = 0l;
        for (long i : longArray) {
            sumNum += i;
        }
        return sumNum;
    }

    /**
     * 求和
     * @param floatArray
     * @return
     */
    public float sum(float[] floatArray){
        float sumNum = 0f;
        for (float i:floatArray){
            sumNum+=i;
        }
        return sumNum;
    }

    /**
     * 求和
     * @param doubleArray
     * @return
     */
    public double sum(double[] doubleArray){
        double sumNum = 0d;
        for (double i:doubleArray){
            sumNum+=i;
        }
        return  sumNum;
    }
    // TODO: 2015/11/27
    public <T> T avg (T[] t){
        return t[0];
    }
}
