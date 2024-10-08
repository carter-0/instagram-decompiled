package X;

import android.view.animation.Interpolator;

/* renamed from: X.8Ql  reason: invalid class name and case insensitive filesystem */
public final class C355558Ql implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
