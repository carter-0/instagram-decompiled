package X;

import android.graphics.Color;

/* renamed from: X.A0u  reason: case insensitive filesystem */
public abstract class C39578A0u {
    public static final int A00(C387339m3 r6) {
        0qQ.A0B(r6, 0);
        String str = r6.A00.A01;
        if (str != null) {
            try {
                return 0nH.A04(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(002.A0v("Failed parsing ", r6.A00.A01, " (", str, ')'), e);
            }
        } else if (3 - r6.A01.intValue() != 0) {
            return -1;
        } else {
            return -16777216;
        }
    }
}
