package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4xn  reason: invalid class name and case insensitive filesystem */
public abstract class C278954xn {
    public static final boolean A00(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            return drawable2 == null;
        }
        if (drawable2 == null) {
            return false;
        }
        if (!(drawable instanceof C262414Dp) || !(drawable2 instanceof C262414Dp)) {
            return drawable.equals(drawable2);
        }
        return ((C262414Dp) drawable).CSn((C262414Dp) drawable2);
    }
}
