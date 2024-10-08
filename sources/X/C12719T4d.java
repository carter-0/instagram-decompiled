package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.T4d  reason: case insensitive filesystem */
public final class C12719T4d implements C13962TmP {
    public static final DateFormat A00;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        A00 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        ((C13746TgI) obj2).A7R(A00.format((Date) obj));
    }
}
