/**
 * Created by ZhaoTao on 2015/12/1.
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 */
public class DateTimeUtil {
    /**
     * 获取参数日期的下一天
     * @param date
     * @return dt.plusDays(1).toDate();
     */
    public Date nextDay(Date date){
        Calendar calendar   =   new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime();   //这个时间就是日期往后推一天的结果
        return date;
    }

    /**
     * 获取参数日期的前一天
     * @param date
     * @return dt.plusDays(-1).toDate();
     */
    public Date lastDay(Date date){
        Calendar calendar   =   new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime();   //这个时间就是日期往后推一天的结果
        return date;
    }

    /**
     * 获取昨天的日期
     * @return DateTime().plusDays(-1).toDate()
     */
     public Date yesterday(){
         Date date = new Date();
        Calendar calendar   =   new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime();   //这个时间就是日期往后推一天的结果
        return date;
    }

    /**
     * 获取明天时间
     * @return
     */
    public Date tomorrow(){
        Date date = new Date();
        return this.nextDay(date);
    }

    /**
     * 在当前时间之后
     * @param date
     * @return
     */
    public boolean isAfterNow(Date date){
        Date today = new Date();
        return date.after(today);
    }

    /**
     * 在当前时间之前
     * @param date
     * @return
     */
    public boolean isBeforeNow(Date date){
        Date today = new Date();
        return date.before(today);
    }

    /**
     * Calendar to Date
     * @param calendar
     * @return
     */
    private static Date clearToDay(Calendar cal) {
        int y = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int d = cal.get(Calendar.DAY_OF_MONTH);
        cal.clear();
        cal.set(y, m, d);
        return cal.getTime();
    }

}
