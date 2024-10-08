package X;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* renamed from: X.TqL  reason: case insensitive filesystem */
public abstract class C14126TqL {
    public static final void A00(int i, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            C14127TqM.A00(i, paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C288225bZ.A01(i)));
        }
    }
}
