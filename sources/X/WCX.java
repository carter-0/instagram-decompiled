package X;

import android.view.animation.Interpolator;

public final class WCX implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
