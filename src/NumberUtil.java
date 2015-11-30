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
     * 校验一个字符串能否转成数字
     * 认为是数字包括所有正负整型，正负浮点型，aE(e)b的科学计数，百分数
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
     * @throws IllegalArgumentException
     */
    public int sum(int[] intArray)throws IllegalArgumentException{
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
     * @throws IllegalArgumentException
     */
    public short sum(short[] shortArray)throws IllegalArgumentException{
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
     * @throws IllegalArgumentException
     */
    public long sum(long[] longArray) throws IllegalArgumentException{
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
     * @throws IllegalArgumentException
     */
    public float sum(float[] floatArray) throws IllegalArgumentException{
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
     * @throws IllegalArgumentException
     */
    public double sum(double[] doubleArray) throws IllegalArgumentException{
        double sumNum = 0d;
            for (double i:doubleArray){
                sumNum+=i;
            }
        return  sumNum;
    }

    /**
     * 求平均值
     * @param intArray
     * @return double
     * @throws IllegalArgumentException
     */
    public double avg(int intArray[]) throws IllegalArgumentException{
         double avgNum =0d;
         avgNum = this.toDouble(String.valueOf(this.sum(intArray)))/intArray.length;
         return avgNum;
    }

    /**
     * 求平均值
     * @param shorArray
     * @return double
     * @throws IllegalArgumentException
     */
    public double avg(short shorArray[]) throws IllegalArgumentException{
        double avgNum =0d;
        avgNum = this.toDouble(String.valueOf(this.sum(shorArray)))/shorArray.length;
        return avgNum;
    }

    /**
     * 求平均值
     * @param floatArray
     * @return double
     * @throws IllegalArgumentException
     */
    public double avg(float floatArray[]) throws IllegalArgumentException{
        double avgNum =0d;
        avgNum = this.toDouble(String.valueOf(this.sum(floatArray)))/floatArray.length;
        return avgNum;
    }

    /**
     * 求平均值
     * @param doubleArray
     * @return double
     * @throws IllegalArgumentException
     */
    public double avg(double doubleArray[]) throws IllegalArgumentException{
        double avgNum =0d;
        avgNum = this.sum(doubleArray)/doubleArray.length;
        return avgNum;
    }

    /**
     * 求平均值
     * @param longArray
     * @return double
     * @throws IllegalArgumentException
     */
    public double avg(long longArray[]) throws IllegalArgumentException{
        double avgNum =0d;
        avgNum = this.toDouble(String.valueOf(this.sum(longArray)))/longArray.length;
        return avgNum;
    }

    /**
     * 求最大值
     * @param array
     * @return
     * @throws IllegalArgumentException
     */
    public Number max(Number... array)throws IllegalArgumentException{
        int i = 0;
        Number numTemp = 0;
        for(Number num:array){
            if(i==0){
                numTemp = num;
                i++;
            }else{
                if(numTemp.doubleValue()<num.doubleValue()){
                    numTemp = num;
                }
            }
        }
        return numTemp;
    }
    /**
     * 求最小值
     * @param array
     * @return
     * @throws IllegalArgumentException
     */
    public Number min(Number... array)throws IllegalArgumentException{
        int i = 0;
        Number numTemp = 0;
        for(Number num:array){
            if(i==0){
                numTemp = num;
                i++;
            }else{
                if(numTemp.doubleValue()>num.doubleValue()){
                    numTemp = num;
                }
            }
        }
        return numTemp;
    }
    /**
     * 求和
     * @param array
     * @return
     * @throws IllegalArgumentException
     */
    public Number sum(Number... array)throws IllegalArgumentException{
        double d = 0d;
        for(Number num:array){
           d+=num.doubleValue();
        }
        return d;
    }
    /**
     * 求和
     * @param array
     * @return
     * @throws IllegalArgumentException
     */
    public Number avg(Number... array)throws IllegalArgumentException{
        double d = 0d;
        int i = 0;
        for(Number num:array){
           d+=num.doubleValue();
            i++;
        }
        return d/i;
    }
}
