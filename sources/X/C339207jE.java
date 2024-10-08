package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.7jE  reason: invalid class name and case insensitive filesystem */
public abstract class C339207jE {
    public static final void A00(Context context, Typeface typeface, C306386Ly r5, Integer num) {
        Typeface A02;
        if (0oh.A08()) {
            int intValue = num.intValue();
            if (intValue == 0) {
                A02 = 0oh.A02(context);
            } else if (intValue != 1) {
                A02 = 0oh.A00(context);
            } else {
                A02 = 0oh.A01(context);
            }
            r5.A0I(A02);
        } else if (typeface != null) {
            r5.A0I(typeface);
        }
    }
}
