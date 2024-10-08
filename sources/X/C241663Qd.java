package X;

import android.content.Context;

/* renamed from: X.3Qd  reason: invalid class name and case insensitive filesystem */
public final class C241663Qd {
    public static final C241663Qd A01 = new C241663Qd();
    public C241673Qe A00 = null;

    public static C241673Qe A00(Context context) {
        C241673Qe r0;
        C241663Qd r1 = A01;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new C241673Qe(context);
                r1.A00 = r0;
            }
        }
        return r0;
    }
}
