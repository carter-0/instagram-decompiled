package X;

import android.graphics.Color;

/* renamed from: X.5FE  reason: invalid class name */
public abstract class AnonymousClass5FE {
    public static int A00(int i) {
        int A05 = 2eL.A05(i, -1);
        int red = (int) ((((float) Color.red(A05)) * 0.2126f) + (((float) Color.green(A05)) * 0.7152f) + (((float) Color.blue(A05)) * 0.0722f));
        if (red < 0) {
            return 0;
        }
        if (red > 255) {
            return 255;
        }
        return red;
    }
}
