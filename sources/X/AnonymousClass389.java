package X;

import android.util.Log;

/* renamed from: X.389  reason: invalid class name */
public final class AnonymousClass389 {
    public static final Object A00 = new Object();
    public static volatile AnonymousClass389 A01;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.389, java.lang.Object] */
    public static AnonymousClass389 A00() {
        AnonymousClass389 r0;
        synchronized (A00) {
            if (A01 == null) {
                A01 = new Object();
            }
            r0 = A01;
        }
        return r0;
    }

    public final void A02(String str) {
        Log.w(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
    }

    public static String A01(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }
}
