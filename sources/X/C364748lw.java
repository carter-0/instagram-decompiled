package X;

import android.graphics.Rect;

/* renamed from: X.8lw  reason: invalid class name and case insensitive filesystem */
public abstract class C364748lw {
    public static final int A00(int i, Rect rect) {
        if (rect == null) {
            return i;
        }
        int i2 = rect.top;
        int i3 = rect.bottom;
        if (i2 < i3) {
            return i3 - i2;
        }
        0kD.A07("TransformMatrixConfigUtil", 002.A0p("Invalid crop top=", " bottom=", " originalHeight=", i2, i3, i), (Throwable) null);
        return i;
    }

    public static final int A01(int i, Rect rect) {
        if (rect == null) {
            return i;
        }
        int i2 = rect.left;
        int i3 = rect.right;
        if (i2 < i3) {
            return i3 - i2;
        }
        0kD.A07("TransformMatrixConfigUtil", 002.A0p("Invalid crop left=", " right=", " originalWidth=", i2, i3, i), (Throwable) null);
        return i;
    }
}
