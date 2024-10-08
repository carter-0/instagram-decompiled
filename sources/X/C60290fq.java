package X;

import android.content.Context;

/* renamed from: X.0fq  reason: invalid class name and case insensitive filesystem */
public final class C60290fq {
    public static 0g3 A00;

    public static synchronized 0g3 A00(Context context) {
        0g3 r0;
        synchronized (C60290fq.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new 0g3(context);
                A00 = r0;
            }
        }
        return r0;
    }
}
