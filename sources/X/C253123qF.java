package X;

import android.os.Build;

/* renamed from: X.3qF  reason: invalid class name and case insensitive filesystem */
public abstract class C253123qF {
    public static final C253133qG A00;

    static {
        C253133qG r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            r0 = null;
        } else if (i >= 32) {
            r0 = C39614A2e.A00;
        } else if (i >= 31) {
            r0 = AnonymousClass58V.A00;
        } else if (i >= 30) {
            r0 = AnonymousClass50P.A00;
        } else if (i >= 29) {
            r0 = C274024na.A00;
        } else {
            r0 = C39613A2d.A00;
        }
        A00 = r0;
    }
}
