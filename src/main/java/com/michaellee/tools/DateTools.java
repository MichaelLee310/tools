package com.michaellee.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {


    /**
     * 计算指定日期 {@param gap} 天后的日期
     * @param date 指定日期，格式为 "yyyyMMdd"
     * @param gap
     * @return 
     * @throws Throwable
     */
    public static String daysAfter(String date, int gap) throws Throwable {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(new Date(dateFormat.parse(date).getTime() + 86400000L * gap));
    }

}
