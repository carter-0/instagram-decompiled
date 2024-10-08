package X;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.KzD  reason: case insensitive filesystem */
public abstract class C63564KzD {
    public static final SimpleDateFormat A00;
    public static final LinkedHashMap A01 = AnonymousClass7TE.A1H();
    public static final C61410nE A02 = C61410nE.A00;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        A00 = simpleDateFormat;
    }
}
