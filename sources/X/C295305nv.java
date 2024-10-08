package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;

/* renamed from: X.5nv  reason: invalid class name and case insensitive filesystem */
public abstract class C295305nv {
    public static PorterDuff.Mode A01(PorterDuff.Mode mode, int i) {
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

    public static float A00(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }
}
