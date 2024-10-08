package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: X.5bX  reason: invalid class name and case insensitive filesystem */
public abstract class C288205bX {
    public static final ColorFilter A00(int i, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C288215bY.A00(i, j);
        }
        return new PorterDuffColorFilter(C285595Rx.A00(j), C288225bZ.A01(i));
    }
}
