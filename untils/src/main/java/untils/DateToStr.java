package untils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStr {
    public static String DateToString(Date date) {
        //格式异常
        try {
            if (!date.equals(null)) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time = format.format(date);
                return time;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
