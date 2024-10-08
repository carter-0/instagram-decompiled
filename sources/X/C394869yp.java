package X;

import android.graphics.Rect;

/* renamed from: X.9yp  reason: invalid class name and case insensitive filesystem */
public abstract class C394869yp {
    public static final C39890ADo A00(float f, float f2, float f3, float f4, boolean z) {
        float f5 = f2;
        float f6 = f2 / f3;
        if ((!z || f < 1.0f) && f6 < f) {
            f5 = f3 * f;
        }
        float f7 = f3;
        if ((z && f >= 1.0f) || f6 > f) {
            f7 = f2 / f;
        }
        float f8 = (float) ((int) (f2 / 2.0f));
        float f9 = f5 / 2.0f;
        float f10 = (float) ((int) (f3 / 2.0f));
        float f11 = f7 / 2.0f;
        Rect rect = new Rect((int) (f8 - f9), (int) (f10 - f11), (int) (f8 + f9), (int) (f10 + f11));
        C39890ADo A00 = C39890ADo.A00();
        A00.A0R = false;
        A00.A0Q = false;
        A00.A06 = new C16336Ut6(rect);
        A00.A04 = f4;
        return A00;
    }
}
