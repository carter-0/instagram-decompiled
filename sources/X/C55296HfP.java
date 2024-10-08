package X;

import android.os.Build;

/* renamed from: X.HfP  reason: case insensitive filesystem */
public abstract class C55296HfP {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 34) {
            z = true;
        }
        A00 = z;
    }
}
