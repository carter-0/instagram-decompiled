package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.8kU  reason: invalid class name and case insensitive filesystem */
public abstract class C363878kU {
    public static final AnonymousClass0vF A00;
    public static final C363888kV A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.8kV, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.A02 = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US);
        A01 = obj;
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "RequestDisplayRotation";
        A00 = new AnonymousClass0vF(A002);
    }

    public static String A00(long j) {
        String format;
        C363888kV r8 = A01;
        synchronized (r8) {
            format = r8.A02.format(new Date(j));
            if (j / 1000 == r8.A01 / 1000) {
                int i = r8.A00 + 1;
                r8.A00 = i;
                format = 002.A0b(format, "_", i);
            } else {
                r8.A01 = j;
                r8.A00 = 0;
            }
        }
        return format;
    }
}
