package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: X.RRn  reason: case insensitive filesystem */
public abstract class C9162RRn {
    public static ColorFilter A00(Integer num, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object A00 = C9163RRo.A00(num);
            if (A00 != null) {
                return C16759V4s.A00(A00, i);
            }
            return null;
        }
        PorterDuff.Mode A002 = C9164RRp.A00(num);
        if (A002 != null) {
            return new PorterDuffColorFilter(i, A002);
        }
        return null;
    }
}
