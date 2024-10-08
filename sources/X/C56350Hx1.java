package X;

import android.content.Context;

/* renamed from: X.Hx1  reason: case insensitive filesystem */
public abstract class C56350Hx1 {
    public static final float A00(Context context, GQ0 gq0, float f) {
        float f2;
        float f3;
        if (gq0 != null) {
            f2 = gq0.A05 / ((float) gq0.A07);
        } else {
            f2 = 0.5f;
        }
        float f4 = f2 - 0.5f;
        if (gq0 != null) {
            f3 = (float) gq0.A07;
        } else {
            f3 = 0.0f;
        }
        float f5 = 0.5f * f3;
        float A04 = 0nA.A04(context, 224);
        if (A04 < f5) {
            f5 = A04;
        }
        return (f4 * f3) - (f * f5);
    }

    public static final float A01(GQ0 gq0) {
        float f;
        int i;
        if (gq0 != null) {
            f = gq0.A04 / ((float) gq0.A06);
        } else {
            f = 0.5f;
        }
        float f2 = f - 0.5f;
        if (gq0 != null) {
            i = gq0.A06;
        } else {
            i = 0;
        }
        return f2 * ((float) i);
    }
}
