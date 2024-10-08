package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.RiY  reason: case insensitive filesystem */
public abstract class C9859RiY {
    public static final long A00(String str, boolean z) {
        String str2;
        String str3;
        if (str == null) {
            return -1;
        }
        if (z) {
            str2 = "yyyy:MM:dd kk:mm:ss";
        } else {
            str2 = "yyyyMMdd'T'HHmmss.SSS'Z'";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
        if (!z) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        }
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return -1;
        } catch (ParseException e) {
            if (z) {
                str3 = "ExifTimestampUtil_Photo";
            } else {
                str3 = "ExifTimestampUtil_Video";
            }
            0wb.A03(str3, AnonymousClass7TG.A0m(e, "Could not parse date time ", AnonymousClass7TE.A1A()));
            return -1;
        }
    }
}
