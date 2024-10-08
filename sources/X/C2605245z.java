package X;

import java.lang.reflect.Method;

/* renamed from: X.45z  reason: invalid class name and case insensitive filesystem */
public final class C2605245z {
    public static Method A02;
    public final AnonymousClass46A A00;
    public final AnonymousClass46A A01;

    static {
        try {
            A02 = Class.forName("org.slf4j.LoggerFactory").getDeclaredMethod("getLogger", new Class[]{String.class});
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public C2605245z(AnonymousClass46A r1, AnonymousClass46A r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
