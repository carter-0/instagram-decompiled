package X;

import android.os.Build;

/* renamed from: X.45o  reason: invalid class name and case insensitive filesystem */
public abstract class C2604145o {
    public static final boolean A00() {
        AnonymousClass0eM r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            r0 = C247933h9.A01;
        } else if (i != 33) {
            return false;
        } else {
            r0 = C247933h9.A02;
        }
        if (((Boolean) r0.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }
}
