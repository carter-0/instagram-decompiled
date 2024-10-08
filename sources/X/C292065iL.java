package X;

import android.os.Build;

/* renamed from: X.5iL  reason: invalid class name and case insensitive filesystem */
public abstract class C292065iL {
    public static final int A00(int i) {
        if (i != 2) {
            return 0;
        }
        if (Build.VERSION.SDK_INT <= 32) {
            return 2;
        }
        return 4;
    }
}
