package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1UC  reason: invalid class name */
public final class AnonymousClass1UC extends AnonymousClass1U7 {
    public static final AnonymousClass1U5 A00 = new Object();

    public final String toString() {
        return "fit_end";
    }

    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float min = Math.min(f3, f4);
        float width = ((float) rect.left) + (((float) rect.width()) - (((float) i) * min));
        float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
        matrix.setScale(min, min);
        matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
    }
}
