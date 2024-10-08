package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1U9  reason: invalid class name */
public final class AnonymousClass1U9 extends AnonymousClass1U7 {
    public static final AnonymousClass1U5 A00 = new Object();

    public final String toString() {
        return "fit_y";
    }

    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float f5 = (float) rect.top;
        matrix.setScale(f4, f4);
        matrix.postTranslate((float) ((int) (((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f) + 0.5f)), (float) ((int) (f5 + 0.5f)));
    }
}
