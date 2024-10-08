package X;

import android.os.Build;

/* renamed from: X.18o  reason: invalid class name */
public abstract class AnonymousClass18o {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 31) {
            z = true;
        }
        A00 = z;
    }
}
