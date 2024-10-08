package X;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.3NX  reason: invalid class name */
public abstract class AnonymousClass3NX {
    public static final Rect A00 = new Rect();
    public static final int[] A01 = {16842912};
    public static final int[] A02 = new int[0];

    public static PorterDuff.Mode A00(PorterDuff.Mode mode, int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect A01(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C18410VrC.A00(drawable);
        }
        Insets A002 = C14624TzW.A00(drawable);
        return new Rect(A002.left, A002.top, A002.right, A002.bottom);
    }

    public static void A02(Drawable drawable) {
        int[] iArr;
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                iArr = A01;
            } else {
                iArr = A02;
            }
            drawable.setState(iArr);
            drawable.setState(state);
        }
    }
}
