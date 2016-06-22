package org.tym.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by tangtomorrow on 16/6/19.
 */
public class DateUtil {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.US);

    /**
     * 格式化时间
     * @param originDate 原始时间字符串，如"Sun May 22 21:37:11 2016"
     * @return 时间戳，如"2016-05-03 13:29:15.0"
     */
    public static Timestamp formatDate(String originDate) throws ParseException {
        long times = 0;
        times = sdf.parse(originDate).getTime();
        return new Timestamp(times);
    }
}
