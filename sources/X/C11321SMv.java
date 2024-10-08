package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.SMv  reason: case insensitive filesystem */
public abstract class C11321SMv {
    public static final ThreadLocal A00 = new TRJ();
    public static final TRN A01 = new TRN();
    public static final ThreadLocal A02 = new TRI();

    public static final void A01(Rect rect, int i, int i2, int i3, int i4) {
        0qQ.A0B(rect, 0);
        if (i > i2) {
            int i5 = i2;
            i2 = i;
            i = i5;
        }
        if (i3 > i4) {
            int i6 = i4;
            i4 = i3;
            i3 = i6;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = (float) i;
        float f4 = (float) i2;
        if (f / f2 > f3 / f4) {
            int i7 = (i3 - ((int) (f3 * (f2 / f4)))) / 2;
            rect.set(i7, 0, i3 - i7, i4);
            return;
        }
        int i8 = (i4 - ((int) (f4 * (f / f3)))) / 2;
        rect.set(0, i8, i3, i4 - i8);
    }

    public static final Matrix A00(int i, int i2, int i3, int i4) {
        Object obj = A02.get();
        0qQ.A0A(obj);
        Rect rect = (Rect) obj;
        A01(rect, i, i2, i3, i4);
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(f / ((float) rect.width()), f2 / ((float) rect.height()));
        Matrix A002 = A01.get();
        A002.postTranslate(-((float) rect.left), -((float) rect.top));
        A002.postScale(max, max);
        A002.postScale(-1.0f, 1.0f, f / 2.0f, f2 / 2.0f);
        return A002;
    }
}
