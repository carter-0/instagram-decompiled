package X;

import android.os.Build;

/* renamed from: X.Rkm  reason: case insensitive filesystem */
public abstract class C9992Rkm {
    public static final int A00;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        }
        A00 = i;
    }
}
