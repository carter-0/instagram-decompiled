package X;

import android.view.animation.Interpolator;

/* renamed from: X.4jO  reason: invalid class name and case insensitive filesystem */
public abstract class C271664jO implements Interpolator {
    public final float A00 = (1.0f / 200.0f);
    public final float[] A01;

    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.A01;
        int min = Math.min((int) (200.0f * f), 199);
        float f2 = this.A00;
        float f3 = fArr[min];
        return f3 + (((f - (((float) min) * f2)) / f2) * (fArr[min + 1] - f3));
    }

    public C271664jO(float[] fArr) {
        this.A01 = fArr;
    }
}
