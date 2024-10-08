package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1UF  reason: invalid class name */
public final class AnonymousClass1UF extends AnonymousClass1U7 {
    public static final AnonymousClass1U5 A00 = new Object();

    public final String toString() {
        return "center_crop";
    }

    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float f5;
        float height;
        if (f4 > f3) {
            f5 = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
            height = (float) rect.top;
            f3 = f4;
        } else {
            f5 = (float) rect.left;
            height = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
    }
}
