package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1UD  reason: invalid class name */
public final class AnonymousClass1UD extends AnonymousClass1U7 {
    public static final AnonymousClass1U5 A00 = new Object();

    public final String toString() {
        return "center";
    }

    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
    }
}
