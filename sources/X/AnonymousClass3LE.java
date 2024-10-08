package X;

import java.util.Locale;

/* renamed from: X.3LE  reason: invalid class name */
public abstract class AnonymousClass3LE {
    public static String A00(long j) {
        return String.format(Locale.getDefault(), "%s.%s", new Object[]{Long.valueOf(j / 1000), Long.valueOf(j % 1000)});
    }
}
