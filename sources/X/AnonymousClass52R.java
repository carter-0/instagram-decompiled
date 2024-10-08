package X;

import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.52R  reason: invalid class name */
public final class AnonymousClass52R extends AnonymousClass52S {
    public float A00;
    public int A01;

    public final float A07(DisplayMetrics displayMetrics) {
        float f;
        float applyDimension;
        0qQ.A0B(displayMetrics, 0);
        float f2 = this.A00;
        if (f2 <= 0.0f) {
            applyDimension = (float) displayMetrics.densityDpi;
            f = 25.0f;
        } else {
            f = 1.0f;
            RectF rectF = 0nA.A01;
            applyDimension = TypedValue.applyDimension(1, f2, displayMetrics);
        }
        return f / applyDimension;
    }

    public final int A09() {
        return -1;
    }

    public final int A0C(int i, int i2, int i3, int i4, int i5) {
        return (i3 - i) + this.A01;
    }
}
