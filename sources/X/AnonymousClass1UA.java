package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1UA  reason: invalid class name */
public final class AnonymousClass1UA extends AnonymousClass1U7 {
    public static final AnonymousClass1U5 A00 = new Object();

    public final String toString() {
        return "fit_start";
    }

    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float min = Math.min(f3, f4);
        float f5 = (float) rect.left;
        float f6 = (float) rect.top;
        matrix.setScale(min, min);
        matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
    }
}
