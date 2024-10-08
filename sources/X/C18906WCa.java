package X;

import android.view.animation.Interpolator;

/* renamed from: X.WCa  reason: case insensitive filesystem */
public final class C18906WCa implements Interpolator {
    public final float A00;

    public final float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.A00;
        return (float) (1.0d + (pow * Math.sin(((((double) (f - (f2 / 4.0f))) * 3.141592653589793d) * 2.0d) / ((double) f2))));
    }

    public C18906WCa(float f) {
        this.A00 = f;
    }

    public C18906WCa() {
        this(0.5f);
    }
}
