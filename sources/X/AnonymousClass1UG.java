package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1UG  reason: invalid class name */
public final class AnonymousClass1UG extends AnonymousClass1U7 {
    public static final AnonymousClass1U5 A00 = new Object();

    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float f5;
        float max;
        if (f4 > f3) {
            float f6 = ((float) i) * f4;
            f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f6), 0.0f), ((float) rect.width()) - f6);
            max = (float) rect.top;
            f3 = f4;
        } else {
            f5 = (float) rect.left;
            float f7 = ((float) i2) * f3;
            max = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f2 * f7), 0.0f), ((float) rect.height()) - f7) + ((float) rect.top);
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (max + 0.5f)));
    }

    public final String toString() {
        return "focus_crop";
    }
}
