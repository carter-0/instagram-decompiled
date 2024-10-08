package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1U8  reason: invalid class name */
public final class AnonymousClass1U8 extends AnonymousClass1U7 {
    public static final AnonymousClass1U5 A00 = new Object();

    public final String toString() {
        return "fit_x";
    }

    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float f5 = (float) rect.left;
        float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f);
        matrix.setScale(f3, f3);
        matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
    }
}
