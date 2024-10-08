package X;

import android.view.animation.Interpolator;

/* renamed from: X.3AJ  reason: invalid class name */
public final class AnonymousClass3AJ implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
