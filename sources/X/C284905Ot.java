package X;

import android.os.Looper;

/* renamed from: X.5Ot  reason: invalid class name and case insensitive filesystem */
public abstract class C284905Ot {
    public static final long A00;
    public static final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C284915Ou.A00);

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        A00 = j;
    }
}
