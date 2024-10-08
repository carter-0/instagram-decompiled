package X;

import android.os.Build;

/* renamed from: X.0Do  reason: invalid class name */
public abstract class AnonymousClass0Do {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 30) {
            z = true;
        }
        A00 = z;
    }
}
