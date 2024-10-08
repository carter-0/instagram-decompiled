package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.ReO  reason: case insensitive filesystem */
public abstract class C9644ReO {
    public static final String A00(Locale locale, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(C273654mx.A00(220), locale);
        Date parse = simpleDateFormat.parse(str);
        if (parse != null) {
            String format = simpleDateFormat2.format(parse);
            0qQ.A07(format);
            return format;
        }
        throw AnonymousClass7TE.A0y();
    }
}
