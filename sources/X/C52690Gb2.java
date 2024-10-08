package X;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.Gb2  reason: case insensitive filesystem */
public final class C52690Gb2 implements TimeInterpolator {
    public final Interpolator A00 = new PathInterpolator(0.5f, 0.0f, 0.5f, 1.0f);

    public final float getInterpolation(float f) {
        if (f < 0.5f) {
            return this.A00.getInterpolation(f * 2.0f);
        }
        return 1.0f - this.A00.getInterpolation((f - 0.5f) * 2.0f);
    }
}
